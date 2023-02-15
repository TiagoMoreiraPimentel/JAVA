package curso_de_computacao_java;

//usa a palavra reservada "import" seguida espaco, java.util.Scanner
import java.util.Scanner; //Biblioteca para captura de fluxos de dados

//Vamos entrar na materia nova. Apredermos sobre o comando de Decisão "IF"

public class Aula_Oficial_Introdução_Estrutura_Condicional {
    
    public static void main(String[] args)
    {
        
        //Descrição da Estrutura: A estrutura IF, auxilia o programador, nas tomadas de decisão, quando usamos a estrutura, estamos dando
        //poder de tomadas de decisões para o algoritmo, fazer conforme a entrada. Em suma: Ensinamos o computador, a tomar as devidas
        //decisões, baseado em "PREMISSAS LÓGICAS"
        
        //Como usa a estrutura IF
        
        //if basico
        /*if( aqui dentro passamos as intrucoes )
        {
            
        }*/
        
        //Crie um programa em Java, que capture a idade e "DECISA, TOME DECISÃO, FAÇA TAL COISA" a quem pertence a idade
        
        // = recebe o valor de alguem
        //operator "new" -- POO
        //Quer dizer que: Quero que compacte os bytes dentro das variaveis
        Scanner entrada = new Scanner(System.in);
        
        // a = string, vetor, matriz, objeto e assim sucessivamente
        
        System.out.println("Informe Idade: ");
        int idade  = entrada.nextInt();
        
         //ENTRADA01            -- PARA 1 ENTRADA EU TENHO 2 SAIDAS POSSIVEIS (SENDO TRUE(VERDADEIRO) FALSE(FALSO) FALSE(0) TRUE(1)
        if(idade == 26) //compara se a variavel idade for igual a 26
        {
            System.out.println("Matus");
        }
        
        // int idade [xl10] = recebe o valor 42 [42] 
        if(idade == 24)
        {
            System.out.println("Paloma");
        }
        
        if(idade == 28)
        {
            System.out.println("Tiago");
        }
        
        if(idade == 42)
        {
            System.out.println("Aljan");
        }
    }
    
}
