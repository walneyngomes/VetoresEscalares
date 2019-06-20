
public class FachadaVetores {
	BaseDadosVetores vetor = null;

	public FachadaVetores() {
		this.vetor = new BaseDadosVetores();
	}

	public void addVetor(double tamanho, String nome) {
		vetor.addVetor(nome, tamanho);

	}

	public void somarVetor(String nome, String nome1) {
		vetor.somarVetores(nome, nome1);
	}

}
