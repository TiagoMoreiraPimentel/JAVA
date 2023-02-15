package ListaExercicios_001;

/**
    8. Escreva um programa Java para calcular uma fórmula especifica
    Fórmula especificada:
    4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
    Saida esperada
    2.9760461760461765
 */
public class Exercicio008 {
    
    public static void main(String[] args)
    {
        double resultado =  4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        
        System.out.println("Resultado: " + resultado);
    }
    
}
