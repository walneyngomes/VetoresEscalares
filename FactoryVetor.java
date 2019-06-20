
public class FactoryVetor {
	public Vetor gerarVetor(double tamanho, String tipo, String nome) {
		Vetor vetor = null;
		if (("escalar".equals(conversorMaiusculo(tipo)))) {
			vetor = new Escalar();
			vetor.setTamanho(tamanho);
			vetor.setNome(nome);
		}
		return vetor;
	}

	private String conversorMaiusculo(String tipo) {
		String posicao = "" + tipo.charAt(0);
		String pos = posicao.toUpperCase();
		String palavra = null;
		int tamanho = tipo.length();
		for (int i = 0; i < tipo.length(); i++) {
			palavra = palavra + tipo.charAt(i);
		}
		return palavra;

	}

}
