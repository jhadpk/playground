package com.dj.practise.misc;


import java.util.LinkedList;

/**
 * @author deepakjha on 1/11/20
 * @project playground
 */
public class HashTable {

    public class HashTableObject {
        public String key;
        public int value;
    }

    private int ARR_SIZE = 128;
    private LinkedList<HashTableObject>[] arr = new LinkedList[ARR_SIZE];

    public HashTable() {
        for (int i = 0; i < ARR_SIZE; i++) {
            arr[i] = null;
        }
    }

    public HashTableObject getObj(final String key) {
        final int index = key.hashCode() % ARR_SIZE;
        LinkedList<HashTableObject> list = arr[index];
        if (list == null) return null;
        for (HashTableObject obj : list) {
            if (obj.key.equals(key)) {
                return obj;
            }
        }
        return null;
    }

    public Integer get(final String key) {
        HashTableObject result = getObj(key);
        if (result == null) {
            return null;
        } else {
            return result.value;
        }
    }

    public void put(String key, Integer value) {
        final int index = key.hashCode() % ARR_SIZE;
        LinkedList<HashTableObject> list = arr[index];
        if (list == null || list.size() == 0) {
            list = new LinkedList<>();
            HashTableObject ht = new HashTableObject();
            ht.key = key;
            ht.value = value;
            list.add(ht);
            arr[index] = list;
        } else {
            for (HashTableObject obj : list) {
                if (obj.key.equals(key)) {
                    obj.value = value;
                    return;
                }
            }
            HashTableObject ht = new HashTableObject();
            ht.key = key;
            ht.value = value;
            list.add(ht);
        }
    }

    public void remove(final String key) {
        int index = key.hashCode() % ARR_SIZE;
        LinkedList<HashTableObject> list = arr[index];

        if (list == null || list.size() == 0) {
            return;
        }

        for (HashTableObject ht : list) {
            if (ht.key.equals(key)) {
                list.remove(ht);
                return;
            }
        }


    }
}
