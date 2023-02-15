package ListaExercicios_001;
import java.util.*;
/**
    18. Escreva um programa Java para converter uma determinada string em minúsculas.
 */
public class Exercicio018 {
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com a string: ");
        String linha =  entrada.nextLine();
        linha = linha.toLowerCase();
        System.out.println(linha);
    }
    
}
