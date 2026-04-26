package models;

public class Funcionario extends Pessoa{

	public Funcionario() {
		
	}
	
	public Funcionario(String name, String cpf, String dataNasc, String tel, String dataContratacao, double salarioBase, boolean valeTransporte) {
		super(name, cpf, dataNasc, tel);
		// TODO Auto-generated constructor stub
		setDataContratacao(dataContratacao);
		setSalarioBase(salarioBase);
		setValeTransporte(valeTransporte);
		setHorasTrabalhadas(190);
	}
	
	
	private String dataContratacao;
	private double salarioBase;
	private float horasTrabalhadas;
	private boolean valeTransporte;

	
	public String getDataContratacao() {
		return dataContratacao;
	}
	public void setDataContratacao(String dataContratacao) {
		this.dataContratacao = dataContratacao;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public float getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public void setHorasTrabalhadas(float horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	public boolean isValeTransporte() {
		return valeTransporte;
	}
	public void setValeTransporte(boolean valeTransporte) {
		this.valeTransporte = valeTransporte;
	}
	
	

}
