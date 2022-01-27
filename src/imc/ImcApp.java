package imc;

import java.util.Scanner;

public class ImcApp {

	public static void main(String[] args) {
		
				
		//Declaração das variáveis
		double pesoDoUsuario;
		double altura, valorImc; 
		String nomeDoUsuario;
		Imc imc = new Imc();
		
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
		
		valorImc = imc.calcularImc(pesoDoUsuario, altura);
						
		System.out.println("\n" + nomeDoUsuario + ", seu IMC é: " + valorImc);
		
		imc.classificarImc(valorImc);
		
			
	} // FECHANDO A MAIN 

} // FECHANDO A CLASSE 
