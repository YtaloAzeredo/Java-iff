package Classes;

import javax.swing.JOptionPane;

public class Endereco {
	
	//atributos
	private String rua;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String cep;
	private String estado;
	
	//metodos
	public void setRua(String r)
	{	rua = r;	}
		
	public String getRua()
	{	return rua;	}
	
	public void setNumero(String n)
	{	numero = n;	}
		
	public String getNumero()
	{	return numero;	}
	
	public void setComplemento(String comp)
	{	complemento = comp;	}
		
	public String getComplemento()
	{	return complemento;	}
	
	public void setBairro(String b)
	{	bairro = b;	}
		
	public String getBairro()
	{	return bairro;	}
	
	public void setCidade(String cid)
	{	cidade = cid;	}
		
	public String getCidade()
	{	return cidade;	}
	
	public void setCep(String c)
	{	cep = c;	}
		
	public String getCep()
	{	return cep;	}
	
	public void setEstado(String es)
	{	estado = es;	}
		
	public String getEstado()
	{	return estado;	}
	
	public Endereco()
	{
		rua = JOptionPane.showInputDialog("Informe a Rua: ");
		numero = JOptionPane.showInputDialog("Informe o Numero da Rua: ");
		complemento = JOptionPane.showInputDialog("Informe o  Complemento: ");
		bairro = JOptionPane.showInputDialog("Informe o Bairro: ");
		cidade = JOptionPane.showInputDialog("Informe a Cidade: ");
		cep = JOptionPane.showInputDialog("Informe o CEP: ");
		estado = JOptionPane.showInputDialog("Informe o Estado: ");

	}
}
