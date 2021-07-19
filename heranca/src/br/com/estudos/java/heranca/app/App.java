package br.com.estudos.java.heranca.app;

import br.com.estudos.java.heranca.entities.Account;
import br.com.estudos.java.heranca.entities.BusinessAccount;
import br.com.estudos.java.heranca.entities.SavingsAccount;

public class App {

	public static void main(String[] args) {

		Account acc1 = new Account(1001, "rafa", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1002, "jao",1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003, " pedro", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
		
		
		
	}

}
