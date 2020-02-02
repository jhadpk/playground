package com.dj.practise.misc;

/**
 * @author deepakjha on 12/16/19
 * @project geeks-for-geeks
 */
public class Student implements Comparable<Student> {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public int compareTo(Student student) {
        //descending order
        if (student.rollNo > this.rollNo) {
            return 1;
        } else {
            return -1;
        }

        //ascending order
//        if (this.rollNo > student.rollNo) {
//            return 1;
//        } else {
//            return -1;
//        }
    }
}