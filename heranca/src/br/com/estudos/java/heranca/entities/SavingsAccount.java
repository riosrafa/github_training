package br.com.estudos.java.heranca.entities;

public class SavingsAccount extends Account {

	private Double interestRate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public void upateBalance() {
		balance += balance * interestRate;
	}
	
	//quando temos Override em alguma classe, ela indica que estamos sobre posicao de metodo
	@Override 
	public void withdraw(double amount) {
		balance -= amount;
	}
}
