package curso_java_basico;
//Classe das operações dos vagoes
public class OperacoesVagoes {
    //atributos da classe
    private Vagoes[] arrayVagoes;
    private int index;

    //Construtor
    public OperacoesVagoes(int index) {
        arrayVagoes = new Vagoes[index];
    }
    //Procedure, para adicionar vagao
    public void addCarroVagao(Vagoes v)
    {
        arrayVagoes[index++] = v;
    }
    //Imprime os dados
    public void displayVagoes()
    {
        for(int i = 0; i < arrayVagoes.length; i++)
        {
            if(arrayVagoes[i] != null)
            {
                System.out.println(arrayVagoes[i].getNomeCarro() + "\t" 
                + arrayVagoes[i].getOcupantes() + "\t" + arrayVagoes[i].getSinalizacao() 
                + "\t" + arrayVagoes[i].getPassageiros());
            }
        }
    }
}
