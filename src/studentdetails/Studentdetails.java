/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Studentdetails;

/**
 * Represents a student with their details.
 */
class Student {
    String name;
    int age;
    String grade;

    // Constructor
    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println();
    }
}

public class Studentdetails {

    public static void main(String[] args) {
        // Creating student objects
        Student student1 = new Student("John", 18, "A");
        Student student2 = new Student("Emily", 17, "B");
        Student student3 = new Student("Michael", 19, "A+");

        // Displaying student details
        System.out.println("Student Details:");
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
    }
}

