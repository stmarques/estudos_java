package exericiosjava;

import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Nome do cliente: ");
		String cliente = teclado.nextLine();
		
		System.out.println("Numero da invoice: ");
		int invoice = teclado.nextInt();
		
		System.out.println("Valor da invoice: ");
		float valor = teclado.nextFloat();
		
		System.out.println("");
		
		System.out.printf("INVOICE \n - Cliente: %s \n - Invoice: %d \n - Valor: %.2f" ,cliente, invoice, valor);
		
	}

}
