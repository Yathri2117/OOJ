package com.company;
import java.util.*;

public class quadric {
    public static void main(String args[])
    {
        double a,b,c,result;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of a,b and c: ");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        result=(b*b)-(4*a*c);
        if(result<0)
        {
            System.out.println("There is no real solutions!!");
        }
        else
        {
            System.out.println("It has a real solution!!");
        }

    }
}
