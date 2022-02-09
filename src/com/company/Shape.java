package com.company;

import java.util.Scanner;

abstract class shape {
    int a, b;
    abstract void printArea();
}
class triangle extends shape {
    void input(int x,int y){
        a=x;
        b=y;
    }
    @Override
    void printArea() {
        double area=0.5 * a * b;
        System.out.println("Area of Triangle is : " + area);
    }
}

class rectangle extends shape {
    void input(int x,int y){
        a=x;
        b=y;
    }

    @Override
    void printArea() {
        double area = a * b;
        System.out.println("Area of Rectangle is : " + area);
    }
}

class circle extends shape {
    void input(int x){
        a=x;
    }
    @Override
    void printArea() {
        double area = 3.14 * a * a;
        System.out.println("Area of Circle is : " + area);
    }
}

class shapes{
    public static void main(String[] args){
        System.out.println("Enter the value of a and b: ");
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        triangle ti=new triangle();
        rectangle re=new rectangle();
        circle cr=new circle();
        ti.input(a,b);
        ti.printArea();
        re.input(a,b);
        re.printArea();
        cr.input(a);
        cr.printArea();
    }
}
