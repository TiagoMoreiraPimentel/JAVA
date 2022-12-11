package curso_de_computacao_java;
import java.util.Scanner;
public class Estacionamento {
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        /*
            - Crie um algoritmo que receba uma quantidade (N) de carros e estacione todos eles
            - Só é possível estacionar 6 carros por fileira
            - Você só possui 10 fileiras
            - Será necessário informar o cliente a falta de espaço (ou seja, se você já estacionou todos os carros possíveis)
        */
        System.out.println("Informe quantidade de Carros a ser estacionada: ");
        int quantidadeCarros = scan.nextInt();
        
        int vetorGaragem[] = new int[quantidadeCarros];
        
        //Primeira Fileira de 6 Vagas
        for(int i = 0; i < 6; i++)
        {
            System.out.println("Placa: ");
            int carro = scan.nextInt();
            
            vetorGaragem[i] = carro;
            
            if(vetorGaragem[i] == 6)
            {
                System.out.println("Garagem 01 Cheia");
                break;
            }
        }
        
        //Segunda Fileira de 6 Vagas
        for(int i = 6; i < 12; i++)
        {
            System.out.println("Placa: ");
            int carro = scan.nextInt();
            
            vetorGaragem[i] = carro;
            
            if(vetorGaragem[i] == 12)
            {
                System.out.println("Garagem 02 Cheia");
                break;
            }
        }
        
        //Terceira Fileira de 6 Vagas
        for(int i = 12; i < 18; i++)
        {
            System.out.println("Placa: ");
            int carro = scan.nextInt();
            
            vetorGaragem[i] = carro;
            
            if(vetorGaragem[i] == 18)
            {
                System.out.println("Garagem 03 Cheia");
                break;
            }
        }
        
        //Quarta Fileira de 6 Vagas
        for(int i = 18; i < 24; i++)
        {
            System.out.println("Placa: ");
            int carro = scan.nextInt();
            
            vetorGaragem[i] = carro;
            
            if(vetorGaragem[i] == 24)
            {
                System.out.println("Garagem 04 Cheia");
                break;
            }
        }
        
        //Quinta Fileira de 6 Vagas
        for(int i = 24; i < 30; i++)
        {
            System.out.println("Placa: ");
            int carro = scan.nextInt();
            
            vetorGaragem[i] = carro;
            
            if(vetorGaragem[i] == 30)
            {
                System.out.println("Garagem 05 Cheia");
                break;
            }
        }
        
        //Sexta Fileira de 6 Vagas
        for(int i = 30; i < 36; i++)
        {
            System.out.println("Placa: ");
            int carro = scan.nextInt();
            
            vetorGaragem[i] = carro;
            
            if(vetorGaragem[i] == 36)
            {
                System.out.println("Garagem 06 Cheia");
                break;
            }
        }
        
        //Setima Fileira de 6 Vagas
        for(int i = 36; i < 42; i++)
        {
            System.out.println("Placa: ");
            int carro = scan.nextInt();
            
            vetorGaragem[i] = carro;
            
            if(vetorGaragem[i] == 42)
            {
                System.out.println("Garagem 07 Cheia");
                break;
            }
        }
        
        //Oitava Fileira de 6 Vagas
        for(int i = 42; i < 48; i++)
        {
            System.out.println("Placa: ");
            int carro = scan.nextInt();
            
            vetorGaragem[i] = carro;
            
            if(vetorGaragem[i] == 48)
            {
                System.out.println("Garagem 08 Cheia");
                break;
            }
        }
        
         //Nona Fileira de 6 Vagas
        for(int i = 48; i < 54; i++)
        {
            System.out.println("Placa: ");
            int carro = scan.nextInt();
            
            vetorGaragem[i] = carro;
            
            if(vetorGaragem[i] == 54)
            {
                System.out.println("Garagem 09 Cheia");
                break;
            }
        }
        
         //Decima Fileira de 6 Vagas
        for(int i = 54; i < 60; i++)
        {
            System.out.println("Placa: ");
            int carro = scan.nextInt();
            
            vetorGaragem[i] = carro;
            
            if(vetorGaragem[i] == 60)
            {
                System.out.println("Garagem 10 Cheia");
                break;
            }
        }
    }
    
}
