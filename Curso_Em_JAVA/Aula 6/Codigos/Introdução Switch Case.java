package curso_de_programacao;

public class Introdução_Comando_Switch {
    
    public static void main(String[] args)
    {
        //IF, IF ELSE, (Famoso IF encadeado: IF ELSE IF)
        
        //Definiçao do IF
        
        //IF aceita N entradas e tem somente 1 saida
        
        //5 valores de tipos diferentes
        /*int valor = 10;
        String nome = "Luiz";
        boolean valorBol = false;
        float dados = 200;
        double dadosDouble = 200.0;*/
        
        //TENHO 5 ENTRADAS DE VALORES DISTINTOS
        /*if(valor == 10 && nome.contains("Luiz") && valorBol == false && dados == 200 && dadosDouble == 200.0)
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }*/
        
        //Definition IF: "Pode ter N Entradas e somente 1 SAIDA
        
        
        //Introdução ao Comando Switch Case
        
        //Definition: Comando Switch, ele tem somente 1 Entrada e possui N SAIDAS
        
        //int numero = 10;
        
        /*switch(numero)//1 ENTRADA
        {
            //N Saidas
            case 0: System.out.println("0"); break;
            case 1: System.out.println("1"); break;
            case 2: System.out.println("2"); break;
            case 3: System.out.println("3"); break;
            case 4: System.out.println("4"); break;
            case 5: System.out.println("5"); break;
            case 6: System.out.println("6"); break;
            case 7: System.out.println("7"); break;
            case 8: System.out.println("8"); break;
            case 9: System.out.println("9"); break;
            case 10: System.out.println("10"); break;
            
            //Lança uma exceção
            default: System.out.println("Opção Inexistente"); break;
        }*/
        
        /*String nome = "Michael";
        
        switch(nome)
        {
            case "Luiz": System.out.println("Luiz mora no Parana Terra dos Peixes"); break;
            case "Aljan": System.out.println("Aljan mora no Pernambuco Terra da Rapadura"); break;
            case "Daniel": System.out.println("Daniel mora na Bahia Terra da Acarajé"); break;
            case "Tiago": System.out.println("Tiago mora em SP Terra dos Caras ricos"); break;
            
            default: System.out.println("Não tem alunos melhores que esses Cidadão"); break;
        }*/
        
        //1° if
        /*if(condicao)
        {
            //2° if
            if(condicao)
            {
                //
                if(condicao)
            }
        }*/
        
        int valor = 10;
        
        if(valor == 11) //1° intrução ele avalia que é falso
        {
            System.out.println("TRUE");
            
        }else if(valor == 12)//2° intrucao ele avalia novamente
        {
            System.out.println("TRUE");
        }
        
        //1 if somente ele avalia a variavel somente 1 vez
        if(valor == 33)
        {
            System.out.println("TRUE");
        }
        
        //declaro uma variavel do tipo "int" recebe 30
    int idade = 13;      
        //categorização      
        switch(idade)//se tiver somente 1 entrada, melhor usar o Switch case
        {
            case 1:     //sem break, significa, pode pular, está dentro do meu intervalo aceitável
            case 2:
            case 3:     //onde tem a palavra reservada "break", digo ao algoritmo, pode parar ai, que achei o meu valor verdadeiro
            case 4:
            case 5: 
            case 6:
            case 7:
            case 8:
            case 9:
            case 10: 
            case 11:System.out.println("Não Vota"); break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:System.out.println("Facultativo Votar"); break;
            case 18: 
            case 19:
            case 20:System.out.println("Obrigado a Votar");
                
            default: System.out.println("Não existe esse intervalo no escopo!"); break;
        }
    }
}
