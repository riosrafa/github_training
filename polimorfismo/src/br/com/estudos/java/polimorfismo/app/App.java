package br.com.estudos.java.polimorfismo.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.estudos.java.polimorfismo.entities.Employee;
import br.com.estudos.java.polimorfismo.entities.OutsourcedEmployee;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		List <OutsourcedEmployee> lista2 = new ArrayList<>();
		
		List <Employee> lista1 = new ArrayList<>();
		
		for(int i = 1; i<=n; i++) {
			System.out.println("Employee # " + i + "data: ");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.println("Name: ");
			sc.nextLine();//quebra de linha
			String name = sc.nextLine();
			System.out.println("Hours: ");
			int hours = sc.nextInt();
			System.out.println("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if(ch == 'y') {
				System.out.println("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				/*Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);  
				//lista1.add(emp);
				   uma forma mais elegante é, criar o obj no momento de add na lista*/
				lista1.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			}
			else {
				//Employee emp = new Employee(name, hours, valuePerHour);
				lista1.add(new Employee(name, hours, valuePerHour));
			}
			
		}
		System.out.println("#######################");
		System.out.println("PAYMENTS: ");
		
		for(Employee emp : lista1) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
			
		}
		
		sc.close();
	}

}
