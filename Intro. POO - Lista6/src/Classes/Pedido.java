package Classes;

import javax.swing.JOptionPane;

public class Pedido {
	
	//atributos
	private String numeroPedido;
	private String quantidade;
	private String data;
	protected Cliente atRefCliente;
	protected Produto atRefProduto;
	protected Fatura atRefFatura;
	
	
	//metodos
	public Cliente getAtRefCliente() {
		return atRefCliente;
	}

	public void setAtRefCliente(Cliente atRefCliente) {
		this.atRefCliente = atRefCliente;
	}

	public Produto getAtRefProduto() {
		return atRefProduto;
	}

	public void setAtRefProduto(Produto atRefProduto) {
		this.atRefProduto = atRefProduto;
	}

	public Fatura getAtRefFatura() {
		return atRefFatura;
	}

	public void setAtRefFatura(Fatura atRefFatura) {
		this.atRefFatura = atRefFatura;
	}

	
	public String getNumeroPedido() {
		return numeroPedido;
	}
	
	public void setNumeroPedido(String numPedido) {
		numeroPedido = numPedido;
	}
	
	public String getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(String quant) {
		quantidade = quant;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String date) {
		this.data = date;
	}
	
	public Pedido()
	{
		numeroPedido = JOptionPane.showInputDialog("Informe o número do pedido: ");
		quantidade = JOptionPane.showInputDialog("Informe a quantidade do pedido:");
		data = JOptionPane.showInputDialog("Informe a data do pedido: ");	
	}
	
	public void gerarFatura()
	{
		System.out.println("foi"+atRefFatura);
		Fatura objF = new Fatura();
		atRefFatura = objF;
	}
}
