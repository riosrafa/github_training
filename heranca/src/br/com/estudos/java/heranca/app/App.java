package br.com.estudos.java.heranca.app;

import br.com.estudos.java.heranca.entities.Account;
import br.com.estudos.java.heranca.entities.BusinessAccount;
import br.com.estudos.java.heranca.entities.SavingsAccount;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Account acc = new Account(1001, "Jao", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002,"marcela", 0.0, 500.0);
		
		//UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003,"jadson", 0.0, 200.0);
		Account acc3 = new BusinessAccount(1004,"Felipe", 0.0, 100.0);
		
		//DOWNCASTING
		/* Aqui somos obg a realizar o cast, devido ao obj acc4 ser da classe business
		 *  e o outro obj que ele recebe é da classe pai, acc2. 
		 * */
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount)acc3;
	    /*Nesse ponto, conseguimos testar se o nosso DOWNCASTING antes de rodar*/
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Deu certo, ufa!!!");
		}
		if(acc3 instanceof SavingsAccount ) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.upateBalance();
			System.out.println("Deu certo, Ufa!!!");
		}
	}

}
