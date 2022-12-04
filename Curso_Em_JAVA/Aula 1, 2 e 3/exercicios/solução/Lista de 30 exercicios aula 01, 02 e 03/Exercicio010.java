package ListaExercicios_001;
import java.util.Scanner;
/**
 *

    10. Escreva um programa Java que receba cinco números como entrada para calcular e imprimir a média dos números.
 */
public class Exercicio010 {
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Numero 01");
        int num01 = entrada.nextInt();
        System.out.println("Numero 02");
        int num02 = entrada.nextInt();
        System.out.println("Numero 03");
        int num03 = entrada.nextInt();
        System.out.println("Numero 04");
        int num04 = entrada.nextInt();
        System.out.println("Numero 05");
        int num05 = entrada.nextInt();
        
        int media = (num01 + num02 + num03 + num04 + num05) / 5;
        
        System.out.println("Media: " + media);
    }
    
}
