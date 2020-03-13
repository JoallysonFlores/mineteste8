
public class ClientePF extends Cliente {
	private String cpf;
	private String nome;
	//*************************************************
	
	public ClientePF(String nome ,String cpf) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "ClientePF [cpf=" + cpf + ", nome=" + nome + "]";
	}
	
	

}
