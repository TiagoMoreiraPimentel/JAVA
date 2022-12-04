package ListaExercicios_001;

/**
    24. Escreva um programa Java para extrair a primeira metade de uma string de comprimento par.
 */
public class Exercicio024 {
    
    public static void main(String[] args)
    {
        String string_principal = "Python";
        System.out.println(string_principal.substring(0, string_principal.length() / 2));
    }
    
}
