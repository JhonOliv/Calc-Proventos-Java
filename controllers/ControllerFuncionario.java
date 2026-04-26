package controllers;

import exceptions.ArrayFuncionarioIsEmpty;
import models.Funcionario;
import models.TodosFuncionarios;

public class ControllerFuncionario {
	
	private int horasBase = 160;
	
	public void calcSalarioTodosFuncionarios (TodosFuncionarios tdFunc) throws ArrayFuncionarioIsEmpty {
		
		for(Funcionario func : tdFunc.getAllFuncionarios()) {
				System.out.println("Nome Funcionário: " + func.getNamePessoa());
				
				
				System.out.println("CPF Funcionário: " + func.getCpf());
				
				System.out.println("Data Contratação: " + func.getDataContratacao());
				
				System.out.println("Salario Base: " + 	func.getSalarioBase());
				
				System.out.println("Horas trabalhadas no mês: " + func.getHorasTrabalhadas());
				
				double valorPagoPorHora =  func.getSalarioBase() / horasBase;
				
				System.out.println("Valor pago por hora: R$ " + valorPagoPorHora );
				
				double horaextra = func.getHorasTrabalhadas() - horasBase;
				
				if(horaextra != 0) {
					double valorHoraExtra = valorPagoPorHora + (valorPagoPorHora * 0.5);
					System.out.println("Valor Pago pelas horas extras é: " + valorHoraExtra);
					
					double salarioTotal = horaextra + func.getSalarioBase();
					
					if(salarioTotal > 3000) {
						float taxInss = 8;
						System.out.println("Salário Liquido : " + (salarioTotal - ((salarioTotal * taxInss) / 100 )) );
					}else {
						float taxInss = 5;
						System.out.println("Salário Liquido : " + (salarioTotal - ((salarioTotal * taxInss) / 100 )) );
					}
				}
					
		}
		
		
		
		
	}
	
	
		public void calcSalarioFuncionario(	TodosFuncionarios tdFunc, String cpf) throws ArrayFuncionarioIsEmpty {
		
			for(Funcionario func : tdFunc.getAllFuncionarios()) {
				
				if(func.getCpf().equals(cpf)) {
					
				
					System.out.println("Nome Funcionário: " + func.getNamePessoa());
					
					
					System.out.println("CPF Funcionário: " + func.getCpf());
					
					System.out.println("Data Contratação: " + func.getDataContratacao());
					
					System.out.println("Salario Base: " + 	func.getSalarioBase());
					
					System.out.println("Horas trabalhadas no mês: " + func.getHorasTrabalhadas());
					
					double valorPagoPorHora =  func.getSalarioBase() / horasBase;
					
					System.out.println("Valor pago por hora: R$ " + valorPagoPorHora );
					
					double horaextra = func.getHorasTrabalhadas() - horasBase;
					
					if(horaextra != 0) {
						double valorHoraExtra = valorPagoPorHora + (valorPagoPorHora * 0.5);
						
						System.out.println("Valor Pago pelas horas extras é: " + valorHoraExtra);
						
						double salarioTotal = func.getSalarioBase() + (horaextra * valorHoraExtra);
						
						
						if(salarioTotal > 3000) {
							float taxInss = 8;
							
							System.out.println("Salário Liquido : " + (salarioTotal - ((salarioTotal * taxInss) / 100 )) );
						}else {
							float taxInss = 5;
							System.out.println("Salário Liquido : " + (salarioTotal - ((salarioTotal * taxInss) / 100 )) );
						}
					  }
				}
					
		}
		
		
		
	
		}
	
	
	
	
	
	
	

}
