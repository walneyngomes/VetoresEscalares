
public class CalculadoraVetor {
	
	public void somarVetor(Vetor vetor1, Vetor vetor2) {
		double soma = vetor1.getTamanho() + vetor2.getTamanho();
		Vetor vetor = vetorResultado(soma, vetor1.getNome(), vetor2.getNome());
		double valor = vetor.getTamanho();
		String nome = vetor.getNome();
		System.out.print(valor + "" + nome);
	}

	public Vetor vetorResultado(double valor, String vetor1, String vetor2) {
		return new FactoryVetor().gerarVetor(valor, "Escalar", vetor1 + vetor2);
	}

}
