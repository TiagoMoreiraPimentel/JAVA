package ListaExercicios_001;
import java.util.Scanner;
/**
 *
6. Escreva um programa Java para imprimir a soma (adição), multiplicar, subtrair, dividir e o resto de dois números
 */
public class Exercicio006 {
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("1° Numero: ");
        int num1 = entrada.nextInt();
        
        System.out.println("2° Numero: ");
        int num2 = entrada.nextInt();
        
        int soma = (num1 + num2);
        
        int multiplicacao = (num1 * num2);
        
        int subtracao = (num1 - num2);
        
        int divisao = (num1 / num2);
        
        int resto = (num1 % num2);
        
        System.out.println("Soma: " + soma);
        System.out.println("Multiplicacao: " + multiplicacao);
        System.out.println("Subtracao: " + subtracao);
        System.out.println("Divisao: " + divisao);
        System.out.println("Resto: " + resto);
    }
    
}
