package estudoCasoP2;

import javax.swing.JOptionPane;

public abstract class Pessoa {
	//atributos comuns
	protected String nome;
	protected String email;

	//atributos referencia
	protected Telefone atRefTelefone;
	protected Endereco atRefEndereco;
	
	//metodos
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Telefone getAtRefTelefone() {
		return atRefTelefone;
	}
	public void setAtRefTelefone(Telefone atRefTelefone) {
		this.atRefTelefone = atRefTelefone;
	}
	public Endereco getAtRefEndereco() {
		return atRefEndereco;
	}
	public void setAtRefEndereco(Endereco atRefEndereco) {
		this.atRefEndereco = atRefEndereco;
	}
	
	public Pessoa() {
		nome = JOptionPane.showInputDialog("Informe o nome:");
		email = JOptionPane.showInputDialog("Informe o email:");
		
		Endereco objE = new Endereco();
		Telefone objT = new Telefone();
		atRefEndereco = objE;
		atRefTelefone = objT;
		
	}
	
	public void imprimirDados() {
		JOptionPane.showMessageDialog(null,"DADOS:"
				+ "\nNome: "+nome
				+ "\nE-mail: "+email
				+"\n\nENDEREÇO COMPLETO: "
				+"Rua "+atRefEndereco.getRua()
				+", "+atRefEndereco.getNumero()
				+" - "+atRefEndereco.getComplemento()
				+" - "+atRefEndereco.getBairro()
				+" - "+atRefEndereco.getCidade()
				+"/"+atRefEndereco.getEstado()
				+" - CEP: "+atRefEndereco.getCep()
				+"\n\nTELEFONE COMPLETO: "
				+"+"+atRefTelefone.getDdi()
				+" ("+atRefTelefone.getDdd()
				+") "+atRefTelefone.getNumero()
				+" - "+atRefTelefone.getTipo()
				+" - "+atRefTelefone.getOperadora()
				);
	}
	
}
