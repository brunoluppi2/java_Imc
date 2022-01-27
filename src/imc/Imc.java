package imc;

public class Imc {

	double calcularImc(double peso, double altura) {

		double imc = (peso / (altura * altura));

		return imc;
	}

	void classificarImc(double imc) {
		
		// Determinar a classificação do IMC.
		if (imc < 18.5) {
			System.out.println("Você está ABAIXO DO PESO!");
		} else if (imc >= 18.5 && imc < 25) {
			System.out.println("Você está DENTRO DO PESO!");
		} else if (imc >= 25 && imc < 30) {
			System.out.println("Você está ACIMA DO PESO!");
		} else {
			System.out.println("Você esta com OBESIDADE!");
			
		}
	}

} // FECHANDO A CLASSE
