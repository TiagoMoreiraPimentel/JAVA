package Lista_002;

/*
    10. Escreva um programa Java para inserir e exibir sua senha
 */
public class Exercicio010 {
    
    public static void main(String[] args)
    {
       String senha = "123";
       
       if(senha.contains("123"))
       {
           System.out.println("Bem vindo Tiago");
           System.out.println(senha);
       }else{
           System.out.println("Não é o Tiago gente boa!");
       }
       
       //equivalente
       /*if(senha == "123")
       {
             System.out.println("Bem vindo Tiago");
           System.out.println(senha);
       }*/
    }
}
