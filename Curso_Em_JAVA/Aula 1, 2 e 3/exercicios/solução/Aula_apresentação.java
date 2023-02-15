package curso_java_basico; //package - pacote criado, "curso_java_basico" nome do pacote
//palavra reservada "public", significa que todo o projeto pode acessar essa classe, metodo ou função
//palavra reservada "class", faz referencia direta ao nome da classe, ou seja, nomenclatura
//"Custo_Java_Basico" é o nome propriamente dito da classe
//importando pacotes no java

import java.util.Scanner; //Esse pacote é usado para capturar e mostrar dados na Console.

public class Curso_Java_Basico {
    //palavra reservada "static", vamos ver em OOP(Programação Orientada a Objetos), iremos estudar a fundo
    //palavra reservada "void" significa que essa função ou procedimento não vai retornar nada, para quem o chamou.
    //palavra "main" nomenclatura qualquer da main do projeto
    //(String[]) //String[] é um vetor de strings, vamos aprender mais pra frente, no tema de Arrays
    //"args", significa arguementos, ou seja, nomenclatura qualquer, vamos aprender a fundo em "Funções e Procedimentos"
    
    //O que a main faz ?
    //A main realiza o start do projeto, ou seja, é aqui começa tudo, onde se inicia a execução de todos os algoritmos que formam
    //codificados na linguagem Java
    public static void main(String[] args) 
    {//abre as chaves
        // TODO code application logic here
        
    //Proxima aula, iremos abordar todos os tipos de dados em Java    
        
    //Tipo String - trata de caracteres, ele é um vetor de char
        
    //Vamos implementar um exemplo de saida de fluxo de dados    
        
    //Faça um programa que capture seu nome e imprima na Console em Java!
    
        //1° Coisa a se fazer ?
        //String nome;
        //2° Parte da solucao
        //Imprimir na tela para o usuário
        
        //atalho console "sout" + CRTL + ESPAÇO
        
        //Instanciei a classe Scanner
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe seu Nome ? "); //imprime na console a mensagem citada
        //Captura o nome
        String nome = entrada.next();
        //Imprime na console
        System.out.println("Nome da Pessoa: " + nome);
        
    //fecha as chaves
    }
}
