package lista05q07;

import javax.swing.JOptionPane;

public class hora
{
	
	private int segundo;
	private int minuto;
	private int horaa;
	
	public void setSegundo(int s)
	{ segundo=s; 	}
	public int getSegundo()
	{ return segundo;	}
	public void setMinuto(int m)
	{ minuto=m; 	}
	public int getMinuto()
	{ return minuto;	}
	public void setHoraa(int h)
	{ horaa=h; 	}
	public int getHoraa()
	{ return horaa;	} 
	
	public hora()
	{
		segundo = Integer.parseInt(JOptionPane.showInputDialog("Informe os segundos:"));
		minuto = Integer.parseInt(JOptionPane.showInputDialog("Informe os minutos:"));
		horaa = Integer.parseInt(JOptionPane.showInputDialog("Informe as horas:"));
	}

	
	public int quant1()
	{ return segundo; }
	public int quant2()
	{ return minuto; }
	public int quant3()
	{ return horaa; }
}