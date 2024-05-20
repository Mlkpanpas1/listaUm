public class Livro {
	private String titulo;
	private String autor;
	private String editora;
	private int anoPublicacao;
	
	public Livro(String novoTitulo, String novoAutor, String novaEditora, int novoAnoPublicacao) {
		this.titulo = novoTitulo;
		this.autor = novoAutor;
		this.editora = novaEditora;
		this.anoPublicacao = novoAnoPublicacao;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	public String getEditora() {
		return editora;
	}
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	
	public void setTitulo(String novoTitulo) {
		this.titulo = novoTitulo;
	}
	public void setAutor(String novoAutor) {
		this.autor = novoAutor;
	}
	public void setEditora(String novaEditora) {
		this.editora = novaEditora;
	}
	public void setAnoPublicacao(int novoAnoPublicacao) {
		this.anoPublicacao = novoAnoPublicacao;
	}
}
