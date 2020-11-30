import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JToggleButton;

public class calculator {

	private JFrame frame;
	private JTextField textField;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button_11;
	private JButton button_12;
	private JButton button_14;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;
	private JButton button_13;
	private JButton btnCe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLACK);
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 447, 492);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(51, 29, 332, 81);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton buttonAdd = new JButton("+");
		buttonAdd.setForeground(Color.BLACK);
		buttonAdd.setBackground(Color.WHITE);
		buttonAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
			    textField.setText("");
			    operations = "+";	
			    }
		});
		buttonAdd.setFont(new Font("Tahoma", Font.BOLD, 17));
		buttonAdd.setBounds(223, 159, 75, 42);
		frame.getContentPane().add(buttonAdd);
		
		JButton button = new JButton("-");
		button.setForeground(Color.BLACK);
		button.setBackground(Color.WHITE);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
			    textField.setText("");
			    operations = "-";
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 17));
		button.setBounds(308, 159, 75, 42);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("*");
		button_1.setForeground(Color.BLACK);
		button_1.setBackground(Color.WHITE);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
			    textField.setText("");
			    operations = "*";
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_1.setBounds(308, 212, 75, 42);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("/");
		button_2.setForeground(Color.BLACK);
		button_2.setBackground(Color.WHITE);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textField.getText());
			    textField.setText("");
			    operations = "/";
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_2.setBounds(308, 264, 75, 42);
		frame.getContentPane().add(button_2);
		
		button_3 = new JButton("7");
		button_3.setForeground(Color.BLACK);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + button_3.getText();
				textField.setText(EnterNumber);
			}
		});
		button_3.setBackground(Color.WHITE);
		button_3.setFont(new Font("Dialog", Font.PLAIN, 14));
		button_3.setBounds(51, 212, 75, 42);
		frame.getContentPane().add(button_3);
		
		button_4 = new JButton("6");
		button_4.setForeground(Color.BLACK);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + button_4.getText();
				textField.setText(EnterNumber);
			}
		});
		button_4.setBackground(Color.WHITE);
		button_4.setFont(new Font("Dialog", Font.PLAIN, 14));
		button_4.setBounds(223, 265, 75, 42);
		frame.getContentPane().add(button_4);
		
		button_5 = new JButton("8");
		button_5.setForeground(Color.BLACK);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + button_5.getText();
				textField.setText(EnterNumber);
			}
		});
		button_5.setBackground(Color.WHITE);
		button_5.setFont(new Font("Dialog", Font.PLAIN, 14));
		button_5.setBounds(136, 212, 75, 42);
		frame.getContentPane().add(button_5);
		
		button_6 = new JButton("9");
		button_6.setForeground(Color.BLACK);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + button_6.getText();
				textField.setText(EnterNumber);
			}
		});
		button_6.setBackground(Color.WHITE);
		button_6.setFont(new Font("Dialog", Font.PLAIN, 14));
		button_6.setBounds(223, 212, 75, 42);
		frame.getContentPane().add(button_6);
		
		button_7 = new JButton("1");
		button_7.setForeground(Color.BLACK);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + button_7.getText();
				textField.setText(EnterNumber);
			}
		});
		button_7.setBackground(Color.WHITE);
		button_7.setFont(new Font("Dialog", Font.PLAIN, 14));
		button_7.setBounds(51, 318, 75, 42);
		frame.getContentPane().add(button_7);
		
		button_8 = new JButton("2");
		button_8.setForeground(Color.BLACK);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + button_8.getText();
				textField.setText(EnterNumber);
			}
		});
		button_8.setBackground(Color.WHITE);
		button_8.setFont(new Font("Dialog", Font.PLAIN, 14));
		button_8.setBounds(136, 318, 75, 42);
		frame.getContentPane().add(button_8);
		
		button_9 = new JButton("3");
		button_9.setForeground(Color.BLACK);
		button_9.setBackground(Color.WHITE);
		button_9.setFont(new Font("Dialog", Font.PLAIN, 14));
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + button_9.getText();
				textField.setText(EnterNumber);
			}
		});
		button_9.setBounds(223, 318, 75, 42);
		frame.getContentPane().add(button_9);
		
		button_10 = new JButton("4");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + button_10.getText();
				textField.setText(EnterNumber);
			}
		});
		button_10.setBackground(Color.WHITE);
		button_10.setFont(new Font("Dialog", Font.PLAIN, 14));
		button_10.setForeground(Color.BLACK);
		button_10.setBounds(51, 265, 75, 42);
		frame.getContentPane().add(button_10);
		
		button_11 = new JButton("5");
		button_11.setForeground(Color.BLACK);
		button_11.setBackground(Color.WHITE);
		button_11.setFont(new Font("Dialog", Font.PLAIN, 14));
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + button_11.getText();
				textField.setText(EnterNumber);
			}
		});
		button_11.setBounds(136, 265, 75, 42);
		frame.getContentPane().add(button_11);
		
		button_12 = new JButton("0");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + button_12.getText();
				textField.setText(EnterNumber);
			}
		});
		button_12.setBackground(Color.WHITE);
		button_12.setFont(new Font("Dialog", Font.PLAIN, 14));
		button_12.setBounds(136, 373, 75, 42);
		frame.getContentPane().add(button_12);
		
		button_14 = new JButton("=");
		button_14.setForeground(Color.BLACK);
		button_14.setBackground(Color.WHITE);
		button_14.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondnum = Double.parseDouble(textField.getText());
				if (operations == "+")
				{
					result = firstnum + secondnum;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
				else if (operations =="-")
				{
					result = firstnum - secondnum;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
				else if (operations == "*")
				{
					result = firstnum * secondnum;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
				else if (operations =="/")
				{
					result = firstnum / secondnum;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
				else if (operations == "n!") {
			    
					
				{
					
				     int result=1;
				     int j = (int) firstnum;
						  
				     for (int i=1;i<=j;i++) {
					 result*=i;
							   
			   }    
				   answer = String.valueOf(result);
				   textField.setText(answer);

						   
						   
						  
					
					}
			    }
			}
			    	
				
			
		});
		button_14.setBounds(308, 317, 75, 98);
		frame.getContentPane().add(button_14);
		
		JButton btnN = new JButton("n!");
		btnN.setForeground(Color.BLACK);
		btnN.setBackground(Color.WHITE);
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
			    textField.setText("");
			    operations = "n!";		
			    {
					
				     int result=1;
				     int j = (int) firstnum;
						  
				     for (int i=1;i<=j;i++) {
					 result*=i;
							   
			   }    
				   answer = String.valueOf(result);
				   textField.setText(answer);

					
			    }    
			    
			}
			
		});
		btnN.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnN.setBounds(223, 373, 75, 42);
		frame.getContentPane().add(btnN);
		
		JButton btnNewButton = new JButton("\u221A");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(textField.getText()));
				ops=Math.sqrt(ops);
				textField.setText(String.valueOf(ops));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBounds(51, 372, 75, 42);
		frame.getContentPane().add(btnNewButton);
		
		button_13 = new JButton("\u232B");
		button_13.setForeground(Color.BLACK);
		button_13.setBackground(Color.WHITE);
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

                String btnX=null;
				if(textField.getText().length() > 0);{
				StringBuilder strB = new StringBuilder(textField.getText());
				strB.deleteCharAt(textField.getText().length()-1);
				btnX = strB.toString();
				textField.setText(btnX);
				}	
				}

		});
		button_13.setBounds(51, 159, 75, 42);
		frame.getContentPane().add(button_13);
		
		btnCe = new JButton("CE");
		btnCe.setForeground(Color.BLACK);
		btnCe.setBackground(Color.WHITE);
		btnCe.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	 			   textField.setText(null);
			}
		});
		btnCe.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCe.setBounds(136, 158, 77, 42);
		frame.getContentPane().add(btnCe);
	}
}
