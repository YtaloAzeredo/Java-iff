package P1;

public class Hospede 
{
	//atributos
	private int cpf;
	private String nome;
	private int numeroDiarias;
	private int taxa;
	public int conta;
	public int inicio;
	
	//metodos
	public void setCpf(int c)
	{ cpf=c; 	}
	public int getCpf()
	{ return cpf;	} 
	
	public void setNome(String n)
	{ nome=n; 	}
	public String getNome()
	{ return nome;	} 
	
	public void setNumeroDiarias(int nd)
	{ numeroDiarias=nd; 	}
	public int getNumeroDiarias()
	{ return numeroDiarias;	} 
	
	public void setTaxa(int t)
	{	taxa=t;}
	public int getTaxa()
	{	return taxa;}
	
	//operacoes
	public void inicializar(int in)
	{	inicio=in;}
	
	public float calcularDespesa()
	{ return (numeroDiarias*300)+taxa;	}
	
	public void imprimirConta(int ic)
	{ conta=ic;}
	
}
