package entity;

import java.util.Calendar;
import java.util.GregorianCalendar;



public class Dizimista {
	
	Calendar c = GregorianCalendar.getInstance();
	
	
	private String cpf;
	private String nome;
	private String rg;
	private String telefone;
	private String celular;
	private String email;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	private String numero;
	//private String complemento;
	//private int anoNascimento;
	//private int mesNascimento;
	//private int diaNascimento;
	private float salario;
	//private float pagar;
	
	
	public Dizimista ( String cpf, String nome, String rg, String telefone,
	String celular, String email, String bairro, String cidade, String estado, String cep, String numero, float salario) {
		this.cpf = cpf;
		this.nome = nome;
		this.rg = rg;
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.numero = numero;
		this.salario = 0;
	}
	
	

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public String getRg() {
		return this.rg;
	}
	
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	
	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	public String getCelular() {
		return this.celular;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getBairro() {
		return this.bairro;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getCidade() {
		return this.cidade;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String getEstado() {
		return this.estado;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getCep() {
		return this.cep;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getNumero() {
		return this.numero;
	}
	
//	public void setComplemento(String complemento) {
//		this.complemento = complemento;
//	}
	
//	public String getComplemento() {
//		return this.complemento;
//	}
	
//	public void setAnoNascimento(int anoNascimento) {
//		this.anoNascimento = anoNascimento;
//	}
	
//	public int getAnoNascimento() {
//		return this.anoNascimento;
//	}
	
//	public void setMesNascimento(int mesNascimento) {
//		this.mesNascimento = mesNascimento;
//	}
	
//	public int getMesNascimento() {
//		return this.mesNascimento;
//	}
	
//	public void setDiaNascimento(int diaNascimento) {
//		this.diaNascimento = diaNascimento;
//	}
	
//	public int getDiaNascimento() {
//		return this.diaNascimento;
//	}
	
	public void setsalario(float salario) {
		//this.cpf atributo da classe
		//cpf valor que irei passar por parâmetro
		this.salario = salario;
	}
	
	public float getsalario() {
		return this.salario;
	}
	
//	public void setPagar(float pagar) {
//		this.pagar = pagar;
//	}
	
//	public float getPagar() {
//		return this.pagar;
//	}
	
	
	public String toCsv() {
		 return this.cpf + ";" + this.nome + ";" + this.rg  + ";" + this.telefone + ";" + this.celular + ";" + this.email + ";"
		 + this.bairro + ";" + this.cidade + ";" + this.estado + ";"+ this.cep + ";" + this.numero + ";" + this.salario + ";";
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
