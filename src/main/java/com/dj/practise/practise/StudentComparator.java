package com.dj.practise.practise;

import java.util.Comparator;

/**
 * @author deepakjha on 12/16/19
 * @project geeks-for-geeks
 */
public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        //descending order
        if (s2.rollNo > s1.rollNo) {
            return 1;
        } else if (s2.rollNo < s1.rollNo){
            return -1;
        } else {
            return 0;
        }

        //ascending order
//        if (s1.rollNo > s2.rollNo) {
//            return 1;
//        } else if (s1.rollNo < s2.rollNo){
//            return -1;
//        } else {
//            return 0;
//        }
    }
}
