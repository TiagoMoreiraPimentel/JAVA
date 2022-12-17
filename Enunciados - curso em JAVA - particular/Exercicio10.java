package com.mycompany.lista2_Exercicios;
import java.util.Scanner;
/**
 * 10. Escreva um programa Java para inserir e exibir sua senha.
 * @author Tiago
 */
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Cadastre sua senha: ");
        System.out.println("");
        int cadastrarSenha = sc.nextInt();
        System.out.println("Digite sua senha: ");
        int senha = sc.nextInt();
        System.out.println("");
        
        if(senha == cadastrarSenha){
            System.out.printf(" Senha correta = %d", cadastrarSenha);
        } else {
            System.out.println(" Senha invalida ");
        }
        
        sc.close();
    }
}
