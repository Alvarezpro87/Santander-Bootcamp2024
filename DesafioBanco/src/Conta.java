import lombok.Getter;

public abstract class Conta implements IConta {


    private static final int AGENCIA_PADRAO = 1; //constante para agencia padrao
    @Getter
    private static int SEQUENCIAL = 1; //variavel de controle iniciada em 1 dentro da classe pra criar nro seq de conta

    @Getter
    protected int agencia;
    @Getter
    protected int numero;
    @Getter
    protected double saldo;

    @Getter
    protected Cliente cliente;

    //metodo construtor da classe Conta
    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;

        this.cliente = cliente;
    }

    public Conta() {

    }




    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", cliente=" + cliente +
                '}';
    }


    protected void imprimirInfosComuns() {
        System.out.printf(String.format("Titular: %s%n", this.cliente.getNome()));
        System.out.printf(String.format("Agência: %d%n", this.agencia));
        System.out.printf(String.format("Número: %d%n", this.numero));
        System.out.printf(String.format("Saldo: %.2f%n", this.saldo));
    }


    @Override
    public void sacar(double valor) {
        saldo = saldo - valor;

    }

    @Override
    public void depositar(double valor) {
        saldo = saldo + valor;

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);

    }

    @Override
    public void imprimirExtrato() {

    }

}