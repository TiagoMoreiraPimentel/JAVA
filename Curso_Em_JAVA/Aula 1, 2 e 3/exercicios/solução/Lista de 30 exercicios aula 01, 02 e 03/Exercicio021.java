package ListaExercicios_001;
import java.util.*;
/*
    21. Escreva um programa Java para calcular os módulos de dois números sem usar nenhum operador de módulo embutido.
 */
public class Exercicio021 {
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com o primeiro numero:");
        int a = entrada.nextInt();
        System.out.println("Entre com o segundo numero:");
        int b = entrada.nextInt();
        
        int divisao = a / b;
        int resultado = a - (divisao * b);
        System.out.println("resultado:" + resultado);
    }
}
