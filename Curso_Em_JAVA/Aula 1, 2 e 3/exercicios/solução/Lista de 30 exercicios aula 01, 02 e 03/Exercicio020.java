package ListaExercicios_001;
import java.util.*;
/**
    20. Escreva um programa Java que aceite três valores inteiros e retorne true se um deles for 20 
    * ou mais e menor que as subtrações dos outros.
 */
public class Exercicio020 {
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com o primeiro numero: ");
        int x = entrada.nextInt();
        System.out.println("Entre com o segundo numero: ");
        int y = entrada.nextInt();
        System.out.println("Entre com o terceiro numero: ");
        int z = entrada.nextInt();
        
        System.out.println((Math.abs(x - y) >= 20 || Math.abs(y - z) >= 20 || Math.abs(z - x) >= 20));
    }
    
}
