package exericiosjava;

import java.util.Date;

public class SaidaDados {

	public static void main(String[] args) {

		System.out.println("INVOICE");
		String preferredName = "Amanda";
		int invoice = 26;
		float valorVenda = 15000f;
		Date data = new Date();
		
		System.out.printf("Ola %s, \n Segue a invoice do seu pedido. \n Invoice: %d \n Valor: %.2f \n" ,preferredName, invoice, valorVenda);
		System.out.printf("Data da compra: " + data);

	}

}
