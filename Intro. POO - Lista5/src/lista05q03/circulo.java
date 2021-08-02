package lista05q03;

import javax.swing.JOptionPane;

public class circulo
{
	//atributos
	private float diametro;
	
	//metodos
	public void setDiametro(float d)
	{ diametro=d; }
	public float getDiametro()
	{ return diametro; }
	
	//metodo construtor
			public circulo()
			{
				//preenchimento de atributos
				diametro = Float.parseFloat(JOptionPane.showInputDialog("Informe o diametro"));
			}
	
	//operações
	public float encontrarRaio()
	{ return diametro/2; }
}