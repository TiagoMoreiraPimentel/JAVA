
package ListaExercicios_001;

/**
 * 
13. Escreva um programa Java para verificar se o Java está instalado em seu computador
 */
public class Exercicio013 {
    
    public static void main(String[] args)
    {
        System.out.println("\nVersao do Java: " + System.getProperty("java.version"));
         System.out.println("\nJava Runtime Version: " + System.getProperty("java.runtime.version"));
          System.out.println("\nJava Home: " + System.getProperty("java.home"));
           System.out.println("\nJava Vendor: " + System.getProperty("java.vendor"));
            System.out.println("\nJava Vendor URL: " + System.getProperty("java.vendor.url"));
             System.out.println("\nJava Class Path: " + System.getProperty("java.class.path"));
    }
    
}
