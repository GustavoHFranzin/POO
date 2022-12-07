package lista03;

public class PacoteEntregaExpressa extends Pacote{
	
	private float taxaPorQuilo;
	
	public PacoteEntregaExpressa(Endereco remetente, Endereco destinatario, float peso, float custoPorQuilo,
			float taxaPorQuilo) {
		super(remetente, destinatario, peso, custoPorQuilo);
		this.taxaPorQuilo = taxaPorQuilo;
	}

	public float calcularCusto() {
		float custo;
		custo = peso * (custoPorQuilo+taxaPorQuilo);
		return custo;
	}

}
