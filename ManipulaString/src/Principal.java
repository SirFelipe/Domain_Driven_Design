import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// M�todo length(): retorna a quantidade de caracteres
		// que existem em uma String
		String uf=JOptionPane.showInputDialog
				("Digite a UF").toUpperCase();
		if (uf.length()==2){
			System.out.println("Estado v�lido");
		}
		// M�todo toUpperCase()/toLowerCase(): converte
		// o conte�do de uma String para caixa alta ou
		// baixa.
		
		// Metodo equals(): compara dois valores do tipo 
		// String, este m�todo diferencia letras mai�sculas 
		// de min�sculas
		
		if (uf.equals("SP")){
			System.out.println("S�o Paulo");
		}else if (uf.equals("RJ")){
			System.out.println("Rio de Janeiro");
		}else{
			System.out.println("Consulte o atlas");
		}
		// Metodo indexOf(): retorna a posi��o do caracter ou 
		// substring dentro de uma String.
		String email=JOptionPane.showInputDialog("Digite o email");
		System.out.println(email.indexOf('@'));
		if(email.indexOf('@')>0){
			System.out.println("Email v�lido!");
		}else{
			System.out.println("Juninho errou....");
		}
		
		// Metodo charAt(): retorna um dado do tipo "char" com
		// base em uma posi��o da String
		char genero = JOptionPane.showInputDialog
				("Digite o genero:").toUpperCase().charAt(0);
		if (genero=='M'){
			System.out.println("Masculino");
		}else if (genero=='F'){
			System.out.println("Feminino");
		}else{
			System.out.println("Genero inv�lido");
		}
		// Metodo substring(): permite retornar uma parte da String
		// atrav�s das coordenadas de inicio e fim.
		System.out.println(email.substring(0, 3));
		//Exibir a primeira metade
		System.out.println(email.substring(0, email.length()/2));
		//Exibir a segunda metade
		System.out.println(email.substring(email.length()/2));
		//Exibir o nome do usu�rio do email
		System.out.println(email.substring(0,email.indexOf('@')));
		//Exibir o servidor do email
		System.out.println(email.substring(email.indexOf('@')+1));
	}

}




