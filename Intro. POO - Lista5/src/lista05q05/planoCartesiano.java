package lista05q05;

import javax.swing.JOptionPane;

public class planoCartesiano
{
	
	private float valorX;
	private float valorY;
	
	public void setValorX(float x)
	{ valorX=x; 	}
	public float getValorX()
	{ return valorX;	} 
	public void setValorY(float y)
	{ valorY=y; 	}
	public float getValorY()
	{ return valorY;	} 
	

		public planoCartesiano()
		{
			valorX = Float.parseFloat(JOptionPane.showInputDialog("Informe o X:"));
			valorY = Float.parseFloat(JOptionPane.showInputDialog("Informe o Y:"));
		}

	
	public float coordenadaX()
	{ return valorX; }
	public float coordenadaY()
	{ return valorY; }
}