package lista03;

public class PacoteEntregaNormal extends Pacote{
	
	private float taxaFixa;

	public PacoteEntregaNormal(Endereco remetente, Endereco destinatario, float peso, float custoPorQuilo, float taxaFixa) {
		super(remetente, destinatario, peso, custoPorQuilo);
		this.taxaFixa = taxaFixa;
	}
	
	public float calcularCusto() {
		float custo;
		custo = super.calcularCusto() + taxaFixa;
		return custo;
	}
	
}
