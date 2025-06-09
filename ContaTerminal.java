import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Conta !");
        int contaNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        String agenciaNumber = scanner.nextLine();

        System.out.println("Por favor, digite o seu nome !");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta !");
        double saldo = scanner.nextDouble();
        scanner.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaNumber + ", conta " + contaNumber + " e seu saldo " + saldo + " já está disponível para saque");

    }
}