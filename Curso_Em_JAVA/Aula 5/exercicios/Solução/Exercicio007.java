package Lista_002;
import java.util.Scanner;
/*
    7. Escreva um programa Java para encontrar o número de dias em um mês.
 */
public class Exercicio007 {
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        int numeroDiasMes = 0; //cria uma variavel para receber os dias
        String nomeMes = "Desconhecido";
        
        System.out.println("Entre com o N° do Mês: ");
        int mes = entrada.nextInt();
        
        System.out.print("Entre com o Ano: ");
        int ano = entrada.nextInt();
        
        if(mes == 1)
        {
            nomeMes = "Janeiro";
            numeroDiasMes = 31;
            System.out.println("Mes: " + nomeMes + " N° dias: " + numeroDiasMes);
        }
        else if(mes == 2)
        {
            nomeMes = "Fevereiro";
            
            if((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0)))
            {
                nomeMes = "Fevereiro";
                numeroDiasMes = 29;
                System.out.println("N° dias: " + numeroDiasMes);
                System.out.println("Ano Bissexto");
                
            } else {
                
                nomeMes = "Fevereiro";
                numeroDiasMes = 28;
                System.out.println("N° dias: " + numeroDiasMes);
                System.out.println("Normal");
            }
        }else if(mes == 3)
        {
            nomeMes = "Março";
            numeroDiasMes = 31;
            System.out.println("Mes: " + nomeMes + " N° dias: " + numeroDiasMes);
            
        }else if(mes == 4)
        {
            nomeMes = "Abril";
            numeroDiasMes = 30;
            System.out.println("Mes: " + nomeMes + " N° dias: " + numeroDiasMes);
            
        }else if(mes == 5)
        {
            nomeMes = "Maio";
            numeroDiasMes = 31;
            System.out.println("Mes: " + nomeMes + " N° dias: " + numeroDiasMes);
            
        }else if(mes == 6)
        {
            nomeMes = "Janho";
            numeroDiasMes = 30;
            System.out.println("Mes: " + nomeMes + " N° dias: " + numeroDiasMes);
            
        }else if(mes == 7)
        {
            nomeMes = "Julho";
            numeroDiasMes = 31;
            System.out.println("Mes: " + nomeMes + " N° dias: " + numeroDiasMes);
            
        }else if(mes == 8)
        {
            nomeMes = "Agosto";
            numeroDiasMes = 31;
            System.out.println("Mes: " + nomeMes + " N° dias: " + numeroDiasMes);
            
        }else if(mes == 9)
        {
            nomeMes = "Setembro";
            numeroDiasMes = 30;
            System.out.println("Mes: " + nomeMes + " N° dias: " + numeroDiasMes);
            
        }else if(mes == 10)
        {
            nomeMes = "Outubro";
            numeroDiasMes = 31;
            System.out.println("Mes: " + nomeMes + " N° dias: " + numeroDiasMes);
            
        }else if(mes == 11)
        {
            nomeMes = "Novembro";
            numeroDiasMes = 30;
            System.out.println("Mes: " + nomeMes + " N° dias: " + numeroDiasMes);
            
        }else if(mes == 12)
        {
            nomeMes = "Dezembro";
            numeroDiasMes = 31;
            System.out.println("Mes: " + nomeMes + " N° dias: " + numeroDiasMes);
        }
    }  
}
