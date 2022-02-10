package com.company;

import java.util.Scanner;

public class Student {
    String name, usn;
    int[] credits;
    double marks[],  cpoints = 0,sgpa=0;
    int n, tcredits = 0;
    void accept() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Name of the Student : ");
        name = in.nextLine();
        System.out.println("Enter the USN of the Student : ");
        usn = in.nextLine();
        System.out.println("Enter no of Subjects : ");
        n = in.nextInt();
        credits = new int[n];
        marks=new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the credits of the subject:" + (i + 1));
            credits[i] = in.nextInt();
            System.out.println("Enter the marks of the subject:" + (i + 1));
            marks[i] = in.nextDouble();
        }
    }
    void cal() {
        for (int i = 0; i < n; i++) {
            tcredits = tcredits + credits[i];
        }
        for (int i = 0; i < n; i++) {
            if (marks[i] >= 90 && marks[i] <= 100) {
                cpoints = cpoints + (credits[i] * 10);
            } else if (marks[i] >= 80 && marks[i] <= 90) {
                cpoints = cpoints + (credits[i] * 9);
            } else if (marks[i] >= 70 && marks[i] <= 80) {
                cpoints = cpoints + (credits[i] * 8);
            } else if (marks[i] >= 60 && marks[i] <= 70) {
                cpoints = cpoints + (credits[i] * 7);
            } else if (marks[i] >= 50 && marks[i] <= 60) {
                cpoints = cpoints + (credits[i] * 6);
            } else if (marks[i] >= 45 && marks[i] <= 50) {
                cpoints = cpoints + (credits[i] * 5);
            } else if (marks[i] >= 40 && marks[i] <= 45) {
                cpoints = cpoints + (credits[i] * 4);
            } else {
                System.out.println("You failed in this Subject : "+(i+1));
            }
        }
    }
    void sgpa(){
        for(int i=0;i<n;i++){
            sgpa=(cpoints/tcredits);
        }
    }
    void display(){
        System.out.println("Name:\t"+name);
        System.out.println("USN:\t"+usn);
        for(int i=0;i<n;i++){
            System.out.println("Credits:\t"+credits[i]);
            System.out.println("Marks:\t"+marks[i]);
        }
        System.out.println("Total credits : "+tcredits);
        System.out.println("Total Credits Points : "+cpoints);
        System.out.println("Total SGPA is : "+sgpa);
    }
    public static void main(String[] args){
        Student st=new Student();
        st.accept();
        st.cal();
        st.sgpa();
        st.display();
    }
}

