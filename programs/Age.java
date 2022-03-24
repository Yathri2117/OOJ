package com.company;

import java.util.Scanner;
class fatherAgeException extends Exception{
    @Override
    public String toString() {
        return ("Father age is less than 0 Exception!");
    }
}
class sonAgeException extends Exception{
    int a;
sonAgeException(int age){
    a=age;
}

    @Override
    public String toString() {
        if (a < 0) {
            return ("Son's age is less than 0 Exception!");
        }
        else{
            return ("Son's age is more than father's age Exception!");
        }
    }
}

class father{
    Scanner sc=new Scanner(System.in);
    int agef;
    father(){
        System.out.println("Enter the father's age:");
        agef=sc.nextInt();
    }
    void expection1() throws fatherAgeException{
        if(agef<=0)
            throw new fatherAgeException();
    }
}
class son extends father {
    Scanner s = new Scanner(System.in);
    int ages;

    son() {
        System.out.println("Enter the son's age:");
        ages = sc.nextInt();
    }

    void exception2() throws sonAgeException {
        if (ages <= 0 || ages > super.agef) {
            throw new sonAgeException(ages);
        }
    }
}
public class Age {
    public static void main(String args[]) {
        son ob = new son();
        {
            try {
                ob.expection1();
            }
            catch (fatherAgeException e){
                System.out.println(e);
            }
            try{
                ob.exception2();
            }
            catch (sonAgeException e){
                System.out.println(e);
            }
        }
    }
}
