package lista05q06;

import javax.swing.JOptionPane;

public class testeInteiro
{

	public static void main(String[] args) 
	{
		numInteiro objI = new numInteiro();
		

		JOptionPane.showMessageDialog(null, "Valores = "+"a="+objI.quant1()+" e b="+objI.quant2());
		JOptionPane.showMessageDialog(null, "\nSoma = "+objI.soma()+"\nSubtração = "+objI.sub());
	}

}
