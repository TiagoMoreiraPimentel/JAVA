/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio5;

import java.util.Locale;
import java.util.Scanner;

/**
 * Escreva um programa Java que mantenha um número do usuário e gere um inteiro entre 1 e 7 e exiba o nome do dia da semana.
 * @author Tiago
 */
public class Exercicio5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.println("Digite um numero para saber o dia da semana: ");
        int numero = sc.nextInt();
        
        if(numero == 1){
            System.out.println("Segunda-Feira");
        }
        else if(numero == 2){
            System.out.println("Terça-Feira");
        }
        else if(numero == 3){
            System.out.println("Quarta-Feira");
        }
        else if(numero == 4){
            System.out.println("Quinta-Feira");
        }
        else if(numero == 5){
            System.out.println("Sexta-Feira");
        }
        else if(numero == 6){
            System.out.println("Sabado");
        }
        else if(numero == 7){
            System.out.println("Domingo");
        }
        else{
            System.out.println("Este dia da semana não existe!");
        }
        
        sc.close();
    }
}
