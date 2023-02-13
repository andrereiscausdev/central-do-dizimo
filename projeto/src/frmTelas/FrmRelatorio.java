package frmTelas;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import dao.DizimistaDAO;
import dao.PagamentoDAO;
import util.ArquivoTexto;

import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;

public class FrmRelatorio extends JFrame {

	private JPanel contentPane;
	private JFormattedTextField txtCpf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmRelatorio frame = new FrmRelatorio();
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
	public FrmRelatorio() {
		ArquivoTexto txtPagamento = new ArquivoTexto("pagamento.txt");
		ArquivoTexto txtDizimista = new ArquivoTexto("dizimista.txt");
		List<String> dizimista = txtDizimista.ler();
		List<String> pagamento = txtPagamento.ler();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRelatorio = new JLabel("R E L A T Ó R I O");
		lblRelatorio.setForeground(Color.WHITE);
		lblRelatorio.setFont(new Font("Impact", Font.PLAIN, 25));
		lblRelatorio.setBounds(564, 11, 203, 32);
		contentPane.add(lblRelatorio);
		
		JLabel lblCpf = new JLabel("DIGITE O CPF DO DIZIMISTA QUE DESEJÁ FAZER O RELATÓRIO");
		lblCpf.setForeground(Color.WHITE);
		lblCpf.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblCpf.setBounds(384, 199, 602, 20);
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
		
		JButton btnSair = new JButton("SAIR\r\n\r\n");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSair.setBounds(921, 333, 89, 37);
		contentPane.add(btnSair);
		
		JButton btnCriarRelatorio = new JButton("CRIAR RELATÓRIO");
		btnCriarRelatorio.addActionListener(new ActionListener() {
	//		PagamentoDAO fDao = new PagamentoDAO();
	//		DizimistaDAO dDao = new DizimistaDAO();
			
			public void actionPerformed(ActionEvent e) {
				
				if (txtCpf.getText().trim().equals("___.___.___-__")) {
					JOptionPane.showMessageDialog(null, "POR FAVOR, COLOQUE O CPF!");
				}
				
				
				for(String linhas : dizimista) {
					int cont = 0;
					
					String linha[] = new String[11];
					linha = linhas.split(";");
					
					
					
					if(linha[3].contains(txtCpf.getText())) {
						cont++;
						
						JOptionPane.showMessageDialog(null, "DADOS DESTE DIZIMISTA" + "\n\nNOME: " + linha[0] + "\nDATA DE NASCIMENTO: " + linha[1] + "\nRG: " + linha[2] + 
													"\nCPF: " + linha[3] + "\nEMAIL: " + linha[4] + "\nNUMERO: " + linha[5] 
													+ "\nESTADO: " + linha[6] + "\nCEP: " + linha[7] + "\nBAIRRO: " + linha[8] 
													+ "\nCIDADE: " + linha[9] + "\nSALARIO: " + linha[10]
													);
					}
				}
				
				for(String linhas : pagamento) {
					int cont = 0;
					
					String linha[] = new String[3];
					linha = linhas.split(";");
					
					if(linha[1].contains(txtCpf.getText())) {
						cont++;
						System.out.println(linha);
						JOptionPane.showMessageDialog(null, "DADOS DE PAGAMENTO DESTE DIZIMISTA" + "\n\nNOME: " + linha[0] + "\nCPF: " + linha[1] + "\nPAGAMENTO: " + linha[2] + "R$" +"\nDOAÇÃO: " + linha[3] + "R$" + 
						"\nDATA PAGAMENTO: " + linha[4]);
					}
				}
				
				
				
			}
		});
		btnCriarRelatorio.setBounds(892, 211, 166, 48);
		contentPane.add(btnCriarRelatorio);
		
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(FrmRelatorio.class.getResource("/imagem/azul-escuro20.jpg")));
		lblNewLabel_1.setBounds(0, 0, 1264, 681);
		contentPane.add(lblNewLabel_1);
		
		
		
		
		
	}
}
