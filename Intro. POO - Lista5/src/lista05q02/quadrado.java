package lista05q02;

import javax.swing.JOptionPane;

public class quadrado
{
	//atributos
	private float lados;
	private static int numLados = 4;
	
	//metodos
	public void setLados(float l)
	{ lados=l; }
	public float getLados()
	{ return lados;	}
	public static void setNumLados(int nl)
	{ numLados=nl;	}
	public static int getNumLados()
	{	return numLados;	}
	
	//metodo construtor
		public quadrado()
		{
			//preenchimento de atributos
			lados = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor de um lado:"));
		}
	
	//operações
	public float encontrarArea()
	{ return lados*lados; }
}