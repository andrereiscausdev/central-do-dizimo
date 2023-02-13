package frmTelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import util.ArquivoTexto;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class frmEntrar extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuarioLogin;
	private JPasswordField txtSenhaLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmEntrar frame = new frmEntrar();
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
	public frmEntrar() {
		ArquivoTexto arquivoFuncionario = new ArquivoTexto("funcionario.txt");
		List<String> funcionario = arquivoFuncionario.ler();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtUsuarioLogin = new JTextField();
		txtUsuarioLogin.setBounds(755, 229, 162, 32);
		contentPane.add(txtUsuarioLogin);
		txtUsuarioLogin.setColumns(10);
		
		JLabel lblUsuarioLogin = new JLabel("USUARIO");
		lblUsuarioLogin.setForeground(Color.WHITE);
		lblUsuarioLogin.setBounds(755, 212, 81, 16);
		contentPane.add(lblUsuarioLogin);
		
		JLabel lblNewLabel_1 = new JLabel("SENHA");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(1023, 213, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.addActionListener(new ActionListener() {
			FrmTelaInicial opcoes = new FrmTelaInicial();
			public void actionPerformed(ActionEvent e) {
				
				int cont  = 0;
				for(String linhas : funcionario) {
					
					String checaLinhas[] = new String[2];
					checaLinhas = linhas.split(";");
					
					if(checaLinhas[1].equals(txtUsuarioLogin.getText()) && checaLinhas[2].equals(txtSenhaLogin.getText())) {
						
						cont++;
						JOptionPane.showMessageDialog(null, "LOGIN EFETUADO COM SUCESSO");
						
						opcoes.setVisible(true);
					}
					
				}
				if(cont == 0) {
					JOptionPane.showMessageDialog(null, "USUÁRIO OU SENHA INVÁLIDA ");
				}
				
			}
		});
		btnEntrar.setBounds(905, 549, 126, 40);
		contentPane.add(btnEntrar);
		
		txtSenhaLogin = new JPasswordField();
		txtSenhaLogin.setBounds(1023, 229, 162, 32);
		contentPane.add(txtSenhaLogin);
		
		JLabel lblNewLabel_3 = new JLabel("L O G I N");
		lblNewLabel_3.setFont(new Font("Impact", Font.PLAIN, 25));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(940, 11, 91, 45);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(frmEntrar.class.getResource("/imagem/WhatsApp Image 2022-09-19 at 15.25.14.jpeg")));
		lblNewLabel_2.setBounds(0, 0, 659, 681);
		contentPane.add(lblNewLabel_2);
		
		JButton btnSair = new JButton("SAIR");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSair.setBounds(921, 624, 89, 23);
		contentPane.add(btnSair);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(frmEntrar.class.getResource("/imagem/azul-escuro20.jpg")));
		lblNewLabel.setBounds(661, 0, 603, 681);
		contentPane.add(lblNewLabel);
		
		
		
		
	}
}
