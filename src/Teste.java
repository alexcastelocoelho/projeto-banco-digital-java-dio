import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner informacao = new Scanner(System.in);
		String nome;
		
		Cliente eu = new Cliente();
		System.out.println("informe o seu nome");
		eu.setNome(nome = informacao.nextLine());
		
		Conta corrente = new ContaCorrente(eu);
		
		Conta poupanca = new ContaPoupanca(eu);
		
		System.out.println("quanto voce desejar depositar: ");
		int quantia;
		
		corrente.depositar(quantia = informacao.nextInt());
		
		System.out.println("digite o valor para tranferencia: ");
		int valor;
		corrente.tranferir(valor = informacao.nextInt(), poupanca);
		
		corrente.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
