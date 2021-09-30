package Calculadora;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Janela extends JFrame{	

	public Janela() 	
	   {	
		this.setTitle("Calculator");
		this.setSize(300,150);
		this.setResizable(false);

		Container c = this.getContentPane();

		JPanel panel = new JPanel();
		c.add(panel);
		
		JLabel num1 = new JLabel ("Valor 1: ");
		panel.add(num1);
		
		JTextField boxNum1 = new JTextField(10);
		panel.add(boxNum1);
		
		JLabel num2 = new JLabel ("Valor 2: ");
		panel.add(num2);
		
		JTextField boxNum2 = new JTextField(10);
		panel.add(boxNum2);
		
		JLabel resulted = new JLabel ("boxResulted: ");
		panel.add(resulted);
		
		JTextField boxResulted = new JTextField(10);
		panel.add(boxResulted);
		
		JButton soma = new JButton("+");
		panel.add(soma);
		
		JButton sub = new JButton ("-");
		panel.add(sub);
		
		JButton multi = new JButton("*");
		panel.add(multi);
		
		JButton div = new JButton("/");
		panel.add(div);

		public void fillEmpty(n1, n2) {
		   if (n1.getText().equals("") )
		   {
			   n1.setText("0");
		   }
		   if (n2.getText().equals(""))
		   {
			   n2.setText("0");
		   }
	   }

		soma.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					fillEmpty(boxNum1,boxNum2);
					boxResulted.setText("");
					Calculadora ObjCalc = new Calculadora (Integer.parseInt(boxNum1.getText()), Integer.parseInt(boxNum2.getText()));
					boxResulted.setText(String.format("%.2f",ObjCalc.Soma()));
				}});

		sub.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {						
						fillEmpty(boxNum1,boxNum2);
						Calculadora ObjCalc = new Calculadora(Integer.parseInt(boxNum1.getText()), Integer.parseInt(boxNum2.getText()));
						boxResulted.setText(String.format("%.2f",ObjCalc.Subt()));
				}});
		
		multi.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						fillEmpty(boxNum1, boxNum2);
						Calculadora objCalc = new Calculadora (Integer.parseInt(boxNum1.getText()), Integer.parseInt(boxNum2.getText()));
						boxResulted.setText(String.format("%.2f",objCalc.Mult()));
					}});
		
		div.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						fillEmpty(boxNum1, boxNum2);
						Calculadora ObjCalc = new Calculadora (Integer.parseInt(boxNum1.getText()), Integer.parseInt(boxNum2.getText()));
						boxResulted.setText(String.format("%.2f", ObjCalc.Div()));
					}});

		this.setVisible(true);
		this.repaint();	
	}
}
