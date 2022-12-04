package ListaExercicios_001;

import java.util.Scanner; //biblioteca que captura os dados
/**
    5. Escreva um programa Java que receba dois números como entrada e exiba o produto de dois números
 */
public class Exercicio005 {
    
    public static void main(String[] args)
    {
        //instancio a classe
        Scanner entrada = new Scanner(System.in);
        
        //Crio as variaveis
        int valor01, valor02;
        //Capturo do usuario
        System.out.println("Valor 01: ");
        valor01 = entrada.nextInt();
        System.out.println("Valor 02: ");
        valor02 = entrada.nextInt();
        
        //realizar a operacao do produto
        int produto = (valor01 * valor02);
        
        System.out.println("Produto : " + produto);
    }
}
