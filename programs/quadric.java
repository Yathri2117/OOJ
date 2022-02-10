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
        if(result==0)
        {
            double r=-b/(2*a);
            double r1=r;
            System.out.println(r+"\n"+r1);
            System.out.println("There is a real solutions!!\n Roots are equal");
        }
        else if(result>0){
            double r=(-b+Math.sqrt(result))/(2*a);
            double r1=(-b-Math.sqrt(result))/(2*a);
            System.out.println(r+"\n"+r1);
            System.out.println("There is a real solution!!\n Roots are real and distinct\n");
    }
        else
        {
            System.out.println("There is no real solution!!");
        }

    }
}
