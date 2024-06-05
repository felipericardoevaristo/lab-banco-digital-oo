import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		List<Conta> contas = new ArrayList<>();
        contas.add(cc);
        contas.add(poupanca);

		Banco banco = new Banco();
        banco.setNome("Banco DIO");
        banco.setContas(contas);

		//exibe todos os clientes do banco
		List<Cliente> clientes = banco.getAllClientes();
        clientes.forEach(cliente -> System.out.println(cliente.getNome()));
	}

}
