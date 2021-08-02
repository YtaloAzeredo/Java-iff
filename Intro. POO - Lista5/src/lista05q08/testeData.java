package lista05q08;

import javax.swing.JOptionPane;

public class testeData
{

	public static void main(String[] args) 
	{
		data objD = new data();
		
		
		JOptionPane.showMessageDialog(null, "Data inserida: "+objD.quant1()+"/"+objD.quant2()+"/"+objD.quant3() );
		
	}

}
