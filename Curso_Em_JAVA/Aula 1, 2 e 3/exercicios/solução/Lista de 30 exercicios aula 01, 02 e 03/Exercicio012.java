package ListaExercicios_001;

/**
    12. Escreva um programa Java para trocar duas variáveis
    Trocar duas variáveis refere-se a trocar mutuamente os valores das variáveis. 
    * Geralmente, isso é feito com os dados na memória.
 */
public class Exercicio012 {
    
    public static void main(String[] args)
    {
        int a, b, temp;
        a = 15;
        b = 27;
        System.out.println("Valores antes da troca: a, b" + a + ", " + + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("Depois da troca: a, b ="+a+", " + + b);
    }
    
}
