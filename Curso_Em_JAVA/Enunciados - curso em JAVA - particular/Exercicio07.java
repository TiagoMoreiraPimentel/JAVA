package com.mycompany.lista2_Exercicios;
import java.util.Scanner;
/**
 * 7. Escreva um programa Java para encontrar o número de dias em um mês.
 * @author Tiago
 */
public class Exercicio07 {
    public static void main(String[] args) {
        
        /*
            Programa que calcula a quantidade de dias que possui no mês especifico.
        */
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("Digite o numero do mês: ");
        System.out.println("");
        System.out.println("  1 - Janeiro\n "
                + " 2 - Fevereiro\n "
                + " 3 - Março\n "
                + " 4 - Abril\n "
                + " 5 - Maio\n "
                + " 6 - Junho\n "
                + " 7 - Julho\n "
                + " 8 - Agosto\n "
                + " 9 - Setembro\n "
                + "10 - Outubro\n "
                + "11 - Novembro\n "
                + "12 - Dezembro\n");
        
        System.out.println("Digite sua opção: ");
        int mes = sc.nextInt();
        
        if(mes == 1){
            System.out.println("Você escolheo o mês de Janeiro.");
            System.out.println("O mês de Janeiro possui 31 dias.");
        }else if(mes == 2){
            System.out.println("Você escolheo o mês de Fevereiro.");
            System.out.println("O mês de Fevereiro possui 28 dias.");
        }else if(mes == 3){
            System.out.println("Você escolheo o mês de Março.");
            System.out.println("O mês de Março possui 31 dias.");
        }else if(mes == 4){
            System.out.println("Você escolheo o mês de Abril.");
            System.out.println("O mês de Abril possui 30 dias.");
        }else if(mes == 5){
            System.out.println("Você escolheo o mês de Maio.");
            System.out.println("O mês de Maio possui 31 dias.");
        }else if(mes == 6){
            System.out.println("Você escolheo o mês de Junho.");
            System.out.println("O mês de Junho possui 30 dias.");
        }else if(mes == 7){
            System.out.println("Você escolheo o mês de Julho.");
            System.out.println("O mês de Julho possui 31 dias.");
        }else if(mes == 8){
            System.out.println("Você escolheo o mês de Agosto.");
            System.out.println("O mês de Agosto possui 31 dias.");
        }else if(mes == 9){
            System.out.println("Você escolheo o mês de Setembro.");
            System.out.println("O mês de Setembro possui 30 dias.");
        }else if(mes == 10){
            System.out.println("Você escolheo o mês de Outubro.");
            System.out.println("O mês de Outubro possui 31 dias.");
        }else if(mes == 11){
            System.out.println("Você escolheo o mês de Novembro.");
            System.out.println("O mês de Novembro possui 30 dias.");
        }else if(mes == 12){
            System.out.println("Você escolheo o mês de Dezembro.");
            System.out.println("O mês de Dezembro possui 31 dias.");
        }
        else{
            System.out.println("Opção invalida!");
        }
            
        sc.close();
    }
}
