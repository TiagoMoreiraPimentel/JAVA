package Curso_Java;
import java.util.Scanner;
public class Comando_Condicionais02 {
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        //Faça um algoritmo em Java que faça ao minimo 4 validações do Usuario
        
        // 1° ok  2° ok 3° ok 4° ok 
        //Nome,   CPF,  RG,   Senha
        //criando minhas variaves

        String nome, cpf, rg, senha;
        
        System.out.println("Nome: ");
        nome = entrada.next();
        System.out.println("CPF: ");
        cpf = entrada.next();
        System.out.println("RG: ");
        rg = entrada.next();
        System.out.println("Senha");
        senha = entrada.next();
        
        //1° Validacao
        if(nome.contains("Paloma")) //ESTRUTURA CONDICIONAL EQUIVALENTE AO "E" OU CONJUNÇÃO EM TABELA VERDADE
        {
            System.out.println("É a Paloma");
            
            //2° Validacao
            if(cpf.contains("123456"))
            {
                System.out.println("É o CPF da Paloma");
                
                //3° Validacao
                if(rg.contains("123"))
                {
                      System.out.println("É o RG da Paloma");
                      
                    //4° validacao
                    if(senha.contains("563"))
                    {
                          System.out.println("É a Senha da Paloma");
                    }
                }
            }
        }
    }
    
}
