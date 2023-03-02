package opensource.beeCrond.questoes;
import java.util.Scanner;
public class ExtremamenteFacil {

   
    public static void resolver(){

        int A,B,X;
        Scanner input = new Scanner (System.in);
        A = input.nextInt();
         input.nextLine();
        B = input.nextInt();
        X = A+B;
        System.out.println ("X = "+X);
        input.close();

    }
}