package com.dj.practise.misc.lrucache;

import java.util.HashMap;


/**
 * @author deepakjha on 12/19/19
 * @project playground
 */
public class LRUCache {
    
    static class MemoryBlock {
        int key;
        int data;

        MemoryBlock left;
        MemoryBlock right;

        public MemoryBlock(final int key, final int data) {
            this.key = key;
            this.data = data;
        }
    }
    
    private int capacity;
    private int itemsInCache;
    private MemoryBlock head = new MemoryBlock(-1, 0);
    private MemoryBlock tail = new MemoryBlock(-1, 0);

    private HashMap<Integer, MemoryBlock> cacheMap = new HashMap<>();


    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.head.right = tail;
        this.tail.left = head;
        this.itemsInCache = 0;
    }


    private void insertToCache(MemoryBlock memoryBlock) {
        if (itemsInCache == 0) {
            itemsInCache++;
        } else if (itemsInCache == capacity && !cacheMap.containsKey(memoryBlock.key)) {
            MemoryBlock lruLastNode = tail.left;
            MemoryBlock newLruLastNode = lruLastNode.left;
            newLruLastNode.right = tail;
            tail.left = newLruLastNode;
        } else {
            if (null != cacheMap.get(memoryBlock.key)) {
                MemoryBlock currentNode = cacheMap.get(memoryBlock.key);
                MemoryBlock currentLeftNode = currentNode.left;
                MemoryBlock currentRightNode = currentNode.right;
                currentLeftNode.right = currentRightNode;
                currentRightNode.left = currentLeftNode;
            } else {
                itemsInCache++;
            }
        }
        MemoryBlock currentFirstNode = head.right;
        memoryBlock.left = head;
        memoryBlock.right = currentFirstNode;
        currentFirstNode.left = memoryBlock;
        head.right = memoryBlock;
        cacheMap.put(memoryBlock.key, memoryBlock);
    }

    private void readCache(int key) {
        if (cacheMap.containsKey(key)) {
            //memory block referenced, move it to front.
            MemoryBlock referencedNode = cacheMap.get(key);
            MemoryBlock left = referencedNode.left;
            MemoryBlock right = referencedNode.right;
            left.right = right;
            right.left = left;

            MemoryBlock currentFirstNode = head.right;
            referencedNode.left = head;
            referencedNode.right = currentFirstNode;
            currentFirstNode.left = referencedNode;
            head.right = referencedNode;
        }
    }

    private void printCache() {
        MemoryBlock node = head.right;
        while (node.right != tail) {
            System.out.print(node.key + " - ");
            node = node.right;
        }
        System.out.print(node.key);
        System.out.println();
    }


    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(4);
        lruCache.insertToCache(new MemoryBlock(1, 1));
        lruCache.insertToCache(new MemoryBlock(2, 2));
        lruCache.insertToCache(new MemoryBlock(3, 3));
        lruCache.insertToCache(new MemoryBlock(4, 4));
        lruCache.printCache();
        lruCache.insertToCache(new MemoryBlock(2, 20));
        lruCache.printCache();
        lruCache.insertToCache(new MemoryBlock(5, 5));
        lruCache.printCache();
        lruCache.insertToCache(new MemoryBlock(6, 6));
        lruCache.printCache();
        lruCache.insertToCache(new MemoryBlock(4, 4));
        lruCache.printCache();
        lruCache.readCache(10);
        lruCache.printCache();
        lruCache.readCache(5);
        lruCache.printCache();
    }
}
