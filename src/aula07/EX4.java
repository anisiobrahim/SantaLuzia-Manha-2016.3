package aula07;

import java.util.Scanner;

public class EX4 {

	public static void main(String[] args) {
		
		int valor1;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("O valor apresentado �:");
		valor1 = teclado.nextInt();
		teclado.close();
		
		if(valor1<0) {
			System.out.println("O N�mero � menor que zero");
		}
		
		else if(valor1 == 0) {
		
			System.out.println("O N�mero � igual a zero");
			
		}
		
		else {
			
			System.out.println("O N�mero � maior que zero");
			
		}
				
	}

}
