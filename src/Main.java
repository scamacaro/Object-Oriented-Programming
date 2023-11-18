/*
 Sanyerlis Camacaro - Sanyerliscamacaro@uat.edu - CSC263
 Assignment 1.1: Object-Oriented Programming

 Guidelines:
 Write a Java program that satisfies the four principles of Object-Oriented Programming.
 Your minimum program should have one parent class and three children's classes.
 Comment on your code showing that you satisfied these four principles.

 This program models a scenario with people, including people, students, teachers, and employees.
 It prompts the user to enter their name and demonstrates polymorphism by calling the `introduceYourself`
 method on objects of different classes.

 Additionally, each child class has methods specific to their role, such as 'study' for students, `teach` for teachers,
 and `work` for employees.
 */
import java.util.Scanner;

// Principle 1: Encapsulation
// Encapsulate related data and methods within a class.

// Parent Class - Person
class Person {
    private String name;  // Encapsulation: private field.

    // Constructor to set the name
    Person(String name) {
        this.name = name;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Encapsulation: Displaying information through a method.
    void introduceYourself() {
        System.out.println("Hello, I'm " + name);
    }
}

// Principle 2: Inheritance
// Create child classes that inherit from the parent class.

// Child Class 1 - Student
class Student extends Person {
    Student(String name) {
        super(name);
    }

    // Overriding the introduceYourself method for polymorphism.
    @Override
    void introduceYourself() {
        System.out.println("Hello, I'm " + getName() + " ,and I'm a student.");
    }

    // Additional method specific to Student - Studying.
    void study() {
        System.out.println(getName() + " is studying.");
    }
}

// Child Class 2 - Teacher
class Teacher extends Person {
    Teacher(String name) {
        super(name);
    }

    // Overriding the introduceYourself method for polymorphism.
    @Override
    void introduceYourself() {
        System.out.println("Hello, I'm " + getName() + " ,and I'm a teacher.");
    }

    // Additional method specific to Teacher - Teach.
    void teach() {
        System.out.println(getName() + " is teaching.");
    }
}

// Child Class 3 - Employee.
class Employee extends Person {
    Employee(String name) {
        super(name);
    }

    // Overriding the introduceYourself method for polymorphism.
    @Override
    void introduceYourself() {
        System.out.println("Hello, I'm " + getName() + " ,and I'm an employee.");
    }

    // Additional method specific to Employee - Working.
    void work() {
        System.out.println(getName() + " is working.");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Introduction
        System.out.println("\nWelcome to the Object Oriented Programming Demo by Sanyerlis Camacaro!");
        System.out.println("\nThis program demonstrates the four principles of Object-Oriented Programming.");
        System.out.println("\nThis program models a scenario with people, including people, students, teachers, and employees.");
        System.out.println("It prompts the user to enter their name.");
        System.out.println("\nWe hope you enjoy this demo.");

        // Prompt user to enter their name for each role
        System.out.print("\nEnter your name as a person: ");
        String personName = scanner.nextLine();

        System.out.print("Enter your name as a student: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter your name as a teacher: ");
        String teacherName = scanner.nextLine();

        System.out.print("Enter your name as an employee: ");
        String employeeName = scanner.nextLine();

        // Creating objects of different classes with user-specific names.
        Person person = new Person(personName);  // Encapsulation: Constructor
        Student student = new Student(studentName);
        Teacher teacher = new Teacher(teacherName);
        Employee employee = new Employee(employeeName);

        // Using polymorphism to call introduceYourself method/
        // Abstraction: Interaction through abstracted methods.
        person.introduceYourself();  // Polymorphism: Same method name in parent and child classes.
        student.introduceYourself();
        teacher.introduceYourself();
        employee.introduceYourself();

        // Demonstrate additional methods.
        student.study();
        teacher.teach();
        employee.work();

        scanner.close();
    }
}

