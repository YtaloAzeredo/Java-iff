package estudoCasoP2;

import javax.swing.JOptionPane;

public class Hospede extends Pessoa {

	//atributos
	private String cpf;
	private float numeroDiarias;
	
	//metodos
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNumeroDiarias() {
		return numeroDiarias;
	}
	public void setNumeroDiarias(String numeroDiarias) {
		this.numeroDiarias = numeroDiarias;
	}
	
	public Hospede() {
		super();
		cpf = JOptionPane.showInputDialog("Informe o CPF do cliente:");
		numeroDiarias = Float.parseFloat(JOptionPane.showInputDialog("Informe o numero das diarias:"));
		
	}
	public void calcularDespesa() {
		
		if (numeroDiarias < 5){
			numeroDiarias = (numeroDiarias * 300) + 30;
		}
		if (numeroDiarias == 5) {
			numeroDiarias = (numeroDiarias * 300) + 20;
		}
		if (numeroDiarias > 5) {
			numeroDiarias = (numeroDiarias * 300) + 10;
		}
		JOptionPane.showMessageDialog(null, "\nCusto:"+numeroDiarias);
	}
	public void imprimirDados() {
		super.imprimirDados();
		
		JOptionPane.showMessageDialog(null, "\nDADOS HOSPEDE:"
				+ "\nCPF: "+cpf
				+ "\nNumero das Diarias: "+numeroDiarias);
		calcularDespesa();
	}
	
}
