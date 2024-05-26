import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o número da agência");
        String numeroAgencia = scanner.next();

        System.out.println("Digite o nome do titular");
        String nomeTitular = scanner.next();

        System.out.println("Digite o saldo da conta");
        double saldoConta = scanner.nextDouble();

        // imprimindo os dados obtidos pelo usuario
        System.out.println(
                "Olá " + nomeTitular + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia
                        + ", conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque");
    }
}