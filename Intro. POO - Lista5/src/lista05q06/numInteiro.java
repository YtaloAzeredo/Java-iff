package lista05q06;

import javax.swing.JOptionPane;

public class numInteiro
{
	
	private int a;
	private int b;
	
	public void setA(int ai)
	{ a=ai; 	}
	public int getA()
	{ return a;	} 
	public void setB(int bi)
	{ b=bi;	}
	public int getB()
	{ return b;} 
	
	public numInteiro()
	{
		a = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor inteiro A:"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor inteiro B:"));
	}

	
	public int soma()
	{ return a+b; }
	public int sub()
	{ return a-b; }
	public int quant1()
	{ return a; }
	public int quant2()
	{ return b; }
}