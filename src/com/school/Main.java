package com.school; 
public class Main {
    public static void main(String[] args) {
        System.out.println("==== School Attendance System ====");

        System.out.println("Creating Students and Courses using Constructors:");
        Student student1 = new Student("Mannat");
        Student student2 = new Student("Harsh");

        Course course1 = new Course("Python");
        Course course2 = new Course("DBMS");

        System.out.println("\nRegistered Students:");
        student1.displayDetails();
        student2.displayDetails();

        System.out.println("\nAvailable Courses:");
        course1.displayDetails();
        course2.displayDetails();

        System.out.println("\n== Auto-ID Generation Test ==");
        System.out.println("Creating one more student and course...");
        Student student3 = new Student("Krishan");
        Course course3 = new Course("OOP");

        System.out.println("\nNew Student:");
        student3.displayDetails();

        System.out.println("New Course:");
        course3.displayDetails();

        System.out.println("\nSession 3: Constructor Initialization & Auto-ID Generation Complete.");
    }
}