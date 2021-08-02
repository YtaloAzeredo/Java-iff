package lista05q07;

import javax.swing.JOptionPane;


public class testeHora
{

	public static void main(String[] args) 
	{
		hora objH = new hora();
		
		
		JOptionPane.showMessageDialog(null, "Horário inserido = "+objH.quant3()+":"+objH.quant2()+":"+objH.quant1() );
		
	}

}
