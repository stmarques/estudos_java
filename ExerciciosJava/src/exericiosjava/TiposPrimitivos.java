package exericiosjava;

import java.util.Scanner;

public class TiposPrimitivos {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o nome do aluno: ");
		String nome = teclado.nextLine();
		
		System.out.print("Digite a nota do aluno: ");
		float nota1 = teclado.nextFloat();
		
		//System.out.print("Nota:" + nota1); //impressão simples		
		//System.out.println("Nota: " + nota1); //impressão pulando uma linha		
		System.out.printf("Nota de %s: %.5f \n", nome, nota1); //impressão formatada
		System.out.format("Nota de %s: %.2f \n", nome, nota1); //impressão formatada
		
		
		

	}

}
