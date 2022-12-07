package lista03;

public class TestePacote {

	public static void main(String[] args) {
		Pacote[] entregas = new Pacote[4];
		
		Endereco remetente = new Endereco("Mercado Livre",
										  "Rua São Bento, 2143",
										  "Curitiba",
										  "PR",
										  "81630-230");
		Endereco destinatario = new Endereco("Ana Oliveira",
											 "Av. Mario Clapier Urbinati, 724",
											 "Maringá",
											 "PR",
											 "87020-260");
										  
				
		
		PacoteEntregaNormal p0 = new PacoteEntregaNormal(remetente,destinatario,0.5f,20f,5f);
		
		remetente = new Endereco("Amazon",
								 "Vila Nova",
								 "Cajamar",
								 "SP",
								 "07750-000");
		destinatario = new Endereco("Lucas Alves",
									"Rua Mandaguari, 386",
									"Maringá",
									"PR",
									"97020-230");
		
		PacoteEntregaExpressa p1 = new PacoteEntregaExpressa(remetente, destinatario, 1.2f, 20f, 7f);
		
		remetente = new Endereco("Americanas",
								 "Rua Francisco Muñoz Madrid, 625",
								 "Curitiba",
								 "PR",
								 "83070-010");
		destinatario = new Endereco("Pedro Rodrigues",
								    "Rua Américo Brasiliense, 631",
								    "Maringá",
								    "PR",
								    "87030-380");
				
		
		PacoteEntregaNormal p2 = new PacoteEntregaNormal(remetente, destinatario, 2.3f, 8f, 5f);
		
		remetente = new Endereco("Shopee",
				 				 "Av. Gupe, 9791",
				 				 "Barueri",
				 				 "SP",
				 				 "06422-120");

		destinatario = new Endereco("Camila Ferreira",
				    				"Rua Quintino Bocaiúva, 1270",
				    				"Maringá",
				    				"PR",
				    			    "87020-160");
		
		PacoteEntregaExpressa p3 = new PacoteEntregaExpressa(remetente, destinatario, 0.3f, 7f, 3f);
		
		// inicializando o vetor do tipo Pacote
		entregas[0] = p0;
		entregas[1] = p1;
		entregas[2] = p2;
		entregas[3] = p3;
		
		// percorrendo o vetor de pacotes para 
		// imprimir os endereços de origem e destino 
		// e calcular os custos polimorficamente
		for (Pacote p : entregas) {
			
			System.out.println(); //pula linha
			
			//imprime os endereços
			System.out.println("Destinatário");
			Endereco d = p.getDestinatario();
			System.out.println(d);
			
			Endereco r = p.getRemetente();
			System.out.println("Remetente");
			System.out.println(r);
			
			//calcula e imprime o custo
			System.out.println(">>>>>> Custo do frete: R$ "+  String.format("%.2f", p.calcularCusto()));
			System.out.println();
			
			for(int i=0; i<50; i++)
				System.out.print("*"); //imprime linha de asteriscos
			System.out.println(); //pula linha
			
		}
		
		
	}
	
}
