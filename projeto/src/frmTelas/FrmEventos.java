package frmTelas;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class FrmEventos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmEventos frame = new FrmEventos();
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
	public FrmEventos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEventos = new JLabel("E V E N T O S");
		lblEventos.setForeground(Color.WHITE);
		lblEventos.setFont(new Font("Impact", Font.PLAIN, 25));
		lblEventos.setBounds(607, 11, 132, 22);
		contentPane.add(lblEventos);
		
		JLabel lblMissas = new JLabel("MISSAS");
		lblMissas.setForeground(Color.WHITE);
		lblMissas.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblMissas.setBounds(114, 202, 93, 29);
		contentPane.add(lblMissas);
		
		JLabel lblFestas = new JLabel("FESTAS");
		lblFestas.setForeground(Color.WHITE);
		lblFestas.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblFestas.setBounds(408, 206, 93, 20);
		contentPane.add(lblFestas);
		
		JLabel lblMissasEspeciais = new JLabel("MISSAS ESPECIAIS");
		lblMissasEspeciais.setForeground(Color.WHITE);
		lblMissasEspeciais.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblMissasEspeciais.setBounds(730, 206, 160, 20);
		contentPane.add(lblMissasEspeciais);
		
		JLabel lblCatequese = new JLabel("CATEQUESE");
		lblCatequese.setForeground(Color.WHITE);
		lblCatequese.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblCatequese.setBounds(1085, 206, 122, 20);
		contentPane.add(lblCatequese);
		
		JButton btnSair = new JButton("SAIR\r\n\r\n");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSair.setBounds(607, 601, 106, 42);
		contentPane.add(btnSair);
		
		JLabel lblNewLabel = new JLabel("SÁBADOS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(1102, 237, 73, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("TURMA 1");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(1114, 277, 78, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("TURMA 2");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(1114, 333, 73, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("TURMA 3");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(1114, 386, 73, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("HORÁRIO 8:00 ÀS 9:00 ");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(1075, 295, 132, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("HORÁRIO 9:00 ÀS 10:00 ");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(1075, 349, 153, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("HORÁRIO 10:00 ÀS 11:00");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setBounds(1075, 402, 147, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("MISSA DIA DOS  FINADOS");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setBounds(730, 262, 160, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("MISSA DO ANO NOVO");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setBounds(743, 318, 147, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("MISSA DE PASCOA ");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setBounds(746, 386, 132, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("DATA 02/11   HORÁRIO 08:00h");
		lblNewLabel_11.setForeground(Color.WHITE);
		lblNewLabel_11.setBounds(718, 277, 172, 14);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_11_1 = new JLabel("DATA 31/12   HORÁRIO 07:00h");
		lblNewLabel_11_1.setForeground(Color.WHITE);
		lblNewLabel_11_1.setBounds(718, 333, 172, 14);
		contentPane.add(lblNewLabel_11_1);
		
		JLabel lblNewLabel_11_1_1 = new JLabel("DATA 05/06   HORÁRIO 10:00h");
		lblNewLabel_11_1_1.setForeground(Color.WHITE);
		lblNewLabel_11_1_1.setBounds(718, 402, 172, 14);
		contentPane.add(lblNewLabel_11_1_1);
		
		JLabel lblNewLabel_12 = new JLabel("SEGUNDA A SEXTA");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_12.setForeground(Color.WHITE);
		lblNewLabel_12.setBounds(103, 262, 132, 14);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("HORÁRIO 19:00h");
		lblNewLabel_13.setForeground(Color.WHITE);
		lblNewLabel_13.setBounds(103, 277, 122, 14);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_12_1 = new JLabel("SABÁDOS");
		lblNewLabel_12_1.setForeground(Color.WHITE);
		lblNewLabel_12_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_12_1.setBounds(103, 318, 132, 14);
		contentPane.add(lblNewLabel_12_1);
		
		JLabel lblNewLabel_13_1 = new JLabel("HORÁRIO 07:00h");
		lblNewLabel_13_1.setForeground(Color.WHITE);
		lblNewLabel_13_1.setBounds(103, 333, 122, 14);
		contentPane.add(lblNewLabel_13_1);
		
		JLabel lblNewLabel_13_2 = new JLabel("HORÁRIO 19:00h");
		lblNewLabel_13_2.setForeground(Color.WHITE);
		lblNewLabel_13_2.setBounds(103, 349, 122, 14);
		contentPane.add(lblNewLabel_13_2);
		
		JLabel lblNewLabel_12_1_1 = new JLabel("DOMINGO");
		lblNewLabel_12_1_1.setForeground(Color.WHITE);
		lblNewLabel_12_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_12_1_1.setBounds(103, 385, 116, 14);
		contentPane.add(lblNewLabel_12_1_1);
		
		JLabel lblNewLabel_13_1_1 = new JLabel("HORÁRIO 07:00h");
		lblNewLabel_13_1_1.setForeground(Color.WHITE);
		lblNewLabel_13_1_1.setBounds(103, 402, 122, 14);
		contentPane.add(lblNewLabel_13_1_1);
		
		JLabel lblNewLabel_13_2_1 = new JLabel("HORÁRIO 19:00h");
		lblNewLabel_13_2_1.setForeground(Color.WHITE);
		lblNewLabel_13_2_1.setBounds(103, 420, 122, 14);
		contentPane.add(lblNewLabel_13_2_1);
		
		JLabel lblNewLabel_8_1 = new JLabel("FESTA DE SANTA MARIA");
		lblNewLabel_8_1.setForeground(Color.WHITE);
		lblNewLabel_8_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_8_1.setBounds(381, 262, 160, 14);
		contentPane.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_11_2 = new JLabel("DATA 01/01   HORÁRIO 10:00h");
		lblNewLabel_11_2.setForeground(Color.WHITE);
		lblNewLabel_11_2.setBounds(369, 277, 172, 14);
		contentPane.add(lblNewLabel_11_2);

		JLabel lblNewLabel_8_2 = new JLabel("FESTA DE DIA DAS CRIANÇAS");
		lblNewLabel_8_2.setForeground(Color.WHITE);
		lblNewLabel_8_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_8_2.setBounds(361, 318, 197, 14);
		contentPane.add(lblNewLabel_8_2);
		
		JLabel lblNewLabel_11_1_2 = new JLabel("DATA 31/12   HORÁRIO 09:00h");
		lblNewLabel_11_1_2.setForeground(Color.WHITE);
		lblNewLabel_11_1_2.setBounds(369, 333, 172, 14);
		contentPane.add(lblNewLabel_11_1_2);
		
		JLabel lblNewLabel_10_1 = new JLabel("FESTA DE SÃO JOSÉ ");
		lblNewLabel_10_1.setForeground(Color.WHITE);
		lblNewLabel_10_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_10_1.setBounds(381, 386, 132, 14);
		contentPane.add(lblNewLabel_10_1);
		
		JLabel lblNewLabel_11_1_1_1 = new JLabel("DATA 19/03   HORÁRIO 20:00h");
		lblNewLabel_11_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_11_1_1_1.setBounds(361, 402, 172, 14);
		contentPane.add(lblNewLabel_11_1_1_1);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(FrmEventos.class.getResource("/imagem/azul-escuro20.jpg")));
		lblNewLabel_5.setBounds(0, 0, 1264, 681);
		contentPane.add(lblNewLabel_5);
		
		
		
	
	
		
	
		
		
		
		
		
	}
}
