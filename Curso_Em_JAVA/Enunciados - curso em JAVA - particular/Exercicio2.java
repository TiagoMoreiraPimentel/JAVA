/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.exercicio2;

import java.util.Scanner;

/**
 * Escreva um programa Java para resolver equações quadráticas (use if, else if
 * e else). Ir para o editor 	Dados de teste 	
 * Entrada a: 1 	
 * Entrada b: 5 
 * Entrada c: 1 	
 * Saída Esperada:  As raízes são -0,20871215252208009 e -4,7912878474779195
 *
 * @author Tiago
 */
public class Exercicio2 {

    public static void main(String[] args) {

        float a, b, c, //coeficientes
                delta, //delta
                sqrtdelta, //raiz quadrada de delta
                raiz1, raiz2;  //raízes
        
        Scanner entrada = new Scanner(System.in);
        
        //Passo 1: Recebendo os coeficientes
        System.out.print("Entre com o valor de a: ");
        a = entrada.nextFloat();
        System.out.print("Entre com o valor de b: ");
        b = entrada.nextFloat();
        System.out.print("Entre com o valor de c: ");
        c = entrada.nextFloat();

        //Passo 2: Checando se a equação é válida
        if (a != 0) {

            //Passo 3: recebendo o valor de delta e calculando sua raiz quadrada
            delta = (b * b) - (4 * a * c);
            sqrtdelta = (float) Math.sqrt(delta);

            //Passo 4: se a raiz de delta for maior que 0, as raízes são reais    
            if (delta >= 0) {
                raiz1 = ((-1) * b + sqrtdelta) / (2 * a);
                raiz2 = ((-1) * b - sqrtdelta) / (2 * a);
                System.out.printf("Raízes: %.17f e %.17f", raiz1, raiz2);
            ]
            } //Passo 5: se delta for menor que 0, as raízes serão complexas
            else {
                delta = -delta;
                sqrtdelta = (float) Math.sqrt(delta);
                System.out.printf("Raíz 1: %.17f + i.%f\n", (-b) / (2 * a), (sqrtdelta) / (2 * a));
                System.out.printf("Raíz 2: %.17f - i.%f\n", (-b) / (2 * a), (sqrtdelta) / (2 * a));

            }

        } else {
            System.out.println("Coeficiente 'a' inválido.");
        }
    }

}
