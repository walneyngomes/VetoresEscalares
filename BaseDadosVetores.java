import java.util.ArrayList;

public class BaseDadosVetores {
	FactoryVetor vetor = new FactoryVetor();

	CalculadoraVetor calculadora = new CalculadoraVetor();
	ArrayList<Vetor> vetores = new ArrayList<Vetor>();

	public void addVetor(String nome, double tamanho) {
		vetores.add(vetor.gerarVetor(tamanho, "Escalar", nome));
	}

	public void somarVetores(String nome, String nome1) {

		calculadora.somarVetor(buscador(nome), buscador(nome1));

		
	}

	private Vetor buscador(String nome) {
		Vetor resultante = null;
		for (Vetor v : vetores) {
			if (v.getNome().equals(nome)) {
				resultante = v;
			}
		}
		return resultante;

	}
}
