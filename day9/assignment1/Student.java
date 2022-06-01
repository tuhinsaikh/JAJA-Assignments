package com.assignment1;

public class Student {
    private int roll;
    private  String name;
    private int marks;
    private char grade;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    void display_details(){
            System.out.println("Student roll is "+getRoll());
            System.out.println("Student Name is "+getName());
            System.out.println("Student marks is "+getMarks());
            calculatgrade(getMarks());
            System.out.println("Student Grade is "+getGrade());

    }
    void calculatgrade(int marks){
        if(marks>=500){
            setGrade('A');
        }
        else if(marks<500 && marks>=400){
            setGrade('B');
        }else if(marks<400){
            setGrade('C');
        }
    }
    Student(int roll,String name,int marks){
        this.roll=roll;
        this.name=name;
        this.marks=marks;

    }
    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", marks=" + marks +

                '}';
    }

    public static void main(String[] args) {
        Student s2=new Student(10,"tuhin",500);
        System.out.println(String.valueOf(s2));

    }
}
