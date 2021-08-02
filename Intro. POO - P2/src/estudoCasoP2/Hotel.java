package estudoCasoP2;

import javax.swing.JOptionPane;

public class Hotel extends Pessoa{
	private String cnpj;
	private String razaoSocial;
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public Hotel() {
		cnpj = JOptionPane.showInputDialog("Informe o CPF do cliente:");
		razaoSocial = JOptionPane.showInputDialog("Informe o CPF do cliente:");
	}
	public void imprimirDados() {
		super.imprimirDados();
		
		JOptionPane.showMessageDialog(null, "\nDADOS HOTEL:"
				+ "\nCNPJ: "+cnpj
				+ "\nRazao Social: "+razaoSocial);
	}
	
}
