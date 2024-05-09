public class Main {

    public static void main(String[] args) {
        Banco bancoInicial = new Banco();

        bancoInicial.setNome("Primeiro Banco");

        Cliente naruto = new Cliente("Naruto", bancoInicial);
        naruto.setNome("Naruto Uzumaki");

        Conta ccorrente = new ContaCorrente(naruto);

        ccorrente.depositar(100);

        Cliente sasuke = new Cliente("Sasuke", bancoInicial);
        Conta cpoupanca = new ContaPoupanca(sasuke);

        ccorrente.imprimirExtrato();
        cpoupanca.imprimirExtrato();

        ccorrente.transferir(48, cpoupanca);

        ccorrente.imprimirExtrato();
        cpoupanca.imprimirExtrato();
        bancoInicial.mostrarClientes();

        Cliente neji = new Cliente("Neji", bancoInicial);
        Conta ccorrente2 = new ContaCorrente(neji);
        ccorrente2.imprimirExtrato();
        bancoInicial.mostrarClientes();
    }

}