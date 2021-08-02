package lista05q04;

import javax.swing.JOptionPane;

public class triangulo
{
	//atributos
	private float base;
	private float altura;
	private float lado;
	private static int numLados = 3;
	
	//metodos
	public void setBase(float b)
	{ base=b; 	}
	public float getBase()
	{ return base;	} 
	public void setAltura(float a)
	{ altura=a;	}
	public float getAltura()
	{ return altura;} 
	public void setLado(float l)
	{ lado=l; 	}
	public float getLado()
	{ return lado;	} 
	public static void setNumLados(int nl)
	{ numLados=nl;	}
	public static int getNumLados()
	{	return numLados;	}
	
	//metodo construtor
	public triangulo()
	{
		//preenchimento de atributos
		base = Float.parseFloat(JOptionPane.showInputDialog("Informe a base:"));
		altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a altura:"));
		lado = Float.parseFloat(JOptionPane.showInputDialog("Informe o lado:"));
	}
	
	//operações
	public float encontrarArea()
	{ return (base*altura)/2; }
}