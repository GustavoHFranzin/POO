package lista03;

public class Endereco {
	private String nome;
	private String logradouro;
	private String cidade;
	private String estado;
	private String cep;
	
	public Endereco(String nome, String logradouro, String cidade, String estado, String cep) {
		this.nome = nome;
		this.logradouro = logradouro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}

	@Override
	public String toString() {
		
		return "Nome: " + nome +  
			   "\n"+ logradouro + "\t " + cidade + "-" + estado +  
			   "\nCEP: " + cep + "\n";
	}
	
}
