package Classes;

import javax.swing.JOptionPane;

public class Telefone 
{
	
	//atributos
	private String ddi;
	private String ddd;
	private String numero;
	private String tipo;
	private String operadora;

	//métodos 
	
	public void setDDI(String di)
	{	ddi = di;	}
			
	public String getDDI()
	{	return ddi;	}
	
	public void setDDD(String d)
	{	ddd = d;	}
			
	public String getDDD()
	{	return ddd;	}
	
	public void setNumero(String n)
	{	numero = n;	}
			
	public String getNumero()
	{	return numero;	}
	
	public void setTipo(String t)
	{	tipo = t;	}
			
	public String getTipo()
	{	return tipo;	}
	
	public void setOperadora(String o)
	{	operadora = o;	}
			
	public String getOperadora()
	{	return operadora;	}
	
	public Telefone()
	{
		ddi = JOptionPane.showInputDialog("Informe o DDI: ");
		ddd = JOptionPane.showInputDialog("Informe o DDD: ");
		numero = JOptionPane.showInputDialog("Informe o Numero do celular: ");
		tipo = JOptionPane.showInputDialog("Informe o tipo: ");
		operadora = JOptionPane.showInputDialog("Informe a operadora: ");
	}
	
}

