package aula07;

import java.util.Scanner;

public class EX7 {
	
	public static void main(String[] args) {
		
		int valor1;
		int valor2 = 0 ;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("O n�mero �:");
		valor1 = teclado.nextInt();
		
		System.out.println("O n�mero �:");
		valor2 = teclado.nextInt();
		teclado.close();
		
		if(valor1 > valor2) {
			System.out.println("O valor 1 � maior:");
		}
		
		else if(valor1 == valor2) {
			System.out.println("Os valores s�o iguais:");
		}
		
		else {
			System.out.println("O valor 2 � maior:");
		}
		
	}

}
