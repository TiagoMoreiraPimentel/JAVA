package curso_de_computacao_java;
import java.util.Scanner;
public class Aula_Oficial_Introduçao_Estrutura_Condicional03 {
    
    public static void main(String[] args)
    {
        //Conjunção "E"
        
        //Tabela Verdade na prática usando algoritmo Java
        
        //Crie um programa em Java que recebe 2 entradas "Nome E CPF" e verifique a autencidade do usuario
        //Login e Senha
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Nome: ");
        String nome = entrada.next();
        System.out.println("CPF: ");
        String cpf = entrada.next();
        System.out.println("RG");
        int rg = entrada.nextInt();
        System.out.println("Endereco: ");
        String endereco = entrada.next();
        
        //Vamos usar o operador &&
        //entrada01                     entrada02                   entrada03       entrada04
        if(nome.contains("Palloma") && cpf.contains("123456789") && rg == 525263 && endereco.contains("Rua"))
        {
            System.out.println("È a Palloma Programmer Java. Bem vinda ao Sistema");
        }
        else
        {
            System.out.println("Erro de Login!!");
        }
    }
    
}
