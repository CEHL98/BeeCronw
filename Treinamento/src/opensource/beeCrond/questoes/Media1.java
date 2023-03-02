package opensource.beeCrond.questoes;

import java.util.Scanner;

public class Media1 {
    public static void resolver() { 
        Double A, B, MEDIA;
        Scanner input = new Scanner (System.in);
        A = input.nextDouble();
        B =input.nextDouble();
        MEDIA = (A*3.5 + B*7.5)/11;
        System.out.printf("MEDIA = %.5f%n", MEDIA);
    }

    
}
