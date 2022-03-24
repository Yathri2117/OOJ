package SEE;
import CIE.*;

import java.util.Scanner;

public class external extends CIE.student {
    public void acceptmarks(){
        float total=0;
        int j;
        Scanner sc = new Scanner(System.in);
        float[] marks = new float[6];
            for (j = 1; j <= 5; j++) {
                System.out.println("Enter the SEE marks of the Subject:\t"+j+":\t");
                marks[j] = sc.nextInt();
            }
        for ( int i = 1; i <= 5; i++) {
            total= total + marks[i];
        }
        System.out.println("Total marks of is SEE is:\t"+total);
    }
}

