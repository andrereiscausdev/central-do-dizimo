package frmTelas;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import util.ArquivoTexto;
import javax.swing.JPasswordField;

public class FrmFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtUsuario;
	private JPasswordField txtSenha;
	
	
	private boolean validaDados() {
		if (txtNome.getText().trim().equals("")) {
			JOptionPane.showMessageDialog(null, "POR FAVOR, INFORME O NOME COMPLETO!");
			return false;
		}
		
		if (txtNome.getText().length() > 30) {
			JOptionPane.showMessageDialog(null, "ATENÇÃO! O NOME DEVE TER ATÉ 30 CARACTERES!");
			return false;
		}
		
		if (txtUsuario.getText().trim().equals("")) {
			JOptionPane.showMessageDialog(null, "POR FAVOR, INFORME O USUÁRIO!");
			return false;
		}
		
		if (txtUsuario.getText().length() > 10) {
			JOptionPane.showMessageDialog(null, "ATENÇÃO! O USUÁRIO DEVE TER ATÉ 10 CARACTERES");
			return false;
		}
		
		if (txtSenha.getText().trim().equals("")) {
			JOptionPane.showMessageDialog(null, "POR FAVOR, INFORME UMA SENHA!");
			return false;
		}
		
		if (txtSenha.getText().length() > 10) {
			JOptionPane.showMessageDialog(null, "ATENÇÃO! A SENHA DEVE TER ATÉ 10 CARACTERES!");
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
					FrmFuncionario frame = new FrmFuncionario();
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
	public FrmFuncionario() {
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
		
		JButton btnSalvar = new JButton("SALVAR CADASTRO");
		btnSalvar.addActionListener(new ActionListener() {
			ArquivoTexto arquivoTexto = new ArquivoTexto("funcionario.txt");
			
			public void actionPerformed(ActionEvent e) {
				
				if(validaDados()== true) {
					System.out.println("DADOS FORAM VALIDADOS COM SUCESSO");
				
				arquivoTexto.inserir(txtNome.getText() + ";" + txtUsuario.getText() + ";" + txtSenha.getText() + ";");
				
				JOptionPane.showMessageDialog(null, "FUNCIONÁRIO CADASTRADO COM SUCESSO!");
				}
				
			}
		});
		btnSalvar.setBounds(717, 568, 205, 48);
		contentPane.add(btnSalvar);
		
		txtNome = new JTextField();
		txtNome.setBounds(860, 194, 234, 40);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(860, 344, 234, 40);
		contentPane.add(txtSenha);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(860, 271, 234, 40);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblNome = new JLabel("NOME COMPLETO");
		lblNome.setForeground(Color.WHITE);
		lblNome.setBounds(860, 178, 250, 14);
		contentPane.add(lblNome);
		
		JLabel lblUsuario = new JLabel("USUÁRIO\r\n\r\n");
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setBounds(860, 257, 70, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblSenha = new JLabel("SENHA");
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setBounds(860, 330, 188, 14);
		contentPane.add(lblSenha);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("CADASTRO FUNCIONÁRIO");
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setFont(new Font("Impact", Font.PLAIN, 25));
		lblNewLabel_1_2_1.setBounds(843, 42, 267, 35);
		contentPane.add(lblNewLabel_1_2_1);
		
		JButton btnLogin = new JButton("ENTRAR");
		btnLogin.addActionListener(new ActionListener() {
			frmEntrar entrar = new frmEntrar();
			public void actionPerformed(ActionEvent e) {
				entrar.setVisible(true);
			}
		});
		btnLogin.setBounds(1025, 568, 197, 48);
		contentPane.add(btnLogin);
		
		
		JLabel lblNewLabel_2 = new JLabel("BEM VINDO");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Gadugi", Font.BOLD, 37));
		lblNewLabel_2.setBounds(567, 0, 224, 50);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("VINDO");
		lblNewLabel_3.setFont(new Font("Gadugi", Font.BOLD, 37));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(656, 0, 139, 50);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(FrmCadastro.class.getResource("/imagem/azul-escuro20.jpg")));
		lblNewLabel_1.setBounds(651, 0, 619, 729);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setForeground(new Color(0, 0, 51));
		lblNewLabel.setIcon(new ImageIcon(FrmCadastro.class.getResource("/imagem/WhatsApp Image 2022-09-19 at 15.25.14.jpeg")));
		lblNewLabel.setBounds(-65, -11, 714, 740);
		panel.add(lblNewLabel);
		
		
		
		
		
	}	
}
