package Lista_002;
import java.util.Scanner;
/*
    8. Escreva um programa Java que leve o usuário a fornecer um único 
    caractere do alfabeto. Imprima vogal ou consoante, dependendo da 
    entrada do usuário. Se a entrada do usuário não for uma letra 
    (entre a e z ou A e Z), ou for uma string de comprimento > 1
 */
public class Exercicio008 {
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("ENtre com uma letra do Alfabeto");
        String letra  = entrada.next().toLowerCase(); //converto para minusculo
        
        boolean maiusculo = letra.charAt(0) >= 65 && letra.charAt(0) <= 90;
        boolean minusculo = letra.charAt(0) >= 97 && letra.charAt(0) <= 122;
        boolean vogais = letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u");
        
        //se
        //se letra.tamanho total for maior que 1
        if(letra.length() > 1)
        {
            System.out.println("Erro. Não é uma letra. Entre com uma letra maiuscula ou minuscula");
        }
        else if(!(maiusculo || minusculo))
        {
            System.out.println("Erro. Não é uma letra.  Entre com uma letra Maiuscula ou Minuscula");
        }
        else if(vogais)
        {
            System.out.println("Entrada é uma Vogal");
        }
        else
        {
            System.out.println("Entrada é uma CONSOANTE");
        }
    }
}
