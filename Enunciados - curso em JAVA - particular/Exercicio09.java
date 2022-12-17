package com.mycompany.lista2_Exercicios;
import java.util.Scanner;
/**
 * 9. Escreva um programa Java que leve um ano do usuário 
 * e imprima se esse ano é bissexto ou não.
 * @author Tiago
 */
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("Digite o ano que deseja consultar: ");
        int ano = sc.nextInt();
        System.out.println("");
        
        if(ano % 4 == 0){
            System.out.println(" O ano " + ano + " é bissexto. ");
        }else if(ano % 4 == 0 && ano % 100 != 0){
            System.out.println(" O ano " + ano + " é bissexto. ");
        }
        else{
            System.out.println(" O ano " + ano + " não é bissexto. ");
        }
             
        sc.close();
    }
}
