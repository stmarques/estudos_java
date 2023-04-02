package exericiosjava;

public class ConversaoTipos {

	public static void main(String[] args) {
		
		//	Converter um tipo string em tipo inteiro
		String valor1 = "10";
		int idade1 = Integer.parseInt(valor1);
		System.out.println(idade1);
		
		//	Converter um tipo inteiro em tipo string
		int idade2 = 20;
		String valor2 = Integer.toString(idade2);
		System.out.println(valor2);
		
		//	Converter um tipo string em tipo float
		String valor3 = "30.5";
		float idade = Float.parseFloat(valor3);
		System.out.printf("%.2f", idade);

	}

}
