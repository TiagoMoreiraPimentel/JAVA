package curso_java_basico;

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

public class Vagoes {
    
    private String nomeCarro;
    private int ocupantes;
    private String sinalizacao;
    private int passageiros;
    
    //Sets
    public void     setNomeCarro(String NomeCar)        {this.nomeCarro = NomeCar;}
    public void     setOcupantes(int Ocupante)          {this.ocupantes = Ocupante;}
    public void     setSinalizacao(String Sinalizacao)  {this.sinalizacao = Sinalizacao;}
    public void     setPassageiros(int Passageiros)     {this.passageiros = Passageiros;}
    //Gets
    public  String  getNomeCarro()                      {return nomeCarro;}
    public  int     getOcupantes()                      {return ocupantes;}
    public  String  getSinalizacao()                    {return sinalizacao;}
    public  int     getPassageiros()                    {return passageiros;}
    
}
