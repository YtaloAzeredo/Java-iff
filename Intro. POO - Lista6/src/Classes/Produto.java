package Classes;

import javax.swing.JOptionPane;

public class Produto 
{
	// atributos
	private String codigo;
	private String nome;
	private String quantidade;
	private float precoUnitario;
	
	
	//métodos
	public void setCodigo(String code) 
	{	codigo = code;	}
	
	public String getCodigo() 
	{	return codigo;  }
	
	public void setNome(String name) 
	{	nome = name;	}
	
	public String getNome() 
	{	return nome;	}
	
	public void setQuantidade(String quant) 
	{	quantidade = quant;	}
	
	public String getQuantidade() 
	{	return quantidade;	}
	
	public void setPrecoUnitario(float precoUnitario) 
	{	this.precoUnitario = precoUnitario;		}
	
	public float getPrecoUnitario() 
	{	return precoUnitario;	}
	
	public Produto()
	{
		codigo = JOptionPane.showInputDialog("Informe o código do produto: ");
		nome = JOptionPane.showInputDialog("Informe o nome do produto: ");
		quantidade = JOptionPane.showInputDialog("Informe a quantidade do produto: ");
		precoUnitario = Float.parseFloat(JOptionPane.showInputDialog("Informe o preço unitário do produto: "));
	
	}
	
	
}
