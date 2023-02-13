package dao;

import java.util.ArrayList;
import java.util.List;

import entity.Dizimista;
import util.ArquivoTexto;

public class DizimistaDAO {
	
	private ArquivoTexto arquivo;
	// constante
	private static final String NOME_ARQUIVO = "dizimista.txt";
	
	public DizimistaDAO() {
		this.arquivo = new ArquivoTexto(NOME_ARQUIVO);
	}
	
	public void inserir(Dizimista igreja) {
		this.arquivo.inserir(igreja.toCsv());
	}
	
	
	public List<Dizimista> listar() {
		List<String> registros = this.arquivo.ler();
		List<Dizimista> cadastro = new ArrayList<>();
		
		for (String registro : registros) {
			String[] reg = registro.split(";");

			Dizimista d = new Dizimista(
				reg[0],
				reg[1],
				reg[2],
				reg[3],
				reg[4],
				reg[5],
				reg[6],
				reg[7],
				reg[8],
				reg[9],
				reg[10],
				Float.parseFloat(reg[11])
			);
			cadastro.add(d);
		}
		return cadastro;
	}
	
	public Dizimista pesquisarPeloCpf(String cpf) {
		List<Dizimista> cadastro = listar();
		for (Dizimista d : cadastro) {
			if (cpf.equals(d.getCpf())) {
				return d;
			}
		}
		return null;
	}
	
	
	
	

}
