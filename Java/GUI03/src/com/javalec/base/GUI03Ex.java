package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI03Ex {

	private JFrame frame;
	private JRadioButton rbAdd;
	private JRadioButton rbSub;
	private JRadioButton rbMul;
	private JRadioButton rbDiv;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lbResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI03Ex window = new GUI03Ex();
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
	public GUI03Ex() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getRbAdd());
		frame.getContentPane().add(getRbSub());
		frame.getContentPane().add(getRbMul());
		frame.getContentPane().add(getRbDiv());
		frame.getContentPane().add(getTfNum1());
		frame.getContentPane().add(getTfNum2());
		frame.getContentPane().add(getLbResult());
	}

	private JRadioButton getRbAdd() {
		if (rbAdd == null) {
			rbAdd = new JRadioButton("Add");
			rbAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calc();
				}
			});
			rbAdd.setToolTipText("");
			buttonGroup.add(rbAdd);
			rbAdd.setBounds(286, 18, 141, 23);
		}
		return rbAdd;
	}
	private JRadioButton getRbSub() {
		if (rbSub == null) {
			rbSub = new JRadioButton("Sub");
			rbSub.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calc();
				}
			});
			buttonGroup.add(rbSub);
			rbSub.setBounds(286, 58, 141, 23);
		}
		return rbSub;
	}
	private JRadioButton getRbMul() {
		if (rbMul == null) {
			rbMul = new JRadioButton("Mul");
			rbMul.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calc();
				}
			});
			buttonGroup.add(rbMul);
			rbMul.setBounds(286, 93, 141, 23);
		}
		return rbMul;
	}
	private JRadioButton getRbDiv() {
		if (rbDiv == null) {
			rbDiv = new JRadioButton("Div");
			rbDiv.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calc();
				}
			});
			buttonGroup.add(rbDiv);
			rbDiv.setBounds(286, 134, 141, 23);
		}
		return rbDiv;
	}
	private JTextField getTfNum1() {
		if (tfNum1 == null) {
			tfNum1 = new JTextField();
			tfNum1.setBounds(35, 17, 130, 26);
			tfNum1.setColumns(10);
		}
		return tfNum1;
	}
	private JTextField getTfNum2() {
		if (tfNum2 == null) {
			tfNum2 = new JTextField();
			tfNum2.setBounds(35, 57, 130, 26);
			tfNum2.setColumns(10);
		}
		return tfNum2;
	}
	private JLabel getLbResult() {
		if (lbResult == null) {
			lbResult = new JLabel("");
			lbResult.setBounds(53, 179, 353, 23);
		}
		return lbResult;
	}
	
	
public void calc() {
	int num1 = Integer.parseInt(tfNum1.getText());
	int num2 = Integer.parseInt(tfNum2.getText());
	
	lbResult.setText("");
	if(rbAdd.isSelected()==true) {
		lbResult.setText(tfNum1.getText() + "+"+ tfNum2.getText() + "=" + Integer.toString(num1+num2));
	}
	if(rbSub.isSelected()==true) {
		lbResult.setText(tfNum1.getText() + "-"+ tfNum2.getText() + "=" + Integer.toString(num1-num2));
	}
	if(rbMul.isSelected()==true) {
		lbResult.setText(tfNum1.getText() + "x"+ tfNum2.getText() + "=" + Integer.toString(num1*num2));
	}
	if(rbDiv.isSelected()==true) {
		if(num2==0) {
			lbResult.setText("0 is not Dvi");
		}else {
			lbResult.setText(tfNum1.getText() + "%"+ tfNum2.getText() + "=" + String.format("%3f",(double)num1/num2));
		}
		
	}
	
}
	
	
	
}///





