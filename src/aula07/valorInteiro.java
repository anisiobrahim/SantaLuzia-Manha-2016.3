package aula07;

import java.util.Scanner;

public class valorInteiro {

	public static void main(String[] args) {
		
		int valor1;
		
		Scanner teclado = new Scanner (System.in);
		System.out.print("Digite o n�mero:");
		valor1 = teclado.nextInt();
		teclado.close();
		
		if(valor1 < 0) {
		System.out.println("O m�dulo do valor �:"+ valor1 *(-1));
		}
		
			
		System.out.println("/nNumero lido:" + valor1);
				 

	}

}
