package Lista_002;
import java.util.Scanner;
public class Exercicio001 { 
    /*
        1. Escreva um programa Java para obter um número do usuário e imprimir se é positivo ou negativo
    */
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Numero: ");
        int numero = entrada.nextInt();
        
        //Cenário 01
        if(numero > 0)
        {
            System.out.println("Numero é Positivo");
        }
        //Cenário 02
        else if(numero < 0)
        {
            System.out.println("Numero é Negativo");
        }
        //Cenário 03
        else
        {
            System.out.println("Numero é Zero");
            System.out.println("Numero Zero é Neutro (Nâo Negativo e Não Positivo)");
        }
    }
    
}
