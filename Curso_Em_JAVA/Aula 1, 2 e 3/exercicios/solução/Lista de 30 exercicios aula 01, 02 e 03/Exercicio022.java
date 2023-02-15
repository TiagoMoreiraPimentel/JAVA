package ListaExercicios_001;
/**
    22. Escreva um programa Java para inserir uma palavra no meio de outra string.
 */
public class Exercicio022 {
    
    public static void main(String[] args)
    {
        String string_principal = "Python 3.0";
        String palavra = "Tutorial";
        System.out.println(string_principal.substring(0, 7) + palavra + string_principal.substring(6));
    }
    
}
