package lista05q03;

import javax.swing.JOptionPane;

public class testeCirculo {

	public static void main(String[] args) 
	{
		circulo objC = new circulo();
		
		
		JOptionPane.showMessageDialog(null, "Raio do círculo = "+objC.encontrarRaio() );

	}

}
