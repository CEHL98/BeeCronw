package opensource.beeCrond.questoes;
import java.util.Scanner;

public class ProdutoSimples{
    
    public static void resolver(){
        Scanner input = new Scanner(System.in);
        int numero1, numero2, PROD;
        
        numero1 = input.nextInt();
        input.nextLine();
        numero2 = input.nextInt();
        PROD = numero1*numero2;
        
        System.out.println("PROD = "+PROD);
    }
}