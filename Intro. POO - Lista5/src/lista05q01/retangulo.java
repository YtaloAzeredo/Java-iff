package lista05q01;

import javax.swing.JOptionPane;

public class retangulo 
{
	//atributos
	private float base;
	private float altura;
	private static int numLados = 4;
	
	//metodos
	public void setBase(float b)
	{ base=b; 	}
	public float getBase()
	{ return base;	} 
	public void setAltura(float a)
	{ altura=a;	}
	public float getAltura()
	{ return altura;}
	public static void setNumLados(int nl)
	{ numLados=nl;	}
	public static int getNumLados()
	{	return numLados;	}
	
	//metodo construtor
	public retangulo()
	{
		//preenchimento de atributos
		base = Float.parseFloat(JOptionPane.showInputDialog("Informe a base:"));
		altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a altura:"));
	}
	
	//operações
	public float encontrarArea()
	{ return base*altura; }
	public float encontrarPerimetro()
	{ return 2*(base+altura); }
}