package imc;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		
		//Declaração das variáveis
		double pesoDoUsuario;
		double altura, imc; 
		String nomeDoUsuario;
				
		//Ler o teclado do usuário
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Qual o seu nome?");
		nomeDoUsuario = leitor.nextLine() ;
		
		//Criando as variáveis para o cálculo
		System.out.println("\nDigite seu peso");
		pesoDoUsuario = leitor.nextDouble();
		
		System.out.println("\nDigite sua altura");
		altura = leitor.nextDouble();
		
		leitor.close();
		
		imc = pesoDoUsuario / (altura * altura);
		
		System.out.println("\n" + nomeDoUsuario + ", seu IMC é: " + imc);
		
		// Determinar a classificação do IMC.
		if (imc < 18.5) {
			System.out.println("Você está ABAIXO DO PESO!");
		} else if (imc >= 18.5 && imc < 25) {
			System.out.println("Você está DENTRO DO PESO!");
		} else if (imc >= 25 && imc < 30) {
			System.out.println("Você está ACIMA DO PESO!");		
		}
		
	} // FECHANDO A MAIN

} // FECHANDO A CLASSE
