package edu.sbs.cs;

public class Student {
    public String name;
    public int age;

    public Student(String name, int age) {}

    public static void main(String[] args) {
        Student student = new Student("John Smith", 18);
        System.out.println(student);
        System.out.println(args[0]);
    }
}
