package aula07;

import java.util.Scanner;

public class EX10 {

	public static void main(String[] args) {
		
		Double salario;
		Double emprestimo;
		Double porcento;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o salario.");
		salario = teclado.nextDouble();
				
		System.out.println("Digite sua prestação.");
		emprestimo = teclado.nextDouble();
		
		teclado.close();
		
		porcento = (salario * 0.20);
		
		if(emprestimo > porcento) {
			System.out.println("A prestação é maior que 20%: ");
		}
		
		else if(emprestimo == porcento) {
			System.out.println("A prestação é igual a 20%: ");
		}
		
		else {
			System.out.println("A prestação é menor que 20%: ");
		}

	}

}
