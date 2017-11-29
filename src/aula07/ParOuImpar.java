package aula07;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		
		int valor1;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor:");
		
		valor1 = teclado.nextInt();
		teclado.close();
		
		if(valor1 %2 == 0){
		System.out.println("O número vai ser par");

	    }
		else{
			System.out.println("O número vai ser impar:");
		}

 }
}
