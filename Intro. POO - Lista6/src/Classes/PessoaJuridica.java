package Classes;

import javax.swing.JOptionPane;

public class PessoaJuridica extends Cliente
{
	//atributos
	private String cnpj;
	
	//métodos
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cj) {
		cnpj = cj;
	}
	
	public PessoaJuridica()
	{	
		super();
		cnpj = JOptionPane.showInputDialog("Informe o CNPJ: ");
	}
	
	public void fazerPedido(){
		super.fazerPedido();
	}

	public void imprimirFatura(){
		super.imprimirFatura();
		JOptionPane.showMessageDialog(null, "CPNJ: "+ cnpj);	
	}
}
