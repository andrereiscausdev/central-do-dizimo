package tableModel;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import entity.Pagamento;

public class PagamentoTableModel extends AbstractTableModel {

private static final long serialVersionUID = 1L;
	
	private static final String[] colunas = {"CPF", "NOME", "DATA PAG", "DOAÇÃO", "PAGAMENTO"};
	private static final Class[] coluna_classes = {String.class, String.class, String.class, Short.class};
	private List<Pagamento> pagamentos;
	
	private final int COLUNA_CPF = 0;
	private final int COLUNA_NOME = 1;
	private final int COLUNA_DATAPAG = 2;
	private final int COLUNA_DOACAO = 3;
	private final int COLUNA_PAGAMENTO = 4;

	// Instancia a tabela com alguns veículos
	public PagamentoTableModel(List<Pagamento> pagamentos) {
		super();
		this.pagamentos = pagamentos;
	}

	// remove todos os itens da tabela
	public void removeAllItems() {
		pagamentos.clear();
	}
	
	// adiciona um item a tabela
    public void addItem(Pagamento pagamento){
    	pagamentos.add(pagamento);
    }
	
    // não deixa o usuário editar a célula da tabela
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}
	
    // obtém o título da coluna
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    // obtém a classe da coluna
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return coluna_classes[columnIndex];
    }

    // retorna a quantidade de registros da tabela
	@Override
	public int getRowCount() {
		return pagamentos.size();
	}

	// retorna o número de colunas da tabela
	@Override
	public int getColumnCount() {
		return colunas.length;
	}

	// retorna o valor de uma célula
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Pagamento pagamento = pagamentos.get(rowIndex);

		switch(columnIndex) {
			case COLUNA_CPF:
				return pagamento.getCpf();
			case COLUNA_NOME:
				return pagamento.getNome();
			case COLUNA_DATAPAG:
				return pagamento.getDataPag();
			case COLUNA_DOACAO:
				return pagamento.getDoacao();
			case COLUNA_PAGAMENTO:
				return pagamento.getPagamento();
			default:
				return null;
		}
	}
	
}
