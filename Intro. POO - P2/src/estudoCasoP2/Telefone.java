package estudoCasoP2;

import javax.swing.JOptionPane;

public class Telefone
{
	//atributos comuns
	private String ddi;
	private String ddd;
	private String numero;
	private String tipo;
	private String operadora;
	
	//m�todos de acesso comuns
	public String getDdi()
	{	return ddi;	}
	
	public void setDdi(String ddi)
	{	this.ddi = ddi;	}
	
	public String getDdd()
	{	return ddd;	}
	
	public void setDdd(String ddd)
	{	this.ddd = ddd;	}
	
	public String getNumero()
	{	return numero;	}
	
	public void setNumero(String numero)
	{	this.numero = numero;	}
	
	public String getTipo()
	{	return tipo;	}
	
	public void setTipo(String tipo)
	{	this.tipo = tipo;	}
	
	public String getOperadora()
	{	return operadora;	}
	
	public void setOperadora(String operadora)
	{	this.operadora = operadora;	}
			
	//m�todo construtor
	public Telefone()
	{	ddi = JOptionPane.showInputDialog("Informe o DDI: ");
		ddd = JOptionPane.showInputDialog("Informe o DDD: ");
		numero = JOptionPane.showInputDialog("Informe o n�mero: ");
		tipo = JOptionPane.showInputDialog("Informe o tipo: ");
		operadora = JOptionPane.showInputDialog("Informe a operadora: ");
	}
}