package exericiosjava;

import java.util.Date;

/*
*A maioria dos métodos da classe Date estão classificados como deprecated (depreciado), 
*ou seja, são métodos que não são mais utilizados, por isso essa classe foi substituída pela classe Calendar,
*para haver suporte correto à internacionalização do sistema de datas.
*/

public class ClasseDate {
	public static void main (String[] args) {
		Date data = new Date();
		System.out.println("Data Agora: " + data);
	}
				
}


