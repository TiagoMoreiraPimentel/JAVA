package ListaExercicios_001;

/**
    9. Escreva um programa Java para imprimir a área e o perímetro de um círculo
    Em geometria, a área delimitada por um círculo de raio r é πr2. Aqui a letra grega π representa uma constante, 
    * aproximadamente igual a 3,14159, que é igual à razão entre a circunferência de qualquer círculo e seu diâmetro.
    A circunferência de um círculo é a distância linear em torno de sua borda.
 */
public class Exercicio009 {
    
    //Significa uma "CONSTANTE" em Java
    //Valor é Imutável
    private static final double raio = 15.5;
    
    public static void main(String[] args)
    {
        //variavel, porem ninguem PODE ACESSA-LA
        //double raio = 15.5;
        
        //calculo do perimetro
        double perimetro = 2 * Math.PI * raio;
        //calculo da area
        double area = Math.PI * raio * raio;
        
        System.out.println("Perimetro = " + perimetro);
        System.out.println("Area = " + area);
    }
    
}
