package ListaExercicios_001;

/**
    23. Escreva um programa Java para criar uma nova string de 4 cópias dos últimos 3 caracteres da string original.
 */
public class Exercicio023 {
    
    public static void main(String[] args)
    {
        String string_principal = "Python 3.0";
        
        String ultimos_tres_caracteres =  string_principal.substring(string_principal.length() - 3);
        
        System.out.println(ultimos_tres_caracteres + ultimos_tres_caracteres + ultimos_tres_caracteres + ultimos_tres_caracteres);
    }
    
}
