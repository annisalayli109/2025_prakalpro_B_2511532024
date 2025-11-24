package pekan9_2511532024;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class calculator_2511532024 {

	private JFrame frmCalculator;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator_2511532024 window = new calculator_2511532024();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator_2511532024() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.getContentPane().setBackground(Color.GRAY);
		frmCalculator.setTitle("CALCULATOR");
		frmCalculator.setBounds(100, 100, 308, 403);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 18));
		textField.setBounds(10, 11, 270, 66);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.setBackground(Color.LIGHT_GRAY);
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(textField.getText().length()>0) {
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 20));
		btnBackspace.setBounds(10, 88, 67, 51);
		frmCalculator.getContentPane().add(btnBackspace);
		
		JButton btn7 = new JButton("7");
		btn7.setBackground(Color.LIGHT_GRAY);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btn7.setBounds(10, 141, 67, 51);
		frmCalculator.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.setBackground(Color.LIGHT_GRAY);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btn4.setBounds(10, 194, 67, 51);
		frmCalculator.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.setBackground(Color.LIGHT_GRAY);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btn1.setBounds(10, 247, 67, 51);
		frmCalculator.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.setBackground(Color.LIGHT_GRAY);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btn0.setBounds(10, 300, 67, 51);
		frmCalculator.getContentPane().add(btn0);
		
		JButton btnClear = new JButton("C");
		btnClear.setBackground(Color.LIGHT_GRAY);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnClear.setBounds(78, 88, 67, 51);
		frmCalculator.getContentPane().add(btnClear);
		
		JButton btn8 = new JButton("8");
		btn8.setBackground(Color.LIGHT_GRAY);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btn8.setBounds(78, 141, 67, 51);
		frmCalculator.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.setBackground(Color.LIGHT_GRAY);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btn5.setBounds(78, 194, 67, 51);
		frmCalculator.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.setBackground(Color.LIGHT_GRAY);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btn2.setBounds(78, 247, 67, 51);
		frmCalculator.getContentPane().add(btn2);
		
		JButton btnDot = new JButton(".");
		btnDot.setBackground(Color.LIGHT_GRAY);
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnDot.setBounds(78, 300, 67, 51);
		frmCalculator.getContentPane().add(btnDot);
		
		JButton btn00 = new JButton("00");
		btn00.setBackground(Color.LIGHT_GRAY);
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn00.getText();
				textField.setText(number);
			}
		});
		btn00.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btn00.setBounds(146, 88, 67, 51);
		frmCalculator.getContentPane().add(btn00);
		
		JButton btn9 = new JButton("9");
		btn9.setBackground(Color.LIGHT_GRAY);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btn9.setBounds(146, 141, 67, 51);
		frmCalculator.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.setBackground(Color.LIGHT_GRAY);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btn6.setBounds(146, 194, 67, 51);
		frmCalculator.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.setBackground(Color.LIGHT_GRAY);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btn3.setBounds(146, 247, 67, 51);
		frmCalculator.getContentPane().add(btn3);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setBackground(Color.LIGHT_GRAY);
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operation=="+") {
					result=first+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="-") {
					result=first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="*") {
					result=first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="/") {
					result=first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="%") {
					result=first%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btnEqual.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnEqual.setBounds(146, 300, 67, 51);
		frmCalculator.getContentPane().add(btnEqual);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setBackground(Color.LIGHT_GRAY);
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnPlus.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnPlus.setBounds(213, 88, 67, 51);
		frmCalculator.getContentPane().add(btnPlus);
		
		JButton btnSub = new JButton("-");
		btnSub.setBackground(Color.LIGHT_GRAY);
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnSub.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnSub.setBounds(213, 141, 67, 51);
		frmCalculator.getContentPane().add(btnSub);
		
		JButton btnMul = new JButton("*");
		btnMul.setBackground(Color.LIGHT_GRAY);
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMul.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnMul.setBounds(213, 194, 67, 51);
		frmCalculator.getContentPane().add(btnMul);
		
		JButton btnDivide = new JButton("/");
		btnDivide.setBackground(Color.LIGHT_GRAY);
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDivide.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnDivide.setBounds(213, 247, 67, 51);
		frmCalculator.getContentPane().add(btnDivide);
		
		JButton btnPercent = new JButton("%");
		btnPercent.setBackground(Color.LIGHT_GRAY);
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnPercent.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnPercent.setBounds(213, 300, 67, 51);
		frmCalculator.getContentPane().add(btnPercent);
	}
}
