import java.util.ArrayList;
import java.util.List;

public class Venda {
	
	private Funcionario funcionario;
	private String Data;
	private Cliente cliente;
	private VendaBuilder vendaBuilder;
	private Frete frete;
	private List <ItemVenda> itensVendas = new ArrayList<>();
	private Produto produto;


	public Venda(VendaBuilder vendaBuilder) {
		this.vendaBuilder = vendaBuilder;
	}
	public Venda() {
	}	

	public Frete getFrete() {
		return frete;
	}
	public Venda (String data) {
		this.Data = data;
	}

	public void setFrete(Frete frete) {
		this.frete = frete;
	}

	public List<ItemVenda> getItensVendas() {
		return itensVendas;
	}

	public void setItensVendas(List<ItemVenda> itensVendas) {
		this.itensVendas = itensVendas;
	}
	public void addItemVenda(ItemVenda produto) {
		itensVendas.add(produto);
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}


	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public String getData() {
		return Data;
	}

	public void setData(String data) {
		Data = data;
	}
	
	

	public void setVendaBuilder(VendaBuilder vendaBuilder) {
		this.vendaBuilder = vendaBuilder;
	}
	@Override
	public String toString() {
		return "Venda [Funcionario=" + funcionario + ", Data=" + Data + ", cliente=" + cliente + 
				", frete=" + frete + ", itensVendas=" + itensVendas +"]";
	}

	
	
}
