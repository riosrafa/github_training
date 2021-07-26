package br.com.estudos.java.exercicios.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import br.com.estudos.java.exercicios.entities.ClientEx2;
import br.com.estudos.java.exercicios.entities.OrderItemEx2;
import br.com.estudos.java.exercicios.entities.ProductEx2;

public class ProgramaEx2 {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

		
		
		ProductEx2 p1 = new ProductEx2( "tv", 1000.00);
		/*criamos o obj item, com um produto assoaciado a ele,
		   no caso o outro obj productEx2, ele fara o link entre os dois
		   */
		OrderItemEx2 OrdIt1 = new OrderItemEx2(1,1000.0,p1);
		
		//como temos o metodo toString, podemos imprimir usando o obj
		//System.out.println(OrdIt1.ToString());
		System.out.println(OrdIt1);
		
		ClientEx2 c1 = new ClientEx2("jao", "jao.@gmail.com",sdf.parse("10/10/2010") );
		System.out.println(c1);
	
		
	
	
	sc.close();
	}

}
