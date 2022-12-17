package com.mycompany.lista2_Exercicios;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * 6. Escreva um programa Java que leia dois números de ponto flutuante 
 * e teste se eles são iguais até três casas decimais.
 * @author Tiago
 */
public class Exercicio06 {

    public static void main(String[] args){
        
        //criando scanner para ler entradas
        Scanner sc = new Scanner(System.in);
        
        //variáveis
        double numeroUm,numeroDois;
        
        //pedindo entrada ao usuário
        System.out.println("Digite um numero");
        numeroUm = sc.nextDouble();
        System.out.println("Digite o segundo numero");
        numeroDois = sc.nextDouble();
        
        //Essa função decimalformat converte as casas decimais para um formato e também arredonda
        DecimalFormat forma = new DecimalFormat("#.###");
        forma.format(numeroUm);
        forma.format(numeroDois);
        
        /*
        Essa função salva em uma String, logo se é String posso Comparar os caracteres pelo 'equals'
        condição para exibição
        */
        if(forma.format(numeroUm).equals(forma.format(numeroDois))){
            System.out.println(forma.format(numeroUm) + " Comparado com -> " + forma.format(numeroDois));
            System.out.println("Os numeros são iguais em até três casas decimais");
        }
        else{
            System.out.println(forma.format(numeroUm) + " Comparado com -> " + forma.format(numeroDois));
            System.out.println("Os numeros são diferentes em até três casas decimais");
        }
    }
}
