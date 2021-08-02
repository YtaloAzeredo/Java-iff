package P1;

import javax.swing.JOptionPane;

public class testeHospede {

	public static void main(String[] args) {
		//criar objeto
		Hospede objH = new Hospede();
		
		//preenchimento de atributos
		objH.inicializar(Integer.parseInt(JOptionPane.showInputDialog("Iniciar? 1=Sim, 0=Não")));
		
	if (objH.inicio==1) 
	{
			objH.setCpf(Integer.parseInt(JOptionPane.showInputDialog("Digite seu cpf:")));
			objH.setNome(JOptionPane.showInputDialog("Digite seu nome"));
			objH.setNumeroDiarias(Integer.parseInt(JOptionPane.showInputDialog("Digite as diarias")));
		
		
		//chamadas de operações e resultados
	
	objH.imprimirConta(Integer.parseInt(JOptionPane.showInputDialog("Imprimir conta? 1=Sim 0=Não")));
	if (objH.conta==1) 
		{
		if (objH.getNumeroDiarias()<5) {
			objH.setTaxa(30);
		}
		else if (objH.getNumeroDiarias()==5) {
			objH.setTaxa(20);
		}
		else if (objH.getNumeroDiarias()>5) {
			objH.setTaxa(10);
		}
		else {}
		
		JOptionPane.showMessageDialog(null, objH.getCpf()+objH.getNome()+objH.getNumeroDiarias()+"Despesa total de:"+objH.calcularDespesa());
		}
	}
	else {}
		
	}

}
