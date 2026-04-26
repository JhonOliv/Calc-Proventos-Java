package models;

import java.util.ArrayList;
import java.util.List;

import exceptions.ArrayFuncionarioIsEmpty;

public class TodosFuncionarios {
	
	
	private List<Funcionario> todosFuncionarios = new ArrayList<>();
	
	
	public void setFuncionario(Funcionario func) {
		
		// Tratativa de Erro para caso funcionário já existente!
		
		for (Funcionario funcionario : todosFuncionarios) {
			if(func.getCpf().equals(funcionario.getCpf())) {
				System.out.print("Funcionário Já cadastrado!!");
			}
		}
		
		if(func != null) {
			this.todosFuncionarios.add(func);
		}else {
			System.out.println("Erro ao inserir o na lista de funcionarios!");
		}
		
	}
	
	public Funcionario getFuncionario(String cpf) {
		
		for (Funcionario func : this.todosFuncionarios) {
			if(func.getCpf().equals(cpf)) {
				return func;
			}	
		}
		
		return null;
	}
	
	public List<Funcionario> getAllFuncionarios() throws ArrayFuncionarioIsEmpty {
		
		if(this.todosFuncionarios.isEmpty()) {
			throw new ArrayFuncionarioIsEmpty("Lista está vazia, verifique !!!");
		}
		
		return this.todosFuncionarios;
	
	}

}
