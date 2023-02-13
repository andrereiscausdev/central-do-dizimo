package frmTelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import util.ArquivoTexto;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class FrmSaldo extends JFrame {

	private JPanel contentPane;
	private JTextField txtSoma;

	/**
	 * Launch the application.
	 */
	public static float converter (String apoio) {
		return Float.parseFloat(apoio);
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmSaldo frame = new FrmSaldo();
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
	public FrmSaldo() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSaldo = new JButton("REALIZAR");
		btnSaldo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArquivoTexto txtPagamento = new ArquivoTexto("pagamento.txt");
				List<String> pagamento = txtPagamento.ler();
				
				float soma = 0;
				for(String linhas : pagamento) {
					
					float valorpag=0;
					float valordoacao = 0;
						String linha[] = new String[3];
						linha = linhas.split(";");
						valorpag = converter(linha[2]);
						valordoacao = converter(linha[3]);
						
						soma = soma + valorpag;
						soma = soma + valordoacao;
					}
				
				String resul = soma + "";
				txtSoma = new JTextField(resul + " R$");
				txtSoma.setHorizontalAlignment(SwingConstants.CENTER);
				txtSoma.setFont(new Font("Tahoma", Font.PLAIN, 22));
				txtSoma.setBounds(435, 372, 432, 126);
				contentPane.add(txtSoma);
				txtSoma.setColumns(10);
				
			}
		});
		btnSaldo.setBounds(585, 154, 129, 46);
		contentPane.add(btnSaldo);
		
		JLabel lblNewLabel_1 = new JLabel("CLIQUE NO BOTÃO REALIZAR SE QUISER VER O SALDO ");
		lblNewLabel_1.setFont(new Font("Impact", Font.PLAIN, 15));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(508, 123, 339, 20);
		contentPane.add(lblNewLabel_1);
		
		JButton btnSair = new JButton("SAIR");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSair.setBounds(585, 591, 129, 46);
		contentPane.add(btnSair);
		
		JLabel lblSaldo = new JLabel("SALDO");
		lblSaldo.setFont(new Font("Impact", Font.PLAIN, 25));
		lblSaldo.setForeground(new Color(255, 255, 255));
		lblSaldo.setBounds(610, 11, 104, 46);
		contentPane.add(lblSaldo);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(FrmSaldo.class.getResource("/imagem/azul-escuro20.jpg")));
		lblNewLabel.setBounds(10, 0, 1264, 681);
		contentPane.add(lblNewLabel);
	}
}
