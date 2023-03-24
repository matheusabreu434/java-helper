package aula;

public class Main {
		
		public static void main (String[] args) {
			/*int idade = 24;
			System.out.println("Minha idade é "+idade);
			idade = 1;	
			System.out.println("Minha idade é "+idade);
			System.out.println("Hello World!");
			 */
//Tipos de variáveis
			/*
			int numero = 24;
			String frase = "Hello World";
			boolean var = true;
			char var2 = 'a';
			double var3 = 24.9;			
	
			System.out.println(numero);
			System.out.println(frase);
			System.out.println(var);
			System.out.println(var2);
			System.out.println(var3);
			*/
//Constantes
			/*
			final int vida_maxima = 10;
			System.out.println(vida_maxima);
			*/
//Arrays normal
			/*
			String[] nome = new String [5];
			nome[0]= "Matheus";
			nome[1]= "Jao";
			*/
//Arrays MultiDimonesional
			/*
			String[][] var2 = new String [5][5];
			var2[0][0] = "Felipe";
			System.out.println("O nome é "+var2[0][0]);
			*/
//Condições
			//int vida = 100;
			/*
			>
			<
			>=
			<=
			==
			!=
			*/
			/*
			if(vida == 100) {
				vida+=100;
				System.out.println("Minha vida é 100");
			}else {
				System.out.println("Minha vida não é igual a 100");
			}
			
			
			String nome = "Guilherme";
			if(nome == "Guilherme") {
				System.out.println("Nome igual a "+ nome);
			}else if(nome == "Joao") {
		
			}else if(nome == "Felipe") {
				
			}else {
				
			}
			
			if(nome != "Joao") {
				System.out.println ("O nome é diferente de joao"); 
			}
			
			boolean var = true;
			if(var == true) {
		    //if(var)
				System.out.println("Verdade");
			System.out.println("");
			*/
			
//Switch para conferencias
			int vida = 90;
			
			switch(vida)
			{
				case 90:
				//Execute alguma ação
				System.out.println("meu personagem corra mais rapido");
				break;
				case 30:
				System.out.println("Minha vida é igual a 30");
				break;
				default:
				System.out.println("nenhuma condição bateu! Tenho 100 de vida");
				break;
			}
}					
}

