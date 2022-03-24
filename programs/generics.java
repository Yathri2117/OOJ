package com.company;

import java.util.Scanner;

class gen<T,V> {
    T ob1;
    V ob2;

    public gen(T s, V i) {
        ob1=s;
        ob2=i;
    }

    void setdata(T x, T y) {
        ob1 = x;
        ob2 = (V) y;
    }

    void showdata() {
        System.out.println("value 1 is :" +ob1.getClass().getName());
        System.out.println("value 2 is :" +ob2.getClass().getName());
    }

    T getob1() {
        return ob1;
    }

    V getob2() {
        return ob2;
    }
}
public class generics {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string value:");
        String s=sc.nextLine();
        System.out.println("Enter the integer value:");
        int i=sc.nextInt();
        System.out.println("Enter any double value:");
        double d=sc.nextDouble();
        System.out.println();
        gen<String,Integer>tgobj=new gen<String,Integer>(s,i);
        tgobj.showdata();
        String str=tgobj.getob1();
        System.out.println("Value of 1st Generics is : "+str);
        Integer in=tgobj.getob2();
        System.out.println("Value of 2nd Generics is"+in);
        gen<String,Double>tgob=new gen<String,Double>(s,d);
        tgob.showdata();
        String st=tgob.getob1();
        System.out.println("Value of 1st Generics is : "+st);
        Double dd=tgob.getob2();
        System.out.println("Value of 2nd Generics is :" +dd);
    }
}
