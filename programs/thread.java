package com.company;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.beans.IntrospectionException;

class first extends Thread {
    public void run() {
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("This is first Thread:\n'BMS COLLEGE OF ENGINNERING'");
        }
    }
}
class second extends Thread {
    public void run() {
        for (int j = 0; j < 10; j++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("This is second thread:\n'CSE'");
        }
    }
}
public class thread {
    public static void main(String[] args){
        new first().start();
        new second().start();
    }
}
