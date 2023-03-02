package opensource.beeCrond.questoes;

import java.util.Scanner;

public class SomaSimples{

    public static void resolver (){
        Scanner input = new Scanner (System.in);
        int A, B, SOMA;
        A = input.nextInt();
        input.nextLine();
        B = input.nextInt();
        SOMA = A+B;
        System.out.println("SOMA = "+SOMA);
    }
}