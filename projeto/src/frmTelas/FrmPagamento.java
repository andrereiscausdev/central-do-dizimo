package frmTelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import util.ArquivoTexto;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;

public class FrmPagamento extends JFrame {

	private JPanel contentPane;
	private JTextField txtPagamento;
	private JTextField txtNomePagamento;
	private JFormattedTextField txtCpfPagamento;
	private JFormattedTextField txtDataPagamento;
	private JTextField txtDoacao;
	
	private boolean validaDados() {
		if (txtNomePagamento.getText().trim().equals("")) {
			JOptionPane.showMessageDialog(null, "POR FAVOR, INFORME O NOME COMPLETO!");
			return false;
		}
		
		if (txtNomePagamento.getText().length() > 30) {
			JOptionPane.showMessageDialog(null, "ATENÇÃO! O NOME DEVE TER ATÉ 30 CARACTERES");
			return false;
		}
		
		if (txtCpfPagamento.getText().trim().equals("")) {
			JOptionPane.showMessageDialog(null, "POR FAVOR, INFORME O CPF!");
			return false;
		}
		
		if (txtCpfPagamento.getText().length() > 14) {
			JOptionPane.showMessageDialog(null, "ATENÇÃO! O CPF DEVE TER ATÉ 10 CARACTERES!");
			return false;
		}
		
		if (txtPagamento.getText().trim().equals("")) {
			JOptionPane.showMessageDialog(null, "POR FAVOR, INFORME A QUANTIDADE DO PAGAMENTO!");
			return false;
		}
		
		if (txtPagamento.getText().length() > 20) {
			JOptionPane.showMessageDialog(null, "ATENÇÃO! O PAGAMENTO DEVE TER ATÉ 20 CARACTERES!");
			return false;
		}
		
		if (txtDoacao.getText().trim().equals("")) {
			JOptionPane.showMessageDialog(null, "POR FAVOR, SE NÃO HOUVER DOAÇÃO COLOQUE 0!");
			return false;
		}
		
		if (txtDoacao.getText().length() > 20) {
			JOptionPane.showMessageDialog(null, "ATENÇÃO! A DOAÇÃO DEVE TER ATÉ 10 CARACTERES!");
			return false;
		}
		
		if (txtDataPagamento.getText().trim().equals("")) {
			JOptionPane.showMessageDialog(null, "POR FAVOR, INFORME A DATA DO PAGAMENTO!");
			return false;
		}
		
		if (txtDataPagamento.getText().length() > 20) {
			JOptionPane.showMessageDialog(null, "ATENÇÃO! A DATA DEVE TER ATÉ 20 CARACTERES!");
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
					FrmPagamento frame = new FrmPagamento();
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
	public FrmPagamento() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("P A G A M E N T O S");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 25));
		lblNewLabel.setBounds(563, 11, 204, 32);
		contentPane.add(lblNewLabel);
		
		txtPagamento = new JTextField();
		txtPagamento.setBounds(422, 355, 325, 27);
		contentPane.add(txtPagamento);
		txtPagamento.setColumns(10);
		
		JButton btnConfirmar = new JButton("CONFIRMAR");
		btnConfirmar.addActionListener(new ActionListener() {
			ArquivoTexto arquivoTexto = new ArquivoTexto("pagamento.txt");
			public void actionPerformed(ActionEvent e) {
				
				if(validaDados()== true) {
					System.out.println("DADOS FORAM VALIDADOS COM SUCESSO");
				
				arquivoTexto.inserir(txtNomePagamento.getText() + ";" +txtCpfPagamento.getText() + ";" + txtPagamento.getText() + ";" +  txtDoacao.getText() + ";" +
				txtDataPagamento.getText() + ";");
				
				JOptionPane.showMessageDialog(null, "PAGAMENTO FEITO COM SUCESSO!");
				}
				
			}
		});
		btnConfirmar.setBounds(798, 240, 103, 38);
		contentPane.add(btnConfirmar);
		
		JButton btnSair = new JButton("SAIR");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSair.setBounds(809, 365, 79, 32);
		contentPane.add(btnSair);
		
		txtNomePagamento = new JTextField();
		txtNomePagamento.setBounds(422, 228, 325, 27);
		contentPane.add(txtNomePagamento);
		txtNomePagamento.setColumns(10);
		
		JLabel lblCpfPagamento = new JLabel("CPF DO DIZIMISTA PAGANTE");
		lblCpfPagamento.setForeground(Color.WHITE);
		lblCpfPagamento.setBounds(422, 277, 325, 14);
		contentPane.add(lblCpfPagamento);
		
		JLabel lblPagamento = new JLabel("DÍZIMO PAGO");
		lblPagamento.setForeground(Color.WHITE);
		lblPagamento.setBounds(422, 343, 325, 14);
		contentPane.add(lblPagamento);
		
		JLabel lblNomePagamento = new JLabel("NOME DO DIZIMISTA PAGANTE");
		lblNomePagamento.setForeground(Color.WHITE);
		lblNomePagamento.setBounds(422, 213, 325, 14);
		contentPane.add(lblNomePagamento);
		
		
		MaskFormatter mascaraCpf = null;
		MaskFormatter mascaraData = null;
		
		
		try {
				mascaraCpf = new MaskFormatter("###.###.###-##");
				mascaraData = new MaskFormatter("##/##/####");
				mascaraCpf.setPlaceholderCharacter('_');
				mascaraData.setPlaceholderCharacter('_');
		}
		catch(ParseException excp) {
				System.err.println("ERRO NA FORMAÇÃO: " + excp.getMessage());
				System.exit(-1);
		}
		
		
		txtCpfPagamento = new JFormattedTextField(mascaraCpf);
		txtCpfPagamento.setBounds(422, 291, 325, 27);
		contentPane.add(txtCpfPagamento);
		
		txtDataPagamento = new JFormattedTextField(mascaraData);
		txtDataPagamento.setBounds(422, 470, 325, 27);
		contentPane.add(txtDataPagamento);
		
		JLabel lblData = new JLabel("DATA DO PAGAMENTO");
		lblData.setForeground(Color.WHITE);
		lblData.setBounds(422, 454, 325, 14);
		contentPane.add(lblData);
		
		txtDoacao = new JTextField();
		txtDoacao.setBounds(422, 416, 325, 27);
		contentPane.add(txtDoacao);
		txtDoacao.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("DOAÇÃO PAGA");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(422, 402, 325, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(FrmPagamento.class.getResource("/imagem/azul-escuro20.jpg")));
		lblNewLabel_1.setBounds(0, 11, 1264, 681);
		contentPane.add(lblNewLabel_1);
		
		
		
		
	}
}
