package dao;

import java.util.ArrayList;
import java.util.List;


import entity.Pagamento;
import util.ArquivoTexto;

public class PagamentoDAO {
	
	private ArquivoTexto arquivo;
	// constante
	private static final String NOME_ARQUIVO = "pagamento.txt";
	
	public PagamentoDAO() {
		this.arquivo = new ArquivoTexto(NOME_ARQUIVO);
	}
	
	public void inserir(Pagamento igreja) {
		this.arquivo.inserir(igreja.toCsv());
	}
	
	public List<Pagamento> listar() {
		List<String> registros = this.arquivo.ler();
		List<Pagamento> cadastro = new ArrayList<>();
		
		for (String registro : registros) {
			String[] reg = registro.split(";");

			Pagamento p = new Pagamento(
				reg[0],
				reg[1],
				reg[2],
				reg[3],
				Float.parseFloat(reg[4])
			);
			cadastro.add(p);
		}
		return cadastro;
	}
	
	public Pagamento pesquisarPeloCpf(String cpf) {
		List<Pagamento> cadastro = listar();
		for (Pagamento p : cadastro) {
			if (cpf.equals(p.getCpf())) {
				return p;
			}
		}
		return null;
	}
	
	
	

}
