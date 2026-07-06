package Staj4.java;

public class staj {
    public static void main(String[] args) {

        System.out.println("Day 4 - Classes, Objects, Constructor and Return Methods");
        System.out.println("---------------------------------------------------------");

        Student student1 = new Student("Batuhan", 22, 85);
        Student student2 = new Student("Arda", 21, 45);

        System.out.println("First Student:");
        System.out.println(student1.getInfo());
        System.out.println("Passed: " + student1.isPassed());
        System.out.println("Letter Grade: " + student1.getLetterGrade());

        System.out.println();

        System.out.println("Second Student:");
        System.out.println(student2.getInfo());
        System.out.println("Passed: " + student2.isPassed());
        System.out.println("Letter Grade: " + student2.getLetterGrade());
    }
}

class Student {

    private String name;
    private int age;
    private int grade;

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGrade() {
        return grade;
    }

    public String getInfo() {
        return "Name: " + name + "\nAge: " + age + "\nGrade: " + grade;
    }

    public boolean isPassed() {
        if (grade >= 50) {
            return true;
        } else {
            return false;
        }
    }

    public String getLetterGrade() {
        if (grade >= 90) {
            return "AA";
        } else if (grade >= 80) {
            return "BA";
        } else if (grade >= 70) {
            return "BB";
        } else if (grade >= 60) {
            return "CB";
        } else if (grade >= 50) {
            return "CC";
        } else {
            return "FF";
        }
    }
}