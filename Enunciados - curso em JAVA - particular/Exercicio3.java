/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio3;

import java.util.Scanner;

/**
 * Pegue três números do usuário e imprima o maior número.
 * @author Tiago
 */
public class Exercicio3 {

    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       
        System.out.println("Primeiro numero: ");
        int n1 = sc.nextInt();
        System.out.println("Segundo numero: ");
        int n2 = sc.nextInt();
        System.out.println("Terceiro numero: ");
        int n3 = sc.nextInt();
        
        if(n1 > n2 && n1 > n3){
            System.out.printf("O maior numero é: %d%n", n1);
        }
        else if(n2 > n1 && n2 > n3){
            System.out.printf("O maior numero é: %d%n", n2);
        }
        else if(n3 > n1 && n3 > n2){
            System.out.printf("O maior numero é: %d%n", n3);
        }
        else{
            System.out.println("Erro desconhecido");
        }
       
       sc.close();
        
    }
}
