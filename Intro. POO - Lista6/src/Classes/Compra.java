package Classes;

import javax.swing.JOptionPane;

public class Compra {

	public static void main(String[] args) {
		String resposta = JOptionPane.showInputDialog("Pessoa Fisica ou Pessoa Juridica?");
		
		if(resposta.equalsIgnoreCase("Pessoa Fisica"))
		{
			PessoaFisica objPF = new PessoaFisica();	
			objPF.fazerPedido();
			objPF.imprimirFatura();
			}
		else 
		{
			PessoaJuridica objPJ = new PessoaJuridica();	
			objPJ.fazerPedido();
			objPJ.imprimirFatura();
			}
		
	}

}
