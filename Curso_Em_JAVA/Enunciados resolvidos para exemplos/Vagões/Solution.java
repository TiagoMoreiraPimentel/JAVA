package curso_java_basico;
import java.util.Scanner;
/*
    Um sistema do metrô sinaliza o nível de ocupação por vagão (carro) conforme classificação:

    Azul (vazio ou ocupação baixa) - 0 a 50
    Amarela (ocupação média) - 51 a 100
    Laranja (ocupação alta) - 101 a 150
    Vermelha (ocupação altíssima ou lotado) - 150 a 250

    Considere que cada composição tem seis vagões (carros) e essa sinalização é feita em cada carro. 
    Escreva um programa em Java que simule uma composição do metrô através do array, crie uma lógica 
    para simular a sinalização de ocupação por carro ao longo de uma viagem. A cada estação, deve ser 
    possivel informar, via teclado, os valores de passageiros, por carro, que entraram ou sairam. 
    E na saída de cada estação, a aplicação deve apresentar todos os seis carros com o número do carro 
    (carro 1, carro 2 etc.), o número de ocupantes, a sinalização correspondente ao número de passageiros 
    e o total de passageiros da composição.

    A sua solução deve utilizar, obrigatoriamente, estruturas de repetição e decisão, além de verificar 
    os valores de entrada adequados (valores negativos e acima de 250 não devem ser permitidos, nem textos).

 */
public class Solution {
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int limiteMaximo = 250;
        
        OperacoesVagoes criaVagoes = new OperacoesVagoes(limiteMaximo);
        
        for(int i = 0; i < limiteMaximo; i++)
        {
            int cont01 = 0, cont02 = 0, cont03 = 0, cont04 = 0, cont05 = 0;
            if(limiteMaximo <= 250)
            {
                //Azul (vazio ou ocupação baixa) - 0 a 50
                while(cont01 < 50)
                {
                        Vagoes vagao01 = new Vagoes();
                        
                        System.out.println("Nome Carro " + (i + 1) + ": ");
                        String nomeCarro = scan.next();
                        System.out.println("Ocupante: " + (i + 1));
                        int ocupantes = scan.nextInt();
                        System.out.println("Sinalizacao: " + (i + 1));
                        String sinalizacao = scan.next();
                        System.out.println("Passageiros: " + (i + 1));
                        int passageiros = scan.nextInt();
                        vagao01.setNomeCarro(nomeCarro);
                        vagao01.setOcupantes(ocupantes);
                        vagao01.setSinalizacao(sinalizacao);
                        vagao01.setPassageiros(passageiros);
                        criaVagoes.addCarroVagao(vagao01);
                        
                    cont01++;
                }
                        criaVagoes.displayVagoes();
                        System.out.println("--Azul (vazio ou ocupação baixa) - 0 a 50--");
                
                //Amarela (ocupação média) - 51 a 100
                if(cont01 >= 50 && cont01 < 100)
                {
                    while(cont01 <= 100)
                    {
                        Vagoes vagao02 = new Vagoes();
                        
                        System.out.println("Nome Carro: " + (i + 1));
                        String nomeCarro = scan.next();
                        System.out.println("Ocupante: " + (i + 1));
                        int ocupantes = scan.nextInt();
                        System.out.println("Sinalizacao: " + (i + 1));
                        String sinalizacao = scan.next();
                        System.out.println("Passageiros: " + (i + 1));
                        int passageiros = scan.nextInt();
                        vagao02.setNomeCarro(nomeCarro);
                        vagao02.setOcupantes(ocupantes);
                        vagao02.setSinalizacao(sinalizacao);
                        vagao02.setPassageiros(passageiros);    
                        criaVagoes.addCarroVagao(vagao02);
                        
                        cont01++;
                    }
                        criaVagoes.displayVagoes();
                        System.out.println("--Amarela (ocupação média) - 51 a 100--");
                    
                    //Laranja (ocupação alta) - 101 a 150
                if(cont01 >= 101 && cont01 < 150)
                {
                    while(cont01 < 150)
                    {
                        Vagoes vagao03 = new Vagoes();
                        
                        System.out.println("Nome Carro: " + (i + 1));
                        String nomeCarro = scan.next();
                        System.out.println("Ocupante: " + (i + 1));
                        int ocupantes = scan.nextInt();
                        System.out.println("Sinalizacao: " + (i + 1));
                        String sinalizacao = scan.next();
                        System.out.println("Passageiros: " + (i + 1));
                        int passageiros = scan.nextInt();
                        vagao03.setNomeCarro(nomeCarro);
                        vagao03.setOcupantes(ocupantes);
                        vagao03.setSinalizacao(sinalizacao);
                        vagao03.setPassageiros(passageiros);   
                        criaVagoes.addCarroVagao(vagao03);
                        
                        cont01++;
                    }
                        criaVagoes.displayVagoes();
                        System.out.println("--Laranja (ocupação alta) - 101 a 150--");
                    
                //Vermelha (ocupação altíssima ou lotado) - 150 a 250
                if(cont01 >= 150 && cont01 <= 250)
                {
                    while(cont01 <= 250)
                    {
                        Vagoes vagao04 = new Vagoes();
                        
                        System.out.println("Nome Carro: " + (i + 1));
                        String nomeCarro = scan.next();
                        System.out.println("Ocupante: " + (i + 1));
                        int ocupantes = scan.nextInt();
                        System.out.println("Sinalizacao: " + (i + 1));
                        String sinalizacao = scan.next();
                        System.out.println("Passageiros: " + (i + 1));
                        int passageiros = scan.nextInt();
                        vagao04.setNomeCarro(nomeCarro);
                        vagao04.setOcupantes(ocupantes);
                        vagao04.setSinalizacao(sinalizacao);
                        vagao04.setPassageiros(passageiros);  
                        criaVagoes.addCarroVagao(vagao04);
                        
                        cont01++;
                    }
                        criaVagoes.displayVagoes();
                        System.out.println("--Laranja (ocupação alta) - 101 a 150--");
                    
                        }    
                    }
                }           
            }
        }
    }
}
