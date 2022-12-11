package Lista_002;
import java.util.Scanner;
/*
    3. Pegue três números do usuário e imprima o maior número.
*/

public class Exercicio003 {
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Entre N° 1: ");
        int numero01 = entrada.nextInt();
        System.out.println("Entre N° 2: ");
        int numero02 = entrada.nextInt();
        System.out.println("Entre N° 3: ");
        int numero03 = entrada.nextInt();
        
        if(numero01 > numero02)
            if(numero01 > numero03)
                System.out.println("O maior: " + numero01);
        
        if(numero02 > numero01)
            if(numero02 > numero03)
                System.out.println("O maior: " + numero02);
        
        if(numero03 > numero01)
            if(numero03 > numero02)
                System.out.println("O maior: " + numero03);
    }
}
