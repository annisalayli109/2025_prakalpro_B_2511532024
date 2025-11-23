package pekan8_2511532024;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tugasAlproPekan8_2511532024 extends JFrame {

	private static final long serialVersionUID = 1L;
	protected static final int A1 = 0;
	protected static final int A2 = 0;
	private JPanel contentPane;
	private JTextField txtA1;
	private JTextField txtA2;
	private JTextField txtPlus;
	private JTextField txtMinus;
	private JTextField txtTimes;
	private JTextField txtDiv;
	private JTextField txtMod;
	
	private void pesanPeringatan(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "peringatan", JOptionPane.WARNING_MESSAGE);	
	}
	private void pesanEror(String pesan) {
		JOptionPane.showMessageDialog(this, pesan,"Kesalahan",JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tugasAlproPekan8_2511532024 frame = new tugasAlproPekan8_2511532024();
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
	public tugasAlproPekan8_2511532024() {
		setTitle("OPERATOR ASSIGNMENT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 338, 349);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OPERATOR ASSIGNMENT");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblNewLabel.setBounds(43, 11, 243, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bilangan 1");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(35, 50, 80, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Bilangan 2");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(35, 75, 80, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Hasil Operasi:");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(64, 110, 94, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Penjumlahan");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setForeground(Color.BLACK);
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1_3.setBounds(35, 147, 80, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Pengurangan");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setForeground(Color.BLACK);
		lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1_4.setBounds(35, 178, 80, 14);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Perkalian");
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5.setForeground(Color.BLACK);
		lblNewLabel_1_5.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1_5.setBounds(35, 211, 80, 14);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Pembagian");
		lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6.setForeground(Color.BLACK);
		lblNewLabel_1_6.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1_6.setBounds(35, 243, 80, 14);
		contentPane.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("Sisa Hasil");
		lblNewLabel_1_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_7.setForeground(Color.BLACK);
		lblNewLabel_1_7.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1_7.setBounds(35, 275, 80, 14);
		contentPane.add(lblNewLabel_1_7);
		
		txtA1 = new JTextField();
		txtA1.setBackground(Color.LIGHT_GRAY);
		txtA1.setHorizontalAlignment(SwingConstants.CENTER);
		txtA1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		txtA1.setBounds(125, 47, 66, 20);
		contentPane.add(txtA1);
		txtA1.setColumns(10);
		
		txtA2 = new JTextField();
		txtA2.setBackground(Color.LIGHT_GRAY);
		txtA2.setHorizontalAlignment(SwingConstants.CENTER);
		txtA2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		txtA2.setBounds(125, 72, 66, 20);
		contentPane.add(txtA2);
		txtA2.setColumns(10);
		
		txtPlus = new JTextField();
		txtPlus.setBackground(Color.LIGHT_GRAY);
		txtPlus.setHorizontalAlignment(SwingConstants.CENTER);
		txtPlus.setFont(new Font("Times New Roman", Font.BOLD, 12));
		txtPlus.setEditable(false);
		txtPlus.setBounds(125, 144, 66, 20);
		contentPane.add(txtPlus);
		txtPlus.setColumns(10);
		
		txtMinus = new JTextField();
		txtMinus.setBackground(Color.LIGHT_GRAY);
		txtMinus.setHorizontalAlignment(SwingConstants.CENTER);
		txtMinus.setFont(new Font("Times New Roman", Font.BOLD, 12));
		txtMinus.setEditable(false);
		txtMinus.setBounds(125, 175, 66, 20);
		contentPane.add(txtMinus);
		txtMinus.setColumns(10);
		
		txtTimes = new JTextField();
		txtTimes.setBackground(Color.LIGHT_GRAY);
		txtTimes.setHorizontalAlignment(SwingConstants.CENTER);
		txtTimes.setFont(new Font("Times New Roman", Font.BOLD, 12));
		txtTimes.setEditable(false);
		txtTimes.setBounds(125, 208, 66, 20);
		contentPane.add(txtTimes);
		txtTimes.setColumns(10);
		
		txtDiv = new JTextField();
		txtDiv.setBackground(Color.LIGHT_GRAY);
		txtDiv.setHorizontalAlignment(SwingConstants.CENTER);
		txtDiv.setFont(new Font("Times New Roman", Font.BOLD, 12));
		txtDiv.setEditable(false);
		txtDiv.setBounds(125, 240, 66, 20);
		contentPane.add(txtDiv);
		txtDiv.setColumns(10);
		
		txtMod = new JTextField();
		txtMod.setBackground(Color.LIGHT_GRAY);
		txtMod.setHorizontalAlignment(SwingConstants.CENTER);
		txtMod.setFont(new Font("Times New Roman", Font.BOLD, 12));
		txtMod.setEditable(false);
		txtMod.setBounds(125, 272, 66, 20);
		contentPane.add(txtMod);
		txtMod.setColumns(10);
		
		JButton btnNewButton = new JButton("PROSES");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (txtA1.getText().trim().isEmpty()) {
					pesanPeringatan("Bilangan 1 harus diisi");
				} else if (txtA2.getText().trim().isEmpty()) {
					pesanPeringatan("Bilangan 2 harus diisi");
				}
				
				try {
			        int A1 = Integer.parseInt(txtA1.getText());
			        int A2 = Integer.parseInt(txtA2.getText());

			        int plus = A1;  plus += A2;
	                int minus = A1; minus -= A2;
	                int times = A1; times *= A2;
	                int div = A1;   div /= A2;
	                int mod = A1;   mod %= A2;

	                txtPlus.setText(String.valueOf(plus));
	                txtMinus.setText(String.valueOf(minus));
	                txtTimes.setText(String.valueOf(times));
	                txtDiv.setText(String.valueOf(div));
	                txtMod.setText(String.valueOf(mod));

			    } catch (NumberFormatException ex) {
					pesanEror("Bilangan 1 dan Bilangan 2 harus angka");
			    }
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton.setBounds(216, 66, 94, 23);
		contentPane.add(btnNewButton);

	}

}
