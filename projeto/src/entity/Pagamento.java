package entity;

public class Pagamento {
	
	private String nome;
	private String cpf;
	private String dataPag;
	private String doacao;
	private float pagamento;
	
	
	
	public Pagamento(String nome, String cpf, String dataPag, String doacao, float pagamento) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataPag = dataPag;
		this.doacao = doacao;
		this.pagamento = pagamento;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setDataPag(String dataPag) {
		this.dataPag = dataPag;
	}
	
	public String getDataPag() {
		return dataPag;
	}
	
	public void setDoacao(String doacao) {
		this.doacao = doacao;
	}
	
	public String getDoacao() {
		return doacao;
	}
	
	public void setPagamento(float pagamento) {
		this.pagamento = pagamento;
	}
	
	public float getPagamento() {
		return pagamento;
	}
	
	
	
	public String toCsv() {
		return this.nome + ";" + this.cpf + ";" + this.dataPag + ";" + this.pagamento + ";";
	}
	
	

}
