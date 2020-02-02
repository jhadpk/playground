package com.dj.practise.leetcode.others;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


/**
 * @author deepakjha
 * @project playground
 */
public class InterviewProblem {

    private static HashMap<String, String> visitedMap = new LinkedHashMap<>();
    private int threshold = 3;

    private void visitedUrl(String url) {
        if (!visitedMap.containsKey(url)) {
            if (visitedMap.size() < threshold) {
                visitedMap.put(url, url);
            } else {
                Map.Entry<String, String> entry = visitedMap.entrySet().iterator().next();
                visitedMap.remove(entry.getKey());
                visitedMap.put(url, url);
            }
        } else {
            //for (Map.Entry<String, String> e : visitedMap.entrySet()) {
            //    if (e.getKey().equals(url)) {
            //        visitedMap.remove(e.getKey());
            //        break;
            //    }
            //}
            visitedMap.put(url, url);
        }
    }

    private boolean isVisitedUrl(String url) {
        return visitedMap.containsKey(url);
    }


        public static void main(String[] args) {
        new InterviewProblem().visitedUrl("a");
        new InterviewProblem().visitedUrl("b");
        new InterviewProblem().visitedUrl("c");
        new InterviewProblem().visitedUrl("d");
        new InterviewProblem().visitedUrl("e");
        new InterviewProblem().visitedUrl("c");

        for (Map.Entry<String, String> entry : visitedMap.entrySet()) {
            System.out.println(entry.getKey());
        }
            System.out.println(new InterviewProblem().isVisitedUrl("a"));
    }
}
