package ListaExercicios_001;

/**
    26. Escreva um programa Java para obter o valor da variável de ambiente PATH, TEMP, USERNAME.
 */
public class Exercicio026 {
    
    public static void main(String[] args)
    {
        //Obtem o valor da variavel de ambiente especificada "TEMP"
        System.out.println("\nVariavel de ambiente TEMP: ");
        System.out.println(System.getenv("TEMP"));
        
        //Obtem o valor da variavel de ambiente especificada "USERNAME"
         System.out.println("\nVariavel de ambiente USERNAME: ");
        System.out.println(System.getenv("USERNAME"));
    }
    
}
