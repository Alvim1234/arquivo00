
public class ClassePessoas {
	String nomeAt;
	String documentoAt;
	float rendaAt;
	
	public ClassePessoas() {
		
	}
	
	public ClassePessoas(String nomePar, String documentoPar, float rendaPar) {
		this.nomeAt = nomePar;		
		this.documentoAt = documentoPar;
		this.rendaAt = rendaPar;
	}
	public void alterarNome(String nomePar) {
		this.nomeAt = nomePar;
		
	}
	public void alterarDocumento(String documentoPar) {
		this.documentoAt = documentoPar;
	}
	public void alterarRenda(float rendaPar) {
		this.rendaAt = rendaPar;
}
}