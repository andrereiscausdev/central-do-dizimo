package dao;

import java.util.ArrayList;
import java.util.List;

import entity.Dizimista;
import entity.Funcionario;
import util.ArquivoTexto;

public class FuncionarioDAO {
	
	private ArquivoTexto arquivo;
	// constante
	private static final String NOME_ARQUIVO = "funcionario.txt";
	
	public FuncionarioDAO() {
		this.arquivo = new ArquivoTexto(NOME_ARQUIVO);
	}
	
	public void inserir(Funcionario igreja) {
		this.arquivo.inserir(igreja.toCsv());
	}
	
	public List<Funcionario> listar() {
		List<String> registros = this.arquivo.ler();
		List<Funcionario> cadastro = new ArrayList<>();
		
		for (String registro : registros) {
			String[] reg = registro.split(";");

			Funcionario f = new Funcionario(
				Integer.parseInt(reg[0]),
				reg[1],
				reg[2],
				reg[3]
			);
			cadastro.add(f);
		}
		return cadastro;
	}
	
	public Funcionario pesquisarPeloNome(String nome) {
		List<Funcionario> cadastro = listar();
		for (Funcionario f : cadastro) {
			if (nome.equals(f.getNome())) {
				return f;
			}
		}
		return null;
	}
	
	public Funcionario pesquisarPeloUsuario(String usuario) {
		List<Funcionario> cadastro = listar();
		for (Funcionario f : cadastro) {
			if (usuario == f.getUsuario()) {
				return f;
			}
		}
		return null;
	}
	
	

}
