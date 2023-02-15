package Lista_002;
import java.util.Scanner;
/*
    5. Escreva um programa Java que capture um número do usuário e 
    gere um inteiro entre 1 e 7 e exiba o nome do dia da semana
 */
public class Exercicio005 {
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe entre (1-7)");
        System.out.println("N°: ");
        int numero = entrada.nextInt();
        
        if(numero == 1)
        {
            System.out.println("Domingo");
            
        }else if(numero == 2)
        {
            System.out.println("Segunda-Feira");
            
        }else if(numero == 3)
        {
            System.out.println("Terça-Feira");
            
        }else if(numero == 4)
        {
            System.out.println("Quarta-Feira");
            
        }else if(numero == 5)
        {
            System.out.println("Quinta-Feira");
            
        }else if(numero == 6)
        {
            System.out.println("Sexta-Feira");
            
        }else if(numero == 7)
        {
            System.out.println("Sábado");
            
        }else{//Exceção
            System.out.println("Não existe essa opção");
        }
    }
    
}
