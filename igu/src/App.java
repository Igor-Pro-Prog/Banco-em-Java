
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String nome;
        int opcao;
        double saldo = 0;
        double deposito;
        double saque;

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.println("Bem vindo ao banco Sr(a)" + nome);
        System.out.println("Escolha uma opção disponivel no caixa: ");
        System.out.println("1 - Realizar Deposito");
        System.out.println("2 - Realizar Saque");
        System.out.println("3 - Consultar Saldo");
        System.out.println("4 - Sair da sua conta");
        opcao = sc.nextInt();

        while (opcao != 4) {
            if (opcao == 1) {
                System.out.println("Digite o valor do deposito: ");
                deposito = sc.nextDouble();
                saldo = saldo + deposito;
            } else if (opcao == 2) {
                System.out.println("Digite o valor do saque: ");
                saque = sc.nextDouble();
                saldo = saldo - saque;
            } else if (opcao == 3) {
                System.out.println("Seu saldo é: " + saldo);
            } else {
                System.out.println("Opção inválida");
            }

            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Realizar Deposito");
            System.out.println("2 - Realizar Saque");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Sair da sua conta");
            opcao = sc.nextInt();
        }

        System.out.println("Você saiu do banco");
        sc.close();
    }
}