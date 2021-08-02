package lista05q02;

import javax.swing.JOptionPane;

public class TesteQuadrado {

	public static void main(String[] args) 
	{
		quadrado objQ = new quadrado();
		
		JOptionPane.showMessageDialog(null, "Área do quadrado = "+objQ.encontrarArea() );

	}

}
