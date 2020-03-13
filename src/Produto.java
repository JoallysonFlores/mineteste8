
public class Produto {
	private String descricao;
	private double precao;
//**********************************************
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	//**********************************************
	public double getPrecao() {
		return precao;
	}
	public void setPrecao(double precao) {
		this.precao = precao;
	}
	//**********************************************
	public Produto(String descricao, double precao) {
		this.descricao = descricao;
		this.precao = precao;
	}
	public String toString() {
		return "Produto [descricao = " + descricao + ", preco = " + precao + "]";
	}
}

