package lista05q01;

import javax.swing.JOptionPane;

public class TesteRetangulo 
{

	public static void main(String[] args) 
	{
		//criar objeto
		retangulo objR = new retangulo();
		
		
		//chamada de opera��es e exibir resultados
		JOptionPane.showMessageDialog(null, "�rea do retangulo = "+objR.encontrarArea() );
		JOptionPane.showMessageDialog(null, "Perimetro do retangulo = "+objR.encontrarPerimetro());
	
	}

}
