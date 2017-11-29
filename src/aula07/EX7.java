package aula07;

import java.util.Scanner;

public class EX7 {
	
	public static void main(String[] args) {
		
		int valor1;
		int valor2 = 0 ;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("O número é:");
		valor1 = teclado.nextInt();
		
		System.out.println("O número é:");
		valor2 = teclado.nextInt();
		teclado.close();
		
		if(valor1 > valor2) {
			System.out.println("O valor 1 é maior:");
		}
		
		else if(valor1 == valor2) {
			System.out.println("Os valores são iguais:");
		}
		
		else {
			System.out.println("O valor 2 é maior:");
		}
		
	}

}
