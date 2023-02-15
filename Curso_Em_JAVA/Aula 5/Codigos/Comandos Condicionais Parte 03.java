package Curso_Java;
import java.util.Scanner;
public class Comando_Condicionais03 {
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        //Faça 1 programa Java que verifique o Numero inteiro e retorne cursivamente via texto seu correspondente
        //Universo entre 0 á 10
        
        int numeros = 0;
        
        System.out.println("Informe o numero");
        numeros = entrada.nextInt();
        
        //IF ENCADEADO
        if(numeros == 0)
        {
            System.out.println("Zero");
            
        } else if(numeros == 1)
        {
             System.out.println("Um");
             
        } else if(numeros == 2)
        {
            System.out.println("Dois");
            
        } else if(numeros == 3)
        {
            System.out.println("Tres");
            
        }else if(numeros == 4)
        {
            System.out.println("Quatro");
            
        }else if(numeros == 5)
        {
            System.out.println("Cinco");
            
        }else if(numeros == 6)
        {
            System.out.println("Seis");
            
        }else if(numeros == 7)
        {
            System.out.println("Sete");
            
        }else if(numeros == 8)
        {
            System.out.println("Oito");
            
        }else if(numeros == 9)
        {
            System.out.println("Nove");
            
        }else if(numeros == 10)
        {
            System.out.println("Dez");
        }
        else //tratar exceção
        {
            System.out.println("Não existe no Universo entre 0-10 ");
        }
               
    }
    
}
