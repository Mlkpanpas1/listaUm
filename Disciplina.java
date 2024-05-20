public class Disciplina {
	private String nome;
	private String codigo;
	
	public Disciplina(String novoNome, String novoCodigo) {
		this.nome = novoNome;
		this.codigo = novoCodigo;
	}
	
	public String getNome() {
		return nome;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	public void setCodigo(String novoCodigo) {
		this.codigo = novoCodigo;
	}
}
