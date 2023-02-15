package Lista_002;
import java.util.Scanner;
/*
    9. Escreva um programa Java que leve um ano do usuário e imprima se esse ano é bissexto ou não.
 */
public class Exercicio009 {
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Entre com o Ano: ");
        int ano = entrada.nextInt();
        
        boolean x = (ano % 4) == 0;
        boolean y = (ano % 100) != 0;
        boolean z = ((ano % 100 == 0) && (ano % 400 == 0));
        
        if(x && (y || z))//precedencia de operadores
        {
            System.out.println(ano + " é Ano Bissexto");
        }
        else
        {
            System.out.println(ano + "Não é Bissexto!");
        } 
    }
}
