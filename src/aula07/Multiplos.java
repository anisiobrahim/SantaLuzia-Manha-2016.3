package aula07;

import java.util.Scanner;

public class Multiplos {
	
	public static void main(String [] args) {
		
		int valor1;
		int valor2;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("O n�mero �:");
		valor1 = teclado.nextInt();
		
		System.out.println("O n�mero �:");
		valor2 = teclado.nextInt();
		teclado.close();
		
		if(valor1 % valor2 == 0) {
			System.out.println("O n�mero � m�ltiplo:");
		}
		
		else {
			System.out.println("O n�mero n�o � multiplo:");
		}
		
				
	}

}
