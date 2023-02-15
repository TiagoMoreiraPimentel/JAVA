package Curso_Java;
import java.util.Scanner;

public class Comando_Condionais01 {
    
    public static void main(String[] args)
    {
        
        Scanner scan = new Scanner(System.in);
        //Vamos prosseguir com o comando IF
        
        //Crie um progama Java que defina por Idade quem é o participante da Live do Curso Java Professional
        
        String login;
        int senha;
        System.out.println("Informe a Login: ");
        login = scan.next();
        System.out.println("Informe a Senha: ");
        senha = scan.nextInt();
        
        //1° Validação
        if(senha == 123) //idade for igual a 33
        {
            System.out.println("Thiago");
            
            //2° Validação
            if(senha == 123 && login.contains("Tiago@gmail.com"))
            {
                System.out.println("Thiago é Gente boa!");
            }
        }
        else
        {
            System.out.println("Não conheco esse cidadão");
        }
    }
    
}
