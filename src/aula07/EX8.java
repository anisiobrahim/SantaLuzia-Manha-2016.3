package aula07;

import java.util.Scanner;

public class EX8 {

	public static void main(String[] args) {
		
		int ano;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("O ano bissexto �: ");
		ano = teclado.nextInt();
		teclado.close();
		
		if((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)) {
			System.out.println("O ano � bissexto: ");
		}
		
		else {
			System.out.println("O ano n�o � bissexto: ");
		}
		
	}

}
