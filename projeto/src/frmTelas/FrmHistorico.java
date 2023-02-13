package frmTelas;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

import dao.PagamentoDAO;
import entity.Pagamento;
import tableModel.PagamentoTableModel;
import util.ArquivoTexto;

public class FrmHistorico extends JFrame {

	private JPanel contentPane;
	private JTextField txtCpf;
	private JTable tbDados;
	private PagamentoDAO dao;
	private List<Pagamento> pagamentos;
	private DefaultTableModel tabela;
	
	
	private boolean validaDados() {
		
		if (txtCpf.getText().trim().equals("")) {
			JOptionPane.showMessageDialog(null, "POR FAVOR, INFORME O CPF!");
			return false;
		}
		
		if (txtCpf.getText().length() > 14) {
			JOptionPane.showMessageDialog(null, "ATENÇÃO! O CPF DEVE TER ATÉ 14 CARACTERES!");
			return false;
		}
		
		return true;
	}
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmHistorico frame = new FrmHistorico();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmHistorico() {
		ArquivoTexto txtPagamento = new ArquivoTexto("pagamento.txt");
		List<String> pagamento = txtPagamento.ler();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(198, 288, 824, 382);
		contentPane.add(scrollPane);

		// Declaração da tabela
		tabela = new DefaultTableModel();
		tabela.addColumn("NOME");
		tabela.addColumn("CPF");
		tabela.addColumn("PAGAMENTO");
		tabela.addColumn("DOAÇÃO");
		tabela.addColumn("DATA PAGAMENTO");
		tbDados = new JTable(tabela);
		tbDados.setEnabled(false);
		// Fonte do cabeçalho
		tbDados.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 13));

		// tamanho da fonte das linhas dos registros
		tbDados.setFont(new Font("Tahoma", Font.LAYOUT_LEFT_TO_RIGHT, 17));
		// tamanho da linha dos registros
		tbDados.setRowHeight(50);
		
		scrollPane.setViewportView(tbDados);
		
		JLabel lblHistorico = new JLabel("H I S T Ó R I C O   P A G A M E N T O");
		lblHistorico.setForeground(Color.WHITE);
		lblHistorico.setFont(new Font("Impact", Font.PLAIN, 25));
		lblHistorico.setBounds(462, 11, 344, 37);
		contentPane.add(lblHistorico);
		
		JLabel lblCpf = new JLabel("DIGITE O CPF DO DIZIMISTA QUE DESEJÁ CONSULTAR OS PAGAMENTOS");
		lblCpf.setForeground(Color.WHITE);
		lblCpf.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblCpf.setBounds(354, 199, 602, 20);
		contentPane.add(lblCpf);
		
		
		MaskFormatter mascaraCpf = null;
		
		
		try {
				mascaraCpf = new MaskFormatter("###.###.###-##");
				mascaraCpf.setPlaceholderCharacter('_');
		}
		catch(ParseException excp) {
				System.err.println("ERRO NA FORMAÇÃO: " + excp.getMessage());
				System.exit(-1);
		}
	
		
		txtCpf = new JFormattedTextField(mascaraCpf);
		txtCpf.setBounds(459, 225, 297, 34);
		contentPane.add(txtCpf);
		
		JButton btnPesquisa = new JButton("PESQUISAR");
		btnPesquisa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (txtCpf.getText().trim().equals("___.___.___-__")) {
					JOptionPane.showMessageDialog(null, "POR FAVOR, COLOQUE O CPF!");
				}
					
				
				for(String linhas : pagamento) {
					int cont = 0;
					
					String linha[] = new String[3];
					linha = linhas.split(";");
					
					if(linha[1].equals(txtCpf.getText())) {
						cont++;
						tabela.addRow(new Object[]{
								linha[0],
								linha[1],
								linha[2],
								linha[3],
								linha[4]
						});
					}
				}
					
					
					 
				
			}
		});
		btnPesquisa.setBounds(945, 230, 110, 29);
		contentPane.add(btnPesquisa);
		
		JButton btnSair = new JButton("SAIR");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSair.setBounds(1093, 230, 89, 29);
		contentPane.add(btnSair);
		
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(FrmHistorico.class.getResource("/imagem/azul-escuro20.jpg")));
		lblNewLabel_1.setBounds(0, 0, 1264, 681);
		contentPane.add(lblNewLabel_1);
		
		
		
		
		
		
	}
}
