import java.util.Scanner;
public class loja {
	public static void main(String[] args) {
	 Scanner teclado = new Scanner (System.in);
	 produtos p1;
	 p1 = new produtos ("Produto de limpeza",45.5,4);
	 int opcao;
	 do {
	System.out.println("1- exbir informaçoes do produto");	
	System.out.println("2- vender produto");
	System.out.println("3- repor estoque");
	System.out.println("4- sair;");
	
	
	System.out.println("selecione uma opcoa (1 a 4)");
	opcao = teclado.nextInt();
	switch (opcao) {
	case 1: 
		p1.exibirInfo();
		break;
	case 2:
		p1.venderproduto();
		break;
	case 3:
		p1.reporestoque();
		break;
	case 4: 
		System.out.println("obrigado por utilizar nososo site");
		break;
		default: System.out.println("opcao invalida");
	}
	} while (opcao != 4);
		
		
		
		
		
		
		teclado.close();
	}
	}


