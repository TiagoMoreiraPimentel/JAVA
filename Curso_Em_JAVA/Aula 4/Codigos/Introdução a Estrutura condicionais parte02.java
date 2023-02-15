package curso_de_computacao_java;
import java.util.Scanner;

public class Aula_Oficial_Introdução_Estrutura_Condicional02 {
    
    public static void main(String[] args)
    {
        //VAMOS TRABALHAR COM 2 OU + ENTRADAS
        
        //Disjunção "OU"
        
        /*
                ENTRADA01       ENTRADA02       SAIDA
                TRUE            TRUE            TRUE
                TRUE            FALSE           TRUE
                FALSE           TRUE            TRUE
                FALSE           FALSE           FALSE
        */
                                           // entrada01   entrada02
        //Crie um programa que irá captura,     nome    OU  idade       e decidir quem é a pessoa
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Nome: ");
        String nome = entrada.next();
        System.out.println("Idade:");
        int idade = entrada.nextInt();
        System.out.println("Cor Pele");
        String cor = entrada.next();
        System.out.println("CPF");
        String cpf = entrada.next();
        
        // entrada01                   entrada02      entrada03                entrada04
        if(nome.contains("Michael") || idade == 33 || cor.contains("Preto") || cpf.contains("564654564564"))
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }
    }
}
