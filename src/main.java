
public class main {

	
	public static void main(String[] args) {
		
		Cliente Gislaine = new Cliente();
		Gislaine.setNome("Gislaine");
		
		Conta cc = new ContaCorrente(Gislaine);
		Conta poupanca = new ContaPoupança(Gislaine);
		
		cc.depositar(100);
		cc.transferir(100,poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		

	}

}
