
public class produtos {
	private String nome;
	private double preco;
	private int quantidadeEstoque;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	public produtos (String nome, double preco, int quantidadeEstoque) {
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEstoque = quantidadeEstoque;
	}
	public int venderproduto() {
		if (quantidadeEstoque > 0) {
		quantidadeEstoque -= 1;
		System.out.println("Produto vendido");
		}
		else {
			System.out.println("Produto sem estoque, reponha para vender");
		}
		return quantidadeEstoque;
		
		}
	public int reporestoque() {
		quantidadeEstoque += 1;
		System.out.println("Estoque reposto");
		return quantidadeEstoque;

	}
	public void exibirInfo() {
		System.out.println(nome + "("+ preco +"R$) quantidade no estoque:"+ quantidadeEstoque);
	}

}
