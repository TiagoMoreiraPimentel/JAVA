/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio4;

import java.util.Locale;
import java.util.Scanner;

/**
 * Escreva um programa Java que leia um número de ponto flutuante e imprima "zero" se o número for zero. 
 * Caso contrário, imprima "positivo" ou "negativo". 
 * Adicione "pequeno" se o valor absoluto do número for menor que 1 ou "grande" se exceder 1.000000
 * @author Tiago
 */
public class Exercicio4 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        Double numero = sc.nextDouble();
        
        if(numero == 0){
            System.out.println("zero");
        }
        else if(numero > 0){
            System.out.println("numero positivo");
        }
        else if(numero < 0){
            System.out.println("numero negativo");
        }    
        
        if(numero < 1){
            System.out.println("pequeno");
        }
        else if(numero > 1000000){
            System.out.println("grande");
        }

           
        sc.close();
        
    }
}
