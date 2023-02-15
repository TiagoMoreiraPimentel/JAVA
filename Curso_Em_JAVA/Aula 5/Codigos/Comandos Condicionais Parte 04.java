package Curso_Java;
import java.util.Scanner;
public class Comando_Condicionais04 {
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        //Faça 1 programa Java que verifique o Numero inteiro e retorne cursivamente via texto seu correspondente
        //Universo entre 1 á 20
        
        //variavel numero "=" recebe
        
        //numero recebe 0
        
        //Proposito é "Atribuir com antecedencia minhas variaveis, para poder usa-las no meu programa JAVA
        //int numero = 0;
        System.out.println("Informe o Numero entre 0-10 ");
        int numero = entrada.nextInt(); //cria a variavel e usa na mesma linha
        
        switch(numero) //1 ENTRADA 
        {
            //TENHO VARIAS SAIDAS
            case 1:     System.out.println("Um");       break;
            case 2:     System.out.println("Dois");     break;
            case 3:     System.out.println("Tres");     break;
            case 4:     System.out.println("Quatro");   break;
            case 5:     System.out.println("Cinco");    break;
            case 6:     System.out.println("Seis");     break;
            case 7:     System.out.println("Sete");     break;
            case 8:     System.out.println("Oito");     break;
            case 9:     System.out.println("Nove");     break;
            case 10:    System.out.println("Dez");      break;
            //Exceção
            default: System.out.println("Não existe no Universo entre 0-10!"); break;
        }
    }
    
}
