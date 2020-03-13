public class VendaBuilder  {
	
	private Venda venda;
	private Produto produto;
	
	public VendaBuilder(Venda venda, Produto pro) {
		this.venda = venda;
		this.setProduto(pro);
	}
	public VendaBuilder() {
		venda = new Venda();
	}
	public VendaBuilder data(String data) {
		venda.setData(data);
		return this;
	}
	public VendaBuilder ClientePF(String nome,String cpf) {
		venda.setCliente(new ClientePF(nome, cpf));
		return this;
	}
	public VendaBuilder ClientePJ(String razaoSocial,String cnpj) {
		venda.setCliente(new ClientePJ(razaoSocial,cnpj) );
		return this;
	}
	public VendaBuilder Frete(double valor) {
		venda.setFrete(new Frete(valor));
		return this;
	}
	public VendaBuilder Produto(String descricao,double preco) {
		venda.setProduto(new Produto(descricao,preco));
		return this;
	}
	public Venda Build(){
		return venda; 
	}
	public VendaBuilder Data() {
		return this;
		
	}
	public  VendaBuilder item(int quantidade, Produto produto) {
		venda.addItemVenda(new ItemVenda(quantidade, produto));
		return this ;
	}
	public VendaBuilder Funcionario(String nome) {
		venda.setFuncionario(new Funcionario(nome));
		return this;
	}
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
}
