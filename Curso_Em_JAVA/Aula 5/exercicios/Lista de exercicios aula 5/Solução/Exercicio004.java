package Lista_002;
import java.util.Scanner;
/*
    4. Escreva um programa Java que leia um número de ponto flutuante e imprima 
    "zero" se o número for zero. Caso contrário, imprima "positivo" ou "negativo". 
    Adicione "pequeno" se o valor absoluto do número for menor que 1 ou "grande" 
    se exceder 1.000000
 */
public class Exercicio004 {
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com o Valor: ");
        double valor = entrada.nextDouble();
                
        if(valor > 0)
        {
            if(valor < 1)
            {
                System.out.println("Numero Positivo menor");
            }
            else if(valor > 1000000)
            {
                System.out.println("Numero Positivo maior");
            }
            else
            {
                System.out.println("Numero Positivo");
            }
        }else if(valor < 0)
        {
            //math.abs: arrendonda o valor
            if(Math.abs(valor) < 1)
            {
                System.out.println("Numero negativo menor");
            }
            else if(Math.abs(valor) > 1000000)
            {
                System.out.println("Numero negativo maior");
            }
            else
            {
                System.out.println("Numero negativo");
            }
        }
        else
        {
            //Neutro
            System.out.println("Zero");
        }
        
    }
}
