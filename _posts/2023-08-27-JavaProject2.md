---
toc: true
comments: true
layout: post
title: Java Classroom
courses: { csa: {week: 0} }
type: tangibles
---

    import java.util.ArrayList;
    import java.util.Scanner;

    public class Classroom {
        static int[] gradeCutoffs = {90, 80, 70, 60};
        public ArrayList<Student> students = new ArrayList<>();

        public static void main(String[] args) {
            Classroom classroom = new Classroom();
            Student test = classroom.new Student("Colin", "Weis", 1, 100.0);
            Scanner scanner = new Scanner(System.in);
            boolean running = true;

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
            scanner.close();
        }

        //Create Student class
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
            public String getFirst() {
                return first;
            }

            public void setFirst(String first) {
                this.first = first;
            }

            public String getLast() {
                return last;
            }

            public void setLast(String last) {
                this.last = last;
            }

            public int getPeriod() {
                return period;
            }

            public void setPeriod(int period) {
                this.period = period;
            }

            public double getPercentGrade() {
                return percentGrade;
            }

            public void setPercentGrade(double percentGrade) {
                this.percentGrade = percentGrade;
                this.letterGrade = calculateLetterGrade(this.percentGrade);
            }

            public char getLetterGrade() {
                return letterGrade;
            }
        }

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

        public static String generateTextTable(ArrayList<Student> students) {
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("%-10s %-10s %-10s %-10s %-10s%n", "First", "Last", "Period", "Percent", "Letter"));
            for (Student student : students) {
                sb.append(String.format("%-10s %-10s %-10d %-10.2f %-10c%n", student.getFirst(), student.getLast(), student.getPeriod(), student.getPercentGrade(), student.getLetterGrade()));
            }
            return sb.toString();
        }
    }
    Classroom.main(null);
