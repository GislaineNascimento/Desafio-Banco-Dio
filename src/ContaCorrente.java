
public class ContaCorrente extends Conta{
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	public void imprimirExtrato() {
		System.out.print("===Extrato Conta Corrente===");
		super.imprimirInfosComuns();
	}
}
