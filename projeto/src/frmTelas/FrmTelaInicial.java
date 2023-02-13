package frmTelas;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmTelaInicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmTelaInicial frame = new FrmTelaInicial();
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
	public FrmTelaInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1264, 681);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnCadastrarDizimista = new JButton("CADASTRAR NOVO DIZIMISTA");
		btnCadastrarDizimista.addActionListener(new ActionListener() {
			FrmCadastro cadastroD = new FrmCadastro();
			
			public void actionPerformed(ActionEvent e) {
				cadastroD.setVisible(true);
			}
		});
		btnCadastrarDizimista.setBounds(624, 193, 224, 55);
		panel.add(btnCadastrarDizimista);
		
		JButton btnRelatorio = new JButton("RELATÓRIO DOS DIZIMISTAS");
		btnRelatorio.addActionListener(new ActionListener() {
			FrmRelatorio relatorioD = new FrmRelatorio();
			
			public void actionPerformed(ActionEvent e) {
				relatorioD.setVisible(true);
			}
		});
		btnRelatorio.setBounds(624, 339, 224, 55);
		panel.add(btnRelatorio);
		
		JButton btnAlterarPagamentos = new JButton("SALDO DA PARÓQUIA");
		btnAlterarPagamentos.addActionListener(new ActionListener() {
			FrmSaldo Saldo = new FrmSaldo();
			
			public void actionPerformed(ActionEvent e) {
				Saldo.setVisible(true);
			}
		});
		btnAlterarPagamentos.setBounds(973, 193, 224, 55);
		panel.add(btnAlterarPagamentos);
		
		JButton btnHistórico = new JButton("HISTÓRICO DE PAGAMENTOS");
		btnHistórico.addActionListener(new ActionListener() {
			FrmHistorico historicoD = new FrmHistorico();
			
			public void actionPerformed(ActionEvent e) {
				historicoD.setVisible(true);
			}
		});
		btnHistórico.setBounds(624, 484, 224, 55);
		panel.add(btnHistórico);
		
		JButton btnEventos = new JButton("EVENTOS DA PARÓQUIA");
		btnEventos.addActionListener(new ActionListener() {
			FrmEventos eventos = new FrmEventos();
			public void actionPerformed(ActionEvent e) {
				eventos.setVisible(true);
			}
		});
		btnEventos.setBounds(973, 484, 224, 55);
		panel.add(btnEventos);
		
		JButton btnPagamento = new JButton("CONFIRMAR PAGAMENTO");
		btnPagamento.addActionListener(new ActionListener() {
			FrmPagamento pagamentos = new FrmPagamento();
			public void actionPerformed(ActionEvent e) {
				pagamentos.setVisible(true);
			}
		});
		btnPagamento.setBounds(973, 339, 224, 55);
		panel.add(btnPagamento);
		
		JLabel lblMenu = new JLabel("MENU");
		lblMenu.setForeground(Color.WHITE);
		lblMenu.setFont(new Font("Impact", Font.PLAIN, 25));
		lblMenu.setBounds(871, 38, 85, 38);
		panel.add(lblMenu);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(FrmTelaInicial.class.getResource("/imagem/bd2276bc6963e93fbbe1d7d1cb0c6a36.jpg")));
		lblNewLabel.setBounds(0, 0, 562, 681);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(FrmTelaInicial.class.getResource("/imagem/azul-escuro20.jpg")));
		lblNewLabel_2.setBounds(549, 0, 715, 681);
		panel.add(lblNewLabel_2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
