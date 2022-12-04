package ListaExercicios_001;
/**
    11. Escreva um programa Java para imprimir a área e o perímetro de um retângulo.
    Um perímetro é um caminho que circunda uma forma bidimensional. A palavra vem do grego peri (ao redor) e metro (medida). 
    * O perímetro pode ser usado para calcular o comprimento da cerca necessária para cercar um quintal ou jardim.
    Na geometria plana euclidiana, um retângulo é um quadrilátero com quatro ângulos retos. 
    * Para encontrar a área de um retângulo, multiplique o comprimento pela largura.
    Um retângulo com quatro lados de igual comprimento é um quadrado.
 */
public class Exercicio011 {
    
    private static final double largura = 5.6;
    private static final double altura  = 8.5;
    
    public static void main(String[] args)
    {
        double perimetro = 2 * (altura + largura);
        
        double area = largura * altura;
        
        System.out.printf("Perimetro é 2*(%.1f + %.1f) = %.2f\n", 
                altura, largura, perimetro);
        
    }
    
}
