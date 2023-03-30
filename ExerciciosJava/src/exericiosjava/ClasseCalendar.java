package exericiosjava;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

/*
*	A classe data pode produzir valores de todos os campos de calendário
*	necessários para implementar a formatação de data e hora, para um
*	determinado idioma e calendário como o português, japonês, italiano, etc.
*/

public class ClasseCalendar {

	public static void main(String[] args) {
		
		System.out.printf("EXERCÍCIO: CLASSE CALENDAR \n");
		/*  
		* 	GET CALENDAR
		*	A classe Calendar é mais usada quando se trata de datas, mas como é uma 
		*	classe abstrata, não pode ser instanciada, portanto para obter um calendário atual
		*	é necessário usar o método estático getInstance().
		*/	
		
		System.out.println("\n MOSTRAR DATA E HORA ATUAL");
		
		Calendar testeGet = Calendar.getInstance();
		System.out.println("- Data e hora: " + testeGet.getTime());
		System.out.println("- Ano:" + testeGet.get(Calendar.YEAR));
		System.out.println("- Mês: " + testeGet.get(Calendar.MONTH));
		System.out.println("- Dia do mês: " +testeGet.get(Calendar.DAY_OF_MONTH));
		
		/*
		*	SET E GET CALENDAR
		*/
		
		System.out.println("\n MOSTRAR DATA E HORA MANIPULADOS");
		
		Calendar testeSetGet = Calendar.getInstance();
		testeSetGet.set(Calendar.YEAR,1995);
		testeSetGet.set(Calendar.MONTH, Calendar.MARCH);
		testeSetGet.set(Calendar.DAY_OF_MONTH, 20);
			
		System.out.println("- Data e hora: "+testeSetGet.getTime());
		System.out.println("- Ano: "+testeSetGet.get(Calendar.YEAR));
		System.out.println("- Mês: "+testeSetGet.get(Calendar.MONTH));
		System.out.println("- Dia do mês: "+testeSetGet.get(Calendar.DAY_OF_MONTH));
		
		/*
		*	CONDIÇÃO ELSE IF
		*/
		
		System.out.println("\n INTERAGIR COM O USUÁRIO USANDO CONDIÇÃO ???");
		
		Calendar testeElseIf = Calendar.getInstance();
		int hora = testeElseIf.get(Calendar.HOUR_OF_DAY);
	
		if(hora > 6 && hora < 12);{
			System.out.println("- Bom dia!");
		}if(hora > 12 && hora < 18){
			System.out.println("- Boa tarde!");
		}else{
			System.out.println("- Boa noite!");
		}
		
		/*
		*	FORMATAR DATA E HORA 
		*/
		
		System.out.println("\n FORMATAR DATA E HORA ???");
		
		Calendar testeFormatar = Calendar.getInstance();
		testeFormatar.set(2013, Calendar.FEBRUARY, 28);
		Date data = testeFormatar.getTime();
		System.out.println("- Data atual sem formatação: "+data);
		
		//Formatar a data
		DateFormat formatarData = DateFormat.getDateInstance();
		System.out.println("- Data atual com formatação: "+formatarData.format(data));
		
		//Formatar data e hora
		DateFormat formatarHora = DateFormat.getDateTimeInstance();
		System.out.println("- Hora atual com formatação: "+formatarHora.format(data));
		
		//Formatar data e hora
		DateFormat formatarDataHora = DateFormat.getDateTimeInstance();
		System.out.println("- Data e horal atual com formatação: "+formatarDataHora.format(data));

		/*
		*	FORMATAR SAÍDA DA DADOS
		*/
		
		System.out.println("\n FORMATAR SAÍDA DE DADOS ???");
		
		Calendar c = Calendar.getInstance();
		Date d = c.getTime();
		
		DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("Data brasileira: "+f.format(d));
		
		DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("Data sem o dia descrito: "+f.format(d));
		
		
		DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("Data resumida 1: "+f.format(d));
		
		DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("Data resumida 2: "+f.format(d));
		
		/*
		 * CONVERSÕES
		 * 
		 *	Às vezes é preciso transformar um texto em uma data ou vice e versa,
		 *	para isso abaixo é exibida a função parse e a classe SimpleDateFormat. 
		 *	Geralmente a classe SimpleDateFormat é mais usada quando trata-se de 
		 *	formatação de datas, pois já no seu construtor, quando instanciada, 
		 *	permite passar como argumento o formato da data desejada, como apresentada abaixo.
		 */
		
		System.out.println("\n CONVERTER DATAS");
	
		 
		
	}
}