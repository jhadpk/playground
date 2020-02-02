package com.dj.practise.misc;

import java.util.ArrayList;
import java.util.List;

/**
 * @author deepakjha on 12/16/19
 * @project geeks-for-geeks
 */
public class ComparatorExample {

    public static void main(String[] args) {

        Student s1 = new Student(10, "DJ10");
        Student s2 = new Student(5, "DJ5");
        Student s3 = new Student(14, "DJ14");
        Student s4 = new Student(12, "DJ15");

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

//        Collections.sort(students);
        students.sort(new StudentComparator());

        for (Student s : students) {
            System.out.println(s.rollNo);
        }






    }
}
