package ListaExercicios_001;
import java.util.Scanner;

/*
    
    17. Escreva um programa Java para converter segundos em horas, minutos e segundos.
 */
public class Exercicio017 {
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com os segundos: ");
        int segundos = entrada.nextInt();
        
        int p1 = segundos % 60;
        int p2 = segundos / 60;
        int p3 = p2 % 60;
        p2 = p2 / 60;
        System.out.print(p2 + ":" + p3 + ":" + p1);
        System.out.println("\n");
    }
    
}
