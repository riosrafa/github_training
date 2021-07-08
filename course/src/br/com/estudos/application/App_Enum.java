package br.com.estudos.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import br.com.estudos.entidades.DepartamentoEnum;
import br.com.estudos.entidades.HoraContratada;
import br.com.estudos.entidades.Worker;
import br.com.estudos.entidades.enums.WorkerLevel;

public class App_Enum {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		
		System.out.println("Por favor, digite o nome do departamento: ");
		String departmentName = sc.nextLine();
		
		System.out.println("Digite a data do trabalho: ");
		System.out.print("Digite o nome ");
		String workerName = sc.nextLine();
		
		System.out.print("Digite o level: ");
		String workerLevel = sc.nextLine();
		
		System.out.print("Digite a base salarial: ");
		double baseSalarial = sc.nextDouble();
		
		// criamos o obj
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalarial, new DepartamentoEnum(departmentName));
		
		System.out.println("Quantos contratos o trabalhador vai ter: ");
		int n = sc.nextInt();
		
		for(int i=0;i < n;i++) {
			System.out.println("Entre com o contrato: " + i + " data: ");
			System.out.print("Data (dd/mm/yyyy): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valorHora = sc.nextDouble();
			System.out.print("Duração horas: ");
			int horas = sc.nextInt();
			HoraContratada contratoHora = new HoraContratada(contractDate, valorHora, horas);
			worker.addContract(contratoHora);
		
		}
		
		System.out.println();
		System.out.print("Entre com o mes e ano para calcular o salario: (mm/yyyy): ");
		String mesAno = sc.next();
		int mes = Integer.parseInt(mesAno.substring(0, 2));
		int ano = Integer.parseInt(mesAno.substring(3));
		
		System.out.println("Nome: " + worker.getName());
		System.out.println("Departamento: " + worker.getDepartamento().getName());
		System.out.println("Quanto o trabalhador ganhou no mes/ano informado: " + mesAno + ": " + String.format("%.2f",worker.income(ano, mes)));
		
		
		sc.close();
	}

}
