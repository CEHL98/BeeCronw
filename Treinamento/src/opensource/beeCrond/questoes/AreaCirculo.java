package opensource.beeCrond.questoes;

import java.util.Scanner;

public class AreaCirculo {
    public static void resolver (){
        double raio, area;
        Scanner input = new Scanner(System.in);
        final double pi = 3.14159;
        raio = input.nextDouble();
        area = pi * raio*raio;
        System.out.printf("A = %.4f",area);

    }
}
