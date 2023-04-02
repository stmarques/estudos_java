package exericiosjava;

public class AdicionarRemoverLinha {

	public static void main(String[] args) {
	
	String exemplo1 = "Primeiro exemplo";
	exemplo1 += "\n - Nova linha";	//adicionar linha
	System.out.println(exemplo1);
		
	String exemplo2 = "\n Segundo exemplo"; //pular linha com recuo
	exemplo2 += System.lineSeparator() + "- Nova linha"; //adicionar linh
	System.out.println(exemplo2);
	
	
	String exemplo3 = "Terceiro exemplo: \n - Nova linha";
	String removedLineBreak = exemplo3.replaceAll("\\r\\n", "");
	System.out.println(removedLineBreak);
	
	
}
}

