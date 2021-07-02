package br.com.estudos.entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.estudos.entidades.enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalarial;
	
	private Departamento_enum departamento;
	private List<HoraContrada> contratos = new ArrayList<>();
	
	public Worker() {
		
	}

	public Worker(String name, WorkerLevel level, Double baseSalarial, Departamento_enum departamento) {

		this.name = name;
		this.level = level;
		this.baseSalarial = baseSalarial;
		this.departamento = departamento;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalarial() {
		return baseSalarial;
	}

	public void setBaseSalarial(Double baseSalarial) {
		this.baseSalarial = baseSalarial;
	}

	public Departamento_enum getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento_enum departamento) {
		this.departamento = departamento;
	}

	public List<HoraContrada> getContratos() {
		return contratos;
	}

	public void setContratos(List<HoraContrada> contratos) {
		this.contratos = contratos;
	}
	
	// metodo add contratos
	public void addContract(HoraContrada contrato) {
		contratos.add(contrato);
	}
	//metodo remove associacao do contrato com o trabalhador. 
	public void removeContrato(HoraContrada contrato) {
		contratos.remove(contrato);
	}
	
	public double income(int ano, int mes) {
		double sum = baseSalarial;
		Calendar cal = Calendar.getInstance();
		for ( HoraContrada c : contratos) {
			cal.setTime(c.getDate());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = cal.get(Calendar.MONTH);
			if(ano == c_ano && mes == c_mes) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
}
