package ListaExercicios_001;
import java.util.Scanner;
/**
    15. Escreva um programa Java que aceite um inteiro (n) e calcule o valor de n+nn+nnn.
 */
public class Exercicio015 {
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int n;
        char s1, s2, s3;
        
        System.out.println("Numero: ");
        n = entrada.nextInt();
        System.out.printf("%d + %d%d + %d%d%d\n", n, n, n, n, n, n);
        
    }
}
