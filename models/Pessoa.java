package models;

public class Pessoa {

	private String namePessoa;
	private String cpf;
	private String dataNasc;
	private String telContato;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String name, String cpf, String dataNasc, String tel) {
		setNamePessoa(name);
		setCpf(cpf);
		setCpf(cpf);
		setTelContato(tel);	
	}


	public String getNamePessoa() {
		return namePessoa;
	}


	public void setNamePessoa(String namePessoa) {
		this.namePessoa = namePessoa;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getDataNasc() {
		return dataNasc;
	}


	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}


	public String getTelContato() {
		return telContato;
	}


	public void setTelContato(String telContato) {
		this.telContato = telContato;
	}
	
	
	
}
