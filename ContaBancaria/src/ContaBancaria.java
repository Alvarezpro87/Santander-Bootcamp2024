import java.util.Scanner;

public class ContaBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o numero da conta
        System.out.println("Digite o número da conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Quebra de linha

        // Solicita a agência
        System.out.println("Digite o número da Agência:");
        String agencia = scanner.nextLine();

        // Nome do Cliente
        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        // Saldp
        System.out.println("Digite o saldo inicial da conta:");
        double saldo = scanner.nextDouble();

        // Mensagem final
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
        System.out.println(mensagem);

        scanner.close();
    }
}