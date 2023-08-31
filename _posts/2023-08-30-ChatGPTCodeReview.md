---
toc: true
comments: true
layout: post
title: ChatGPT Code Review
description: I asked ChatGPT if my code meet the AP Standards for the CPT
courses: { csa: {week: 2} }
type: tangibles
---

The code you provided is a Java program that simulates a classroom management system. It allows the user to view student data, add new students, and edit existing students. The program meets the following AP requirements for the Create Performance Task:

- Unique Algorithm: The program uses a unique algorithm to calculate the letter grade of a student based on their percent grade. This is done using the `calculateLetterGrade` method, which takes in a percent grade as an input and returns the corresponding letter grade based on the `gradeCutoffs` array.
```java
public static char calculateLetterGrade(double percentGrade) {
    if (percentGrade >= gradeCutoffs[0]) {
        return 'A';
    } else if (percentGrade >= gradeCutoffs[1]) {
        return 'B';
    } else if (percentGrade >= gradeCutoffs[2]) {
        return 'C';
    } else if (percentGrade >= gradeCutoffs[3]) {
        return 'D';
    } else {
        return 'F';
    }
}
```

- Abstraction: The program uses abstraction by defining a Student class that contains instance variables and methods to represent and manipulate student data. This allows for easier management of student data and makes the code more readable and maintainable.

```java
public class Student {
    private String first;
    private String last;
    private int period;
    private double percentGrade;
    private char letterGrade;

    public Student(String first, String last, int period, double percentGrade) {
        this.first = first;
        this.last = last;
        this.period = period;
        this.percentGrade = percentGrade;
        this.letterGrade = calculateLetterGrade(this.percentGrade);
        students.add(this);
    }

    //Setters + Getters
    public String getFirst() { return first; }
    public void setFirst(String first) { this.first = first; }
    public String getLast() { return last; }
    public void setLast(String last) { this.last = last; }
    public int getPeriod() { return period; }
    public void setPeriod(int period) { this.period = period; }
    public double getPercentGrade() { return percentGrade; }
    public void setPercentGrade(double percentGrade) {
        this.percentGrade = percentGrade;
        this.letterGrade = calculateLetterGrade(this.percentGrade);
    }
    public char getLetterGrade() { return letterGrade; }
}
```

- Data: The program uses data structures such as arrays and ArrayLists to store and manipulate data. For example, the gradeCutoffs array is used to store the cutoff values for each letter grade, and the students ArrayList is used to store a list of Student objects.

```java
static int[] gradeCutoffs = {90, 80, 70, 60};
public ArrayList<Student> students = new ArrayList<>();
```

- Control Structures: The program uses control structures such as if statements, switch statements, and loops to control the flow of the program. For example, the while loop in the main method allows the user to repeatedly perform actions until they choose to quit.

```java
while (running) {
    System.out.println("Press 1 to view student data, 2 to add a new student, 3 to edit a student, or 4 to quit.");
    int choice = scanner.nextInt();
    switch (choice) {
        case 1:
            System.out.println(generateTextTable(classroom.students));
            break;
        case 2:
            System.out.println("First Name?");
            String first = scanner.next();
            System.out.println("Last Name?");
            String last = scanner.next();
            System.out.println("Period?");
            int period = scanner.nextInt();
            System.out.println("Grade(Percent)?");
            double percentGrade = scanner.nextDouble();
            Student newStudent = classroom.new Student(first, last, period, percentGrade);
            break;
        case 3:
            System.out.println("Index of student?");
            int index = scanner.nextInt();
            if (index >= 0 && index < classroom.students.size()) {
                Student studentToEdit = classroom.students.get(index);
                System.out.println("New First Name?(or skip for no change)");
                String newFirst = scanner.next();
                if (!newFirst.equals("skip")) {
                    studentToEdit.setFirst(newFirst);
                }
                System.out.println("New Last Name?(or skip for no change)");
                String newLast = scanner.next();
                if (!newLast.equals("skip")) {
                    studentToEdit.setLast(newLast);
                }
                System.out.println("New Period?(or -1 for no change)");
                int newPeriod = scanner.nextInt();
                if (newPeriod != -1) {
                    studentToEdit.setPeriod(newPeriod);
                }
                System.out.println("New Percent Grade?(or -1 for no change)");
                double newPercentGrade = scanner.nextDouble();
                if (newPercentGrade != -1) {
                    studentToEdit.setPercentGrade(newPercentGrade);
                }
            } else {
                System.out.println("Index does not represent a student. Try checking the table.");
            }
            break;
        case 4:
            running = false;
            break;
        default:
            System.out.println("Invalid Input");
    }
}
```

In conclusion, this program meets all of requirements for the CollegeBoard create performance task.