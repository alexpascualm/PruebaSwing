import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class swingdesigner {

	private JFrame frame;
	private JTextField textField;
	private double first = 0;
	private double second = 0;
	private double result = 0;
	private String operation = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swingdesigner window = new swingdesigner();
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
	public swingdesigner() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Calculadora c = new Calculadora();
		frame = new JFrame();
		frame.setBounds(100, 100, 461, 627);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBounds(85, 19, 246, 60);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton b1 = new JButton("1");
		b1.setBounds(23, 346, 70, 68);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + b1.getText();
				textField.setText(number);
			}
		});
		frame.getContentPane().add(b1);

		JButton b4 = new JButton("4");
		b4.setBounds(23, 268, 70, 68);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + b4.getText();
				textField.setText(number);
			}
		});
		frame.getContentPane().add(b4);

		JButton b7 = new JButton("7");
		b7.setBounds(23, 183, 70, 68);
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + b7.getText();
				textField.setText(number);
			}
		});
		frame.getContentPane().add(b7);

		JButton bSuma = new JButton("+");
		bSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().isEmpty()) {

					try {
						if (operation.equalsIgnoreCase("+")) {
							first += Double.parseDouble(textField.getText());
							textField.setText("");
							operation = "+";
						}else if (operation.equalsIgnoreCase("x")) {
							first =first* Double.parseDouble(textField.getText());
							textField.setText("");
							operation = "+";
						}
						else if (operation.equalsIgnoreCase("/")) {
							first =first/Double.parseDouble(textField.getText());
							textField.setText("");
							operation = "+";
						}
						else if (operation.equalsIgnoreCase("-")) {
							first -=Double.parseDouble(textField.getText());
							textField.setText("");
							operation = "+";
						}
						else {
							first = Double.parseDouble(textField.getText());
							textField.setText("");
							operation = "+";
						}
					} catch (Exception ex) {
						textField.setText("Número no válido");

					}
				}

			}
		});
		bSuma.setBounds(321, 101, 70, 68);
		frame.getContentPane().add(bSuma);

		JButton b2 = new JButton("2");
		b2.setBounds(126, 346, 70, 68);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + b2.getText();
				textField.setText(number);
			}
		});
		frame.getContentPane().add(b2);

		JButton b5 = new JButton("5");
		b5.setBounds(126, 268, 70, 68);
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + b5.getText();
				textField.setText(number);
			}
		});
		frame.getContentPane().add(b5);

		JButton b8 = new JButton("8");
		b8.setBounds(126, 184, 70, 68);
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + b8.getText();
				textField.setText(number);
			}
		});
		frame.getContentPane().add(b8);

		JButton bResta = new JButton("-");
		bResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().isEmpty()) {

					try {
						if (operation.equalsIgnoreCase("-")) {
							first -= Double.parseDouble(textField.getText());
							textField.setText("");
							operation = "-";
						}
						else if (operation.equalsIgnoreCase("+")) {
							first +=Double.parseDouble(textField.getText());
							textField.setText("");
							operation = "-";
						}
						else if (operation.equalsIgnoreCase("x")) {
							first =first* Double.parseDouble(textField.getText());
							textField.setText("");
							operation = "-";
						}
						else if (operation.equalsIgnoreCase("/")) {
							first =first/ Double.parseDouble(textField.getText());
							textField.setText("");
							operation = "-";
						}else {
							first = Double.parseDouble(textField.getText());
							textField.setText("");
							operation = "-";
						}
					} catch (Exception ex) {
						textField.setText("Número no válido");

					}
				} else {
					textField.setText("-");
				}

			}
		});
		bResta.setBounds(321, 185, 70, 68);
		frame.getContentPane().add(bResta);

		JButton b3 = new JButton("3");
		b3.setBounds(220, 346, 70, 68);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + b3.getText();
				textField.setText(number);
			}
		});
		frame.getContentPane().add(b3);

		JButton b6 = new JButton("6");
		b6.setBounds(220, 268, 70, 68);
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + b6.getText();
				textField.setText(number);
			}

		});
		frame.getContentPane().add(b6);

		JButton b9 = new JButton("9");
		b9.setBounds(220, 185, 70, 68);
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + b9.getText();
				textField.setText(number);
			}
		});
		frame.getContentPane().add(b9);

		JButton bComa = new JButton(".");
		bComa.setBounds(126, 424, 70, 68);
		bComa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().contains(".") && textField.getText().length() != 0) {
					String number = textField.getText() + bComa.getText();
					textField.setText(number);
				}
			}
		});
		frame.getContentPane().add(bComa);

		JButton btnDel = new JButton("Del");
		btnDel.setBounds(23, 101, 70, 68);
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length() > 0) {
					String number = textField.getText();
					number = number.substring(0, number.length() - 1);
					textField.setText(number);
				}
			}
		});
		frame.getContentPane().add(btnDel);

		JButton bMult = new JButton("x");
		bMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().isEmpty()) {

					try {
						if (operation.equalsIgnoreCase("x")) {
							first = first * Double.parseDouble(textField.getText());
							textField.setText("");
							operation = "x";
						} 
						else if (operation.equalsIgnoreCase("+")) {
							first +=Double.parseDouble(textField.getText());
							textField.setText("");
							operation = "x";
						}
						else if (operation.equalsIgnoreCase("-")) {
							first -=Double.parseDouble(textField.getText());
							textField.setText("");
							operation = "x";
						}
						else if (operation.equalsIgnoreCase("/")) {
							first =first/Double.parseDouble(textField.getText());
							textField.setText("");
							operation = "x";
						}else {
							first = Double.parseDouble(textField.getText());
							textField.setText("");
							operation = "x";
						}
					} catch (Exception ex) {
						textField.setText("Número no válido");

					}
				}
			}
		});
		bMult.setBounds(322, 268, 70, 68);
		frame.getContentPane().add(bMult);

		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().isEmpty()) {

					try {
						if (operation.equalsIgnoreCase("/")) {
							first = first / Double.parseDouble(textField.getText());
							textField.setText("");
							operation = "/";
						} 
						else if (operation.equalsIgnoreCase("x")) {
							first =first* Double.parseDouble(textField.getText());
							textField.setText("");
							operation = "/";
						}
						else if (operation.equalsIgnoreCase("+")) {
							first +=Double.parseDouble(textField.getText());
							textField.setText("");
							operation = "/";
						}
						else if (operation.equalsIgnoreCase("-")) {
							first -=Double.parseDouble(textField.getText());
							textField.setText("");
							operation = "/";
						}else {
							first = Double.parseDouble(textField.getText());
							textField.setText("");
							operation = "/";
						}
					} catch (Exception ex) {
						textField.setText("Número no válido");

					}

				}
			}
		});
		btnDiv.setBounds(322, 346, 70, 68);
		frame.getContentPane().add(btnDiv);

		JButton btnPrimo = new JButton("Primo");
		btnPrimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Integer aux = Integer.parseInt(textField.getText());
					if (c.esPrimo(aux)) {
						textField.setText("Es primo");
					} else {
						textField.setText("No es primo");
					}
				} catch (Exception ex) {
					textField.setText("No es primo");
				}
			}
		});
		btnPrimo.setBounds(220, 424, 70, 68);
		frame.getContentPane().add(btnPrimo);

		JButton btnFact = new JButton("fact");
		btnFact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Integer aux = Integer.parseInt(textField.getText());
					textField.setText(Integer.toString(c.fact(aux)));
				} catch (Exception ex) {
					textField.setText("Número no válido");
				}
			}
		});
		btnFact.setBounds(322, 424, 70, 68);
		frame.getContentPane().add(btnFact);

		JButton btnC = new JButton("C");
		btnC.setBounds(124, 101, 70, 68);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				first = 0;
				second = 0;
				result = 0;
				operation = "";
			}
		});
		frame.getContentPane().add(btnC);

		JButton bIgual = new JButton("=");
		bIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (operation.equalsIgnoreCase("+")) {
					try {
						second = Double.parseDouble(textField.getText());
						result = c.suma(first, second);
						textField.setText(Double.toString(result));
					} catch (NumberFormatException ex) {

						result = c.suma(first, 0);
						textField.setText(Double.toString(result));

					}
				}
				if (operation.equalsIgnoreCase("-")) {
					try {
						second = Double.parseDouble(textField.getText());
						result = c.resta(first, second);
						textField.setText(Double.toString(result));
					} catch (NumberFormatException ex) {

						result = c.resta(first, 0);
						textField.setText(Double.toString(result));

					}
				}
				if (operation.equalsIgnoreCase("x")) {
					try {
						second = Double.parseDouble(textField.getText());
						result = c.mult(first, second);
						textField.setText(Double.toString(result));
					} catch (NumberFormatException ex) {

						result = c.mult(first, 1);
						textField.setText(Double.toString(result));

					}
				}
				if (operation.equalsIgnoreCase("/")) {
					try {
						second = Double.parseDouble(textField.getText());
						result = c.divide(first, second);
						textField.setText(Double.toString(result));
					} catch (NumberFormatException ex) {

						result = c.divide(first, 1);
						textField.setText(Double.toString(result));

					} catch (ArithmeticException ex2) {
						textField.setText("División entre 0 no permitida");

					}
				}
				operation = "";
			}
		});
		bIgual.setBounds(81, 511, 260, 57);
		frame.getContentPane().add(bIgual);

		JButton b00 = new JButton("00");
		b00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + b00.getText();
				textField.setText(number);
			}
		});
		b00.setBounds(219, 102, 70, 68);
		frame.getContentPane().add(b00);

		JButton b0 = new JButton("0");
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + b0.getText();
				textField.setText(number);
			}
		});
		b0.setBounds(23, 427, 70, 68);
		frame.getContentPane().add(b0);

	}
}
