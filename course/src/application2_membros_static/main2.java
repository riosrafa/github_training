package application2_membros_static;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class main2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	Calculator calculo = new Calculator();// ao criar o objeto,  
	
	System.out.println("Entre com o raio: ");
	double raio = sc.nextDouble();
	
	double c = calculo.circuferencia(raio);//aqui usamos o obejto calculo, para chamar a função
	
	double v = calculo.volume(raio);//aqui o mesmo processo com o objeto
	
	System.out.printf("Result volume: %.2f%n", c);
	System.out.printf("Result circuferencia: %.2f%n",v);		
	System.out.printf("Entre com o raio: ",calculo.pi);
	
	
	sc.close();
	
	}
	
	
}
