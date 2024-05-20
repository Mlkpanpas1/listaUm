public class Empresa {
	private String nome;
	private String cnpj;
	
	public Empresa(String novoNome, String novoCnpj) {
		this.nome = novoNome;
		this.cnpj = novoCnpj;
	}
	
	public String getNome() {
		return nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	public void setCpnc(String novoCnpj) {
		this.cnpj = novoCnpj;
	}
}
