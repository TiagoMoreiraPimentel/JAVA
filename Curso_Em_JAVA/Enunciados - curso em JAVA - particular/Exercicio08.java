package com.mycompany.lista2_Exercicios;
import java.util.Scanner;
/**
 * 8. Escreva um programa Java que leve o usuário a fornecer um único caractere do alfabeto. 
 * Imprima vogal ou consoante, dependendo da entrada do usuário. 
 * Se a entrada do usuário não for uma letra (entre a e z ou A e Z), 
 * ou for uma string de comprimento > 1.
 * @author Tiago
 */
public class Exercicio08 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Forneça um caractere do alfabeto");
        String caractere = sc.nextLine();
        if( caractere.equalsIgnoreCase("A") || caractere.equalsIgnoreCase("a")||
            caractere.equalsIgnoreCase("E") || caractere.equalsIgnoreCase("e")||
            caractere.equalsIgnoreCase("I")|| caractere.equalsIgnoreCase("i")||
            caractere.equalsIgnoreCase("O")|| caractere.equalsIgnoreCase("o")||
            caractere.equalsIgnoreCase("U")||caractere.equalsIgnoreCase("u")){
            System.out.println("Vogal");
        }else if(caractere.equalsIgnoreCase("B") || caractere.equalsIgnoreCase("b") ||
                caractere.equalsIgnoreCase("C") ||  caractere.equalsIgnoreCase("c") ||
                caractere.equalsIgnoreCase("D") ||  caractere.equalsIgnoreCase("d") ||
                caractere.equalsIgnoreCase("F") ||  caractere.equalsIgnoreCase("f") ||
                caractere.equalsIgnoreCase("G") ||  caractere.equalsIgnoreCase("g") ||
                caractere.equalsIgnoreCase("H") ||  caractere.equalsIgnoreCase("h") ||
                caractere.equalsIgnoreCase("J") ||  caractere.equalsIgnoreCase("j") ||
                caractere.equalsIgnoreCase("K") ||  caractere.equalsIgnoreCase("k") ||
                caractere.equalsIgnoreCase("L") ||  caractere.equalsIgnoreCase("l") ||
                caractere.equalsIgnoreCase("M") ||  caractere.equalsIgnoreCase("m") ||
                caractere.equalsIgnoreCase("N") ||  caractere.equalsIgnoreCase("n") ||
                caractere.equalsIgnoreCase("P") ||  caractere.equalsIgnoreCase("p") ||
                caractere.equalsIgnoreCase("Q") ||  caractere.equalsIgnoreCase("q") ||
                caractere.equalsIgnoreCase("R") ||  caractere.equalsIgnoreCase("r") ||
                caractere.equalsIgnoreCase("S") ||  caractere.equalsIgnoreCase("s") ||
                caractere.equalsIgnoreCase("T") ||  caractere.equalsIgnoreCase("t") ||
                caractere.equalsIgnoreCase("V") ||  caractere.equalsIgnoreCase("v") ||
                caractere.equalsIgnoreCase("W") ||  caractere.equalsIgnoreCase("w") ||
                caractere.equalsIgnoreCase("X") ||  caractere.equalsIgnoreCase("x") ||
                caractere.equalsIgnoreCase("Y") ||  caractere.equalsIgnoreCase("y") ||
                caractere.equalsIgnoreCase("Z") ||  caractere.equalsIgnoreCase("z")){
            System.out.println("Consoante");
        }
        else{
            System.out.println("Não é uma letra ou String > 1");          
        }
        
        sc.close();
    }
}
