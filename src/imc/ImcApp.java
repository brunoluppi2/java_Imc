package imc;

import java.util.Scanner;

public class ImcApp {

	public static void main(String[] args) {
		
				
		//Declara��o das vari�veis
		double pesoDoUsuario;
		double altura, valorImc; 
		String nomeDoUsuario;
		Imc imc = new Imc();
		
		//Ler o teclado do usu�rio
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Qual o seu nome?");
		nomeDoUsuario = leitor.nextLine() ;
		
		//Criando as vari�veis para o c�lculo
		System.out.println("\nDigite seu peso");
		pesoDoUsuario = leitor.nextDouble();
		
		System.out.println("\nDigite sua altura");
		altura = leitor.nextDouble();
		
		leitor.close();
		
		valorImc = imc.calcularImc(pesoDoUsuario, altura);
						
		System.out.println("\n" + nomeDoUsuario + ", seu IMC �: " + valorImc);
		
		imc.classificarImc(valorImc);
		
			
	} // FECHANDO A MAIN 

} // FECHANDO A CLASSE 
