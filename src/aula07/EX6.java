package aula07;

import java.util.Scanner;

public class EX6 {

	public static void main(String[] args) {
		
		int x;
		int y;
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe x: ");
		x = teclado.nextInt();
		
		System.out.print("Informe y: ");
		y = teclado.nextInt();
		teclado.close();
		
		if(x > y) {
			System.out.println("O x é maior que y:" + (x + y));
		}
		
		else {
			System.out.println("O y é maior que x:" + (x*y));
		}

	}

}
