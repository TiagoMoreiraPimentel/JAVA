package ListaExercicios_001;
import java.util.Scanner;
/**
    29. Programa Java para converter a temperatura em Graus Centígrados para Fahrenheit
 */
public class Exercicio029 {
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Entre com a Temp. em Centigrados: ");
        int c = Integer.parseInt(entrada.nextLine());
        
        float f = ((9 * c) / 5) + 32;
        
        System.out.println("Temperatura em Fahrenheit :" + f);
    }
    
}
