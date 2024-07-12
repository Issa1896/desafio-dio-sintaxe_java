import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Declaração de variáveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        // Criação do objeto Scanner para receber dados do terminal
        Scanner scanner = new Scanner(System.in);

        // Recebendo os dados via terminal
        System.out.println("Por favor, digite o número da Conta!");
        numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        agencia = scanner.next();

        System.out.println("Por favor, digite o seu Nome!");
        scanner.nextLine(); // Consumir a linha pendente
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial!");
        saldo = scanner.nextDouble();

        // Fechando o scanner
        scanner.close();

        // Concatenando e exibindo a mensagem final
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                          ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";

        System.out.println(mensagem);
    }
}
