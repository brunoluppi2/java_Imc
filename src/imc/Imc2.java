package imc;

import java.util.Scanner;

public class Imc2 {

	public static void main(String[] args) {
		
		//Declara��o das vari�veis
		int pesoDoUsuario;
		double altura, imc; 
		String nomeDoUsuario, emailDoUsuario;

				
		//Ler o teclado do usu�rio
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Qual o seu nome?");
		nomeDoUsuario = leitor.nextLine() ;
		
		System.out.println("\nQual o seu email?");
		emailDoUsuario = leitor.nextLine() ;
		
		//Criando as vari�veis para o c�lculo
		System.out.println("\nDigite seu peso");
		pesoDoUsuario = leitor.nextInt();
		
		System.out.println("\nDigite sua altura");
		altura = leitor.nextDouble();
		
		leitor.close();
		
		imc = pesoDoUsuario / (altura * altura);
		
		System.out.println("\n" + nomeDoUsuario + ", seu IMC �: " + imc);
		
		//Trazer o caractere que est� na posi��o 3 usando charAT
		System.out.println("\n" + nomeDoUsuario.charAt(2));
		
		//Verificar se o email termina com br com endsWith
		System.out.println("\n" + emailDoUsuario.endsWith("br"));

		System.out.println("\n" + emailDoUsuario.toUpperCase());
	}

}
