package lista03;

public abstract class Pacote {
	protected Endereco remetente, destinatario;
	protected float peso; // em quilos
	protected float custoPorQuilo;
	
	public Pacote(Endereco remetente, Endereco destinatario, float peso, float custoPorQuilo) {
		super();
		this.remetente = remetente;
		this.destinatario = destinatario;
		
		//peso e custoPorQuilo devem ter valores positivos
		if(peso > 0)
			this.peso = peso;
		else
			this.peso = 0;
		if(custoPorQuilo > 0)
			this.custoPorQuilo = custoPorQuilo;
		else
			this.custoPorQuilo = 0;
	} 
	
	public float calcularCusto() {
		float custo;
		custo = peso * custoPorQuilo;
		return custo;
	}
	
	public Endereco getRemetente() {
		return remetente;
	}
	
	public Endereco getDestinatario() {
		return destinatario;
	}
	
	
	
}
