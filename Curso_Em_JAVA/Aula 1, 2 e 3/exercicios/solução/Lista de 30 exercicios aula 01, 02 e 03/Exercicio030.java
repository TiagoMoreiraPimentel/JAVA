package ListaExercicios_001;
import java.util.Scanner;
/*
    30. Escreva um programa Java que leia um número em polegadas e o converta em metros.
 */
public class Exercicio030 {
    
   public static void main(String[] args)
   {
       Scanner entrada = new Scanner(System.in);
       
       System.out.println("Insira um valor para polegada: ");
       double polegadas = entrada.nextDouble();
       double metros = polegadas * 0.0254;
       
       System.out.println(polegadas + " polegadas é: " + metros + " metros");
   }
    
}
