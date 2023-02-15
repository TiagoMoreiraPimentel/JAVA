package com.mycompany.exercicio_1;

import java.util.Scanner;

/**
 *1.Escreva um programa Java para obter um número do usuário e imprimir se é positivo ou negativo
 * @author Tiago
 */
public class Exercicio_1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();
        
        if(numero > 0){
            
            System.out.println("O numero é POSITIVO!");
        }
        else{
            System.out.println("O numero é NEGATIVO!");
        }
        
        sc.close();
    }
}
