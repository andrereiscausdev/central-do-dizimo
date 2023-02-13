package entity;

public class Funcionario {
	
	private int id;
	private String nome;
	private String usuario;
	private String senha;
	
	
	
	public Funcionario(int id, String nome, String usuario, String senha) {
		this.id = id;
		this.nome = nome;
		this.usuario = usuario;
		this.senha = senha;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public String getUsuario() {
		return this.usuario;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getSenha() {
		return this.senha;
	}
	
	
	public String toCsv() {
		return this.id + ";" + this.nome + ";" + this.usuario + ";" + this.senha + ";";
	}
	
	
	


}
