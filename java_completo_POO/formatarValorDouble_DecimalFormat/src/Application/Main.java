
package Application;

import java.text.DecimalFormat;
import java.util.Scanner;

/* Solução de formatação de valor double em java. */
/* Autor: Tiago */
 
public class Main {

	public static void main(String[] args) {

		// Instanciando o metodo Scanner para capturar o numero.
		Scanner sc = new Scanner(System.in);
		
		// Imprimindo na tela uma mensagem.
		System.out.println("Digite um numero: ");
		
		// Variavel que armazena o valor do numero digitado.
		Double n = sc.nextDouble();

		/*Variavem com que armazena a formatação 
		que a classe DecimalFormat irá utilizar 
		para converter o numero.*/
		String formato = "###,###.00";
		
		// Instancia a função que formata o valor.
		DecimalFormat df = new DecimalFormat(formato);

		// imprime na tela o resultado formatado.
		System.out.println(df.format(n));
		
		sc.close();
	}
}
