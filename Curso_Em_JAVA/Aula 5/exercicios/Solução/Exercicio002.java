package Lista_002;
import java.util.Scanner;
/*
    Escreva um programa Java para resolver equações quadráticas 
    
    Formula:        x = – b ± √∆
                        2a
  
    	Dados de teste
    	Entrada a: 1
    	Entrada b: 5
    	Entrada c: 1
    	Saída Esperada:
    	As raízes são -0,20871215252208009 e -4,7912878474779195

 */
public class Exercicio002 {
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("A: ");
        double a = entrada.nextDouble();
        System.out.print("B: ");
        double b = entrada.nextDouble();
        System.out.print("C: ");
        double c = entrada.nextDouble();
        
        double resultado = b * b - 4.0 * a * c;
        
        if(resultado > 0.0)
        {
            double resultado1 = (-b + Math.pow(resultado, 0.5)) / (2.0 * a);
            double resultado2 = (-b - Math.pow(resultado, 0.5)) / (2.0 * a);
            System.out.println("As raizes são: " + resultado1 + " e " + resultado2);
            
        }else if(resultado == 0.0)
        {
            double resultado01 = -b / (2.0 * a);
            System.out.println("A raiz é " + resultado01);
            
        }else{
            System.out.println("As equacoes das Raizes não são Reais");
        }
    }
}
