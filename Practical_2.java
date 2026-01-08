package com;

import java.util.Scanner;

class Student
{
    final String COURSE_NAME = "Artificial Intelligence & Data Science";
    static int totalStudents = 0;

    String name;
    int id;
    int marks;
    char grade;

    Student()
    {
        name = "Not Assigned";
        id = 0;
        marks = 0;
        grade = 'N';
        totalStudents++;
    }

    Student(String name, int id, int marks)
    {
        this.name = name;
        this.id = id;
        this.marks = marks;
        this.grade = calculateGrade(marks);
        totalStudents++;
    }

    char calculateGrade(int marks)
    {
        if (marks >= 90)
            return 'A';
        else if (marks >= 75)
            return 'B';
        else if (marks >= 60)
            return 'C';
        else
            return 'D';
    }

    void display()
    {
        System.out.println("Course Name : " + COURSE_NAME);
        System.out.println("Student Name : " + name);
        System.out.println("Student ID : " + id);
        System.out.println("Marks : " + marks);
        System.out.println("Grade : " + grade);
        System.out.println("-----------------------------");
    }
}

public class Practical_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++)
        {
            System.out.println("\nEnter details for Student " + (i + 1));

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();
            sc.nextLine();

            students[i] = new Student(name, id, marks);
        }

        System.out.println("\n--- Student Performance Details ---");
        for (Student s : students)
        {
            s.display();
        }

        System.out.println("Total Students Created: " + Student.totalStudents);

        sc.close();
    }
}
