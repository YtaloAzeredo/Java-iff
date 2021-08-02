package lista05q05;

import javax.swing.JOptionPane;

public class testeCartesiano
{

	public static void main(String[] args) 
	{
		planoCartesiano objPC = new planoCartesiano();
		
		
		JOptionPane.showMessageDialog(null, "Coordenada no plano: "+"("+objPC.coordenadaX()+","+objPC.coordenadaY()+")" );

	}

}
