package ListaExercicios_001;
import java.util.Scanner;
/**
    28. Escreva um programa Java que aceite duas variáveis duplas e teste se ambas estritamente entre 0 e 1 e false caso contrário
 */
public class Exercicio028 {
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com o primeiro num:");
        double n1 = entrada.nextDouble();
        System.out.println("Entre com o segundo num:");
        double n2 = entrada.nextDouble();
        
        //Estrutura condicional IF dentro da Console
        System.out.println(n1 > 0 && n1 < 1 && n2 > 0 && n2 < 1);
    }
    
}
