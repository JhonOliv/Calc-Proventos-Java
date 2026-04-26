package viewer;

import java.util.Scanner;

import controllers.ControllerFuncionario;
import exceptions.ArrayFuncionarioIsEmpty;
import models.Funcionario;
import models.TodosFuncionarios;

public class CalcProventos {
	
	public static void main(String[] args) throws ArrayFuncionarioIsEmpty {
		
		TodosFuncionarios tdFunc = new TodosFuncionarios();
		ControllerFuncionario ctFunc = new ControllerFuncionario();
		Scanner scan = new Scanner(System.in);
		
		menuPrincipal();
		int opcao = scan.nextInt();
		System.out.print("Digite a opção desejada: ");
		
		while(opcao != 4) {
			
			if(opcao == 1) {
				System.out.println("Adicionando Novo Funcionário:");

				System.out.println("Nome Completo:");
				String nome = scan.next().trim();
				
				System.out.println("CPF:");
				String cpf = scan.next();
				System.out.println("Data Nascimento:");
				String dataNasc = scan.next();
				System.out.println("Telefone Contato:");
				String telCont = scan.next();
				System.out.println("Data Contratação:");
				String dataCont = scan.next();
				System.out.println("Salario Base:");
				double salarioBase = Double.parseDouble(scan.next());
				System.out.println("Gostaria de possuir Vale Transporte:");
				boolean valeTransporte = scan.next().equals("Sim") ?  true : false ;
				Funcionario newFunc = new Funcionario(nome, cpf, dataNasc, telCont, dataCont, salarioBase, valeTransporte);
				
				tdFunc.setFuncionario(newFunc);		
				
				System.out.print("Funcionário Adicionado com sucesso! " + newFunc.getNamePessoa());
				menuPrincipal();
				System.out.print("Deseja realizar mais alguma coisa:");
				opcao = scan.nextInt();
			}else if(opcao == 2) {
				System.out.println(" ");
				System.out.println("Realizando o calculo do pagamento de todos os funcionário: ");				
				ctFunc.calcSalarioTodosFuncionarios(tdFunc);
				

				System.out.println("Deseja realizar mais alguma coisa:");
				opcao = scan.nextInt();
			}else if(opcao == 3) {
				
				System.out.println("Digite o CPF do funcionário para calcularmos o pagamento expecifico:");
				System.out.println("Digite o CPF:");
				String cpf = scan.next();
				
				ctFunc.calcSalarioFuncionario(tdFunc, cpf);

				System.out.println("Deseja realizar mais alguma coisa:");
				opcao = scan.nextInt();
			}
		
		
	}
		System.out.println("Sistema Encerrado!");
		scan.close();
		
	}
	
	
	public static void menuPrincipal() {
		System.out.println("---------------Menu-------------");
		System.out.println("1- Adicionar Novo Funcionário---");
		System.out.println("2- Realizar Pagamentos----------");
		System.out.println("3- Realizar Pagamento Funcionário");
		System.out.println("4- Encerrar Sistema--------------");
		
	}

}
