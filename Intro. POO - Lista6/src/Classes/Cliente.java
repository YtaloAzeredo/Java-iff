package Classes;

import javax.swing.JOptionPane;

public abstract class Cliente {
	//atributos
	protected String nome;
	
	protected Endereco atRefEndereco;
	protected Telefone atRefTelefone;
	protected Produto atRefProduto;
	protected Pedido atRefPedido;
	protected Fatura atRefFatura;
	
	//metodos
	public Fatura getAtRefFatura() {
		return atRefFatura;
	}

	public void setAtRefFatura(Fatura atRefFatura) {
		this.atRefFatura = atRefFatura;
	}

	public Endereco getAtRefEndereco() {
		return atRefEndereco;
	}

	public void setAtRefEndereco(Endereco atRefEndereco) {
		this.atRefEndereco = atRefEndereco;
	}

	public Telefone getAtRefTelefone() {
		return atRefTelefone;
	}

	public void setAtRefTelefone(Telefone atRefTelefone) {
		this.atRefTelefone = atRefTelefone;
	}

	public Produto getAtRefProduto() {
		return atRefProduto;
	}

	public void setAtRefProduto(Produto atRefProduto) {
		this.atRefProduto = atRefProduto;
	}

	public Pedido getAtRefPedido() {
		return atRefPedido;
	}

	public void setAtRefPedido(Pedido atRefPedido) {
		this.atRefPedido = atRefPedido;
	}

	public void setNome(String name) 
	{	nome = name ;	}
	
	public String getNome() 
	{	return nome; 	}
	
	
	public Cliente()
	{
		nome = JOptionPane.showInputDialog("Informe o nome: ");
		
		Endereco objEndereco = new Endereco();
		atRefEndereco = objEndereco;
		
		Telefone objTelefone = new Telefone();
		atRefTelefone = objTelefone;
		
		Fatura objF = new Fatura();
		atRefFatura = objF;
	
	}
	
	public void fazerPedido()
	{
		Pedido objPedido = new Pedido();
		atRefPedido = objPedido;
		
		Produto objProduto = new Produto();
		atRefProduto = objProduto;
	}
	
	public void imprimirFatura(){
		JOptionPane.showMessageDialog(
					null, "---FATURA---"
					+"\nNome: "+nome
					+"\nNumero do pedido: "+atRefPedido.getNumeroPedido()
					+"\nQuantidade: "+atRefPedido.getQuantidade()
					+"\nData do pedido"+atRefPedido.getData()
					+"\nCodigo do produto: "+atRefProduto.getCodigo()
					+"\nNome do produto: "+atRefProduto.getNome()
					+"\nQuantidade do produto: "+atRefProduto.getQuantidade()
					+"\nPreço unitario do produto: "+atRefProduto.getPrecoUnitario()
					+"\nNumero da fatura: "+atRefPedido.getAtRefFatura().getNumeroFatura()
					+"\nData de vencimento: "+atRefPedido.getAtRefFatura().getDataVencimento()
					+"\nValor total: "+atRefPedido.getAtRefFatura().getValorTotal()
					+"\nCEP: "+atRefEndereco.getCep()
					+"\nEstado: "+atRefEndereco.getEstado()
					+"\nCidade: "+atRefEndereco.getCidade()
					+"\nBairro: "+atRefEndereco.getBairro()
					+"\nRua: "+atRefEndereco.getRua()
					+"\nNúmero: "+atRefEndereco.getNumero()
					+"\nComplemento: "+atRefEndereco.getComplemento()
					+"\nTelefone: "+atRefTelefone.getDDD() +" "+ atRefTelefone.getDDD() + " " + atRefTelefone.getNumero()
					+"\nOperadora: "+atRefTelefone.getOperadora()
					+"\nTipo: "+atRefTelefone.getTipo()
		);
	}
}
