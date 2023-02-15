package Lista_002;
import java.util.Scanner;
/*
    6. Escreva um programa Java que leia dois números de ponto flutuante
    e teste se eles são iguais até três casas decimais.
 */
public class Exercicio006 {
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Entre com 1° N° ponto Flutuante: ");
        double x = entrada.nextDouble();
        System.out.println("Entre com o 2° N° ponto Flutuante: ");
        double y = entrada.nextDouble();
        
        x = Math.round(x * 1000); //arredondo até 3 casas decimais
        x = x / 1000;
        
        //x = 1.000
        //y = 1.000
        
        y = Math.round(y * 1000); //arredondo até 3 casas decimais
        y = y / 1000;
        
        //se x for igual á y
        //verdadeiro
        if(x == y)
        {
            System.out.println("Eles são igual em tres casas decimais");
        }
        //falso
        else   
        {
            System.out.println("Eles não são iguais");
        }
    }
    
}
