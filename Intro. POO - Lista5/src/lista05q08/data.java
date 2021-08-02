package lista05q08;

import javax.swing.JOptionPane;

public class data
{
	
	private int dia;
	private int mes;
	private int ano;
	
	public void setDia(int d)
	{ dia=d; 	}
	public int getDia()
	{ return dia;	} 
	public void setMes(int m)
	{ mes=m; 	}
	public int getMes()
	{ return mes;	} 
	public void setAno(int a)
	{ ano=a; 	}
	public int getAno()
	{ return ano;	} 
	
	public data()
	{
		dia = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia:"));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o mes:"));
		ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano:"));
		
	}

	
	public int quant1()
	{ return dia; }
	public int quant2()
	{ return mes; }
	public int quant3()
	{ return ano; }
}