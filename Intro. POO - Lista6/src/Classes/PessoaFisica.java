package Classes;

import javax.swing.JOptionPane;

public class PessoaFisica extends Cliente
{
	//atributos
	private String cpf;
	private String dtNascimento;
	
	//metodos
	public void setCpf(String cf) 
	{	cpf = cf;	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setDtNascimento(String nascimento) {
		dtNascimento = nascimento;
	}
	
	public String getDtNascimento() {
		return dtNascimento;
	}
	
	public PessoaFisica()
	{
		super();
		cpf = JOptionPane.showInputDialog("Informe o CPF: ");
		dtNascimento = JOptionPane.showInputDialog("Informe a data de nascimento ");	
	}
	public void fazerPedido(){
		super.fazerPedido();
	}
	public void imprimirFatura(){
		super.imprimirFatura();
		JOptionPane.showMessageDialog(
				null, "CPF: "+cpf
				+"\nData de nascimento: "+dtNascimento
		);	
	}
}
