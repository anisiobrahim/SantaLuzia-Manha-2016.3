package aula07;

import java.util.Scanner;

public class Multiplos {
	
	public static void main(String [] args) {
		
		int valor1;
		int valor2;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("O número é:");
		valor1 = teclado.nextInt();
		
		System.out.println("O número é:");
		valor2 = teclado.nextInt();
		teclado.close();
		
		if(valor1 % valor2 == 0) {
			System.out.println("O número é múltiplo:");
		}
		
		else {
			System.out.println("O número não é multiplo:");
		}
		
				
	}

}
