
public class ItemVenda {

	private int quantidade;
	private Produto produto;
	
	public Produto getProduto() {
		return produto;
	}



	public void setProduto(Produto produto) {
		this.produto = produto;
	}



	public ItemVenda (int quant,Produto string) {
		this.quantidade = quant;
		this.produto = string;
		
	}
	


	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public	ItemVenda(int quan) {
		this.quantidade = quan;
	}



	@Override
	public String toString() {
		return "ItemVenda [quantidade=" + quantidade + ", produto=" + produto + "]";
	}
	

	
	

}
