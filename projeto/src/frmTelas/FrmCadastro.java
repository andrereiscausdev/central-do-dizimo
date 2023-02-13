package frmTelas;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import util.ArquivoTexto;

public class FrmCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtEstado;
	private JTextField txtBairro;
	private JTextField txtPorcentagem;
	private JTextField txtSalario;
	private JTextField txtCidade;
	private JFormattedTextField txtFormato;
	private JFormattedTextField txtCpf;
	private JFormattedTextField txtDataNascimento;
	private JFormattedTextField txtRg;
	private JFormattedTextField txtNumero;
	private JFormattedTextField txtCep;
	
	private boolean validaDados() {
		if (txtNome.getText().trim().equals("")) {
			JOptionPane.showMessageDialog(null, "POR FAVOR, VOCÊ PRECISA INFORMAR O NOME COMPLETO!");
			return false;
		}
		
		if (txtNome.getText().length() > 30) {
			JOptionPane.showMessageDialog(null, "ATENÇÃO! O NOME DEVE TER ATÉ 30 CARACTERES!");
			return false;
		}
		
		if (txtDataNascimento.getText().trim().equals("")) {
			JOptionPane.showMessageDialog(null, "POR FAVOR, INFORME A DATA DE NASCIMENTO!");
			return false;
		}
		
		if (txtDataNascimento.getText().length() > 10) {
			JOptionPane.showMessageDialog(null, "ATENÇÃO! A DATA DE NASCIMENTO DEVE TER ATÉ 10 CARACTERES!");
			return false;
		}
		
		if (txtRg.getText().trim().equals("")) {
			JOptionPane.showMessageDialog(null, "POR FAVOR, VOCÊ PRECISA INFORMAR O RG!");
			return false;
		}
		
		if (txtRg.getText().length() > 12) {
			JOptionPane.showMessageDialog(null, "ATENÇÃO! O RG DEVE TER ATÉ 12 CARACTERES!");
			return false;
		}
		
		if (txtCpf.getText().trim().equals("")) {
			JOptionPane.showMessageDialog(null, "POR FAVOR, INFORMAR O CPF!");
			return false;
		}
		
		if (txtCpf.getText().length() > 14) {
			JOptionPane.showMessageDialog(null, "ATENÇÃO! O CPF DEVE TER ATÉ 14 CARACTERES!");
			return false;
		}
		
		if (txtEmail.getText().trim().equals("")) {
			JOptionPane.showMessageDialog(null, "POR FAVOR, VOCÊ PRECISA INFORMAR O E-MAIL!");
			return false;
		}
		
		if (txtEmail.getText().length() > 30) {
			JOptionPane.showMessageDialog(null, "ATENÇÃO! O E-MAIL DEVE TER ATÉ 30 CARACTERES!");
			return false;
		}
		
		if (txtNumero.getText().trim().equals("")) {
			JOptionPane.showMessageDialog(null, "POR FAVOR, INFORME O NÚMERO!");
			return false;
		}
		
		if (txtNumero.getText().length() > 14) {
			JOptionPane.showMessageDialog(null, "ATENÇÃO! O NÚMERO DEVE TER ATÉ 14 CARACTERES!");
			return false;
		}
		
		if (txtEstado.getText().trim().equals("")) {
			JOptionPane.showMessageDialog(null, "POR FAVOR, VOCÊ PRECISA INFORMAR O ESTADO!");
			return false;
		}
		
		if (txtEstado.getText().length() > 2) {
			JOptionPane.showMessageDialog(null, "ATENÇÃO! O NOME DEVE TER ATÉ 2 CARACTERES!");
			return false;
		}
		
		if (txtCep.getText().trim().equals("")) {
			JOptionPane.showMessageDialog(null, "POR FAVOR, INFORME O CEP!");
			return false;
		}
		
		if (txtCep.getText().length() > 10) {
			JOptionPane.showMessageDialog(null, "ATENÇÃO! O CEP DEVE TER ATÉ 10 CARACTERES!");
			return false;
		}
		
		if (txtBairro.getText().trim().equals("")) {
			JOptionPane.showMessageDialog(null, "POR FAVOR, VOCÊ PRECISA INFORMAR O BAIRRO!");
			return false;
		}
		
		if (txtBairro.getText().length() > 40) {
			JOptionPane.showMessageDialog(null, "ATENÇÃO! O BAIRRO DEVE TER ATÉ 40 CARACTERES!");
			return false;
		}
		
		if (txtCidade.getText().trim().equals("")) {
			JOptionPane.showMessageDialog(null, "POR FAVOR, INFORME A CIDADE!");
			return false;
		}
		
		if (txtCidade.getText().length() > 40) {
			JOptionPane.showMessageDialog(null, "ATENÇÃO! A CIDADE DEVE TER ATÉ 40 CARACTERES!");
			return false;
		}
		
		if (txtSalario.getText().trim().equals("")) {
			JOptionPane.showMessageDialog(null, "POR FAVOR, VOCÊ PRECISA INFORMAR O SALÁRIO!");
			return false;
		}
		
		if (txtSalario.getText().length() > 20) {
			JOptionPane.showMessageDialog(null, "ATENÇÃO! O SALÁRIO DEVE TER ATÉ 20 CARACTERES!");
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
					FrmCadastro frame = new FrmCadastro();
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
	public FrmCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1286, 768);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 649, 729);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(FrmCadastro.class.getResource("/imagem/WhatsApp Image 2022-09-19 at 15.25.14.jpeg")));
		lblNewLabel.setBounds(-65, -11, 714, 740);
		panel.add(lblNewLabel);
		
		JButton btnSalvar = new JButton("SALVAR CADASTRO");
		btnSalvar.addActionListener(new ActionListener() {
			ArquivoTexto arquivoTexto = new ArquivoTexto("dizimista.txt");
			
			public void actionPerformed(ActionEvent e) {
				
				if(validaDados()== true) {
					System.out.println("DADOS FORAM VALIDADOS COM SUCESSO");

				arquivoTexto.inserir (txtNome.getText() + ";" + txtDataNascimento.getText() + ";" + txtRg.getText() + ";" + txtCpf.getText() + ";" + txtEmail.getText() + ";" + txtNumero.getText() + ";" 
				+ txtEstado.getText() + ";" + txtCep.getText() + ";" + txtBairro.getText() + ";" + txtCidade.getText() + ";" + txtSalario.getText() + ";");
				
				JOptionPane.showMessageDialog(null, "DIZIMISTA CADASTRADO COM SUCESSO!");
				}
			}
		});
		btnSalvar.setBounds(803, 638, 214, 48);
		contentPane.add(btnSalvar);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(687, 158, 250, 40);
		contentPane.add(txtNome);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(687, 313, 250, 40);
		contentPane.add(txtEmail);
		
		txtEstado = new JTextField();
		txtEstado.setColumns(10);
		txtEstado.setBounds(1022, 304, 56, 40);
		contentPane.add(txtEstado);
		
		txtBairro = new JTextField();
		txtBairro.setColumns(10);
		txtBairro.setBounds(1022, 428, 238, 40);
		contentPane.add(txtBairro);
		
		txtSalario = new JTextField();
		txtSalario.setColumns(10);
		txtSalario.setBounds(687, 454, 140, 40);
		contentPane.add(txtSalario);
		
		JLabel lblNome = new JLabel("NOME COMPLETO");
		lblNome.setForeground(Color.WHITE);
		lblNome.setBounds(687, 139, 250, 14);
		contentPane.add(lblNome);
		
		JLabel lblDataNascimento = new JLabel("DATA NASCIMENTO");
		lblDataNascimento.setForeground(Color.WHITE);
		lblDataNascimento.setBounds(1020, 139, 128, 14);
		contentPane.add(lblDataNascimento);
		
		JLabel lblRg = new JLabel("RG");
		lblRg.setForeground(Color.WHITE);
		lblRg.setBounds(687, 220, 46, 14);
		contentPane.add(lblRg);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setForeground(Color.WHITE);
		lblCpf.setBounds(1022, 220, 46, 14);
		contentPane.add(lblCpf);
		
		JLabel lblSalario = new JLabel("SALÁRIO");
		lblSalario.setForeground(Color.WHITE);
		lblSalario.setBounds(687, 441, 140, 14);
		contentPane.add(lblSalario);
		
		
		JLabel lblEstado = new JLabel("UF");
		lblEstado.setForeground(Color.WHITE);
		lblEstado.setBounds(1022, 290, 46, 14);
		contentPane.add(lblEstado);
		
		JLabel lblCep = new JLabel("CEP\r\n");
		lblCep.setForeground(Color.WHITE);
		lblCep.setBounds(1022, 346, 46, 14);
		contentPane.add(lblCep);
		
		JLabel lblEmail = new JLabel("E-MAIL");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBounds(687, 298, 46, 14);
		contentPane.add(lblEmail);
		
		JLabel lblNumero = new JLabel("NÚMERO PESSOAL");
		lblNumero.setForeground(Color.WHITE);
		lblNumero.setBounds(687, 364, 188, 14);
		contentPane.add(lblNumero);
		
		JLabel lblBairro = new JLabel("BAIRRO");
		lblBairro.setForeground(Color.WHITE);
		lblBairro.setBounds(1022, 415, 46, 14);
		contentPane.add(lblBairro);
		
		txtCidade = new JTextField();
		txtCidade.setColumns(10);
		txtCidade.setBounds(1022, 493, 238, 40);
		contentPane.add(txtCidade);
		
		JLabel lblCidade = new JLabel("CIDADE\r\n");
		lblCidade.setForeground(Color.WHITE);
		lblCidade.setBounds(1022, 479, 46, 14);
		contentPane.add(lblCidade);
		
		JLabel lblInformacao = new JLabel("CADASTRO DIZIMISTA");
		lblInformacao.setForeground(Color.WHITE);
		lblInformacao.setFont(new Font("Impact", Font.PLAIN, 25));
		lblInformacao.setBounds(843, 42, 250, 35);
		contentPane.add(lblInformacao);
		
		JButton btnSair = new JButton("SAIR\r\n");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSair.setBounds(1059, 644, 89, 36);
		contentPane.add(btnSair);
		
		
		
		MaskFormatter mascaraCep = null;
		MaskFormatter mascaraTel = null;
		MaskFormatter mascaraCpf = null;
		MaskFormatter mascaraData = null;
		MaskFormatter mascaraRg = null;
		
		try {
				mascaraCep = new MaskFormatter("#####-###");
				mascaraTel = new MaskFormatter("(##)####-####");
				mascaraCpf = new MaskFormatter("###.###.###-##");
				mascaraData = new MaskFormatter("##/##/####");
				mascaraRg = new MaskFormatter("##.###.###-#");
				mascaraCep.setPlaceholderCharacter('_');
				mascaraTel.setPlaceholderCharacter('_');
				mascaraCpf.setPlaceholderCharacter('_');
				mascaraData.setPlaceholderCharacter('_');
				mascaraRg.setPlaceholderCharacter('_');
					
		}
		catch(ParseException excp) {
				System.err.println("ERRO NA FORMAÇÃO: " + excp.getMessage());
				System.exit(-1);
		}
		
		
		txtCpf = new JFormattedTextField(mascaraCpf);
		txtCpf.setBounds(1022, 239, 206, 40);
		contentPane.add(txtCpf);
		
		txtRg = new JFormattedTextField(mascaraRg);
		txtRg.setBounds(687, 239, 250, 40);
		contentPane.add(txtRg);
		
		txtNumero = new JFormattedTextField(mascaraTel);
		txtNumero.setBounds(687, 379, 250, 40);
		contentPane.add(txtNumero);
		
		txtCep = new JFormattedTextField(mascaraCep);
		txtCep.setBounds(1022, 361, 206, 40);
		contentPane.add(txtCep);
		
		txtDataNascimento = new JFormattedTextField(mascaraData);
		txtDataNascimento.setBounds(1022, 158, 128, 40);
		contentPane.add(txtDataNascimento);
		
		
		
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(FrmCadastro.class.getResource("/imagem/azul-escuro20.jpg")));
		lblNewLabel_1.setBounds(651, 0, 619, 729);
		contentPane.add(lblNewLabel_1);
		
		
		
		
	}
}
