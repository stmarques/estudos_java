package exericiosjava;

import java.util.Date;

public class SaidaDados {

	public static void main(String[] args) {
	
	System.out.println("INVOICE");
	String cliente = "Amanda";
	int invoice = 26;
	float valor = 15000f;
	Date data= new Date();
	
	System.out.printf("Olá %s, \n Segue a invoice do seu pedido: \n - Invoice: %d \n - Valor: %.2f \n" ,cliente, invoice, valor, data);
	System.out.printf("Data da compra: " + data);
	
	}

}
