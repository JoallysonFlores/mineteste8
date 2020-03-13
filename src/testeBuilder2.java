import static org.junit.Assert.*;

class Test {

	
	@org.junit.jupiter.api.Test
	
	void test1() {
		Produto gasolina =  new Produto("gasolina",5.00);
		Produto diesel =  new Produto("diesel",4.50);
		Venda venda1 = new VendaBuilder()
				.Funcionario("PauloGuedes")
				.data("13/03/2020")
				.ClientePF("Bolsonaro","17")
				.Frete(100.0)
				.item(1,gasolina)
				.item(1,diesel)
				
				.Build();
		
		assertEquals("Venda [Funcionario=[nome=PauloGuedes]" 
				+ ", Data=13/03/2020"
				+ ", cliente=ClientePF [cpf=17, nome=Bolsonaro]"
				+ ", frete=Frete [valor=100.0]"
				+ ", itensVendas=[ItemVenda [quantidade=1, produto=Produto [descricao = gasolina, preco = 5.0]],"
				+ " ItemVenda [quantidade=1, produto=Produto [descricao = diesel, preco = 4.5]]]]",venda1.toString());
				
				
	}

}