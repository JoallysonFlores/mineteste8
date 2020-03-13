public class Frete {
	public Frete(double valor) {
		super();
		this.valor = valor;
	}

	private double valor;

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Frete [valor=" + valor + "]";
	}
	
}
