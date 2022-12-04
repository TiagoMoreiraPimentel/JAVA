package ListaExercicios_001;
import java.util.*;
/**
 *  
    19. Escreva um programa Java para encontrar a penúltima (penúltima) palavra de uma frase.
 */
public class Exercicio019 {
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Entre com a setença: ");
        String linha = entrada.nextLine();
        String[] palavras = linha.split("[ ]+");
        System.out.println("Penultima palavra:" + palavras[palavras.length - 2]);
    }
    
}
