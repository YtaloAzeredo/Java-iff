package Classes;

import javax.swing.JOptionPane;

public class Fatura 
{
	// atributos
	
	private String numeroFatura;
	private String dataVencimento;
	private String valorTotal;
	
	//m�todos
	public void setNumeroFatura(String numeroFatura) 
	{	this.numeroFatura = numeroFatura;	}
	
	public String getNumeroFatura() 
	{	return numeroFatura;	}
	
	public void setDataVencimento(String dataVence) 
	{	dataVencimento = dataVence;	}
	
	public String getDataVencimento() 
	{	return dataVencimento;	}
	
	public void setValorTotal(float valTotal) 
	{	valorTotal = valTotal;	}
	
	public float getValorTotal() 
	{	return valorTotal;	}
	
	public Fatura()
	{
		numeroFatura = JOptionPane.showInputDialog("Informe o n�mero da fatura: ");
		dataVencimento = JOptionPane.showInputDialog("Informe a data de vencimento da fatura: ");
		valorTotal = JOptionPane.showInputDialog("Informe o valor total da fatura:");		
	}

}
