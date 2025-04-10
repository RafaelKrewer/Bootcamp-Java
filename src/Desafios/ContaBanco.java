package Desafios;
import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite seu nome");
    String nome = scan.next();

    System.out.println("Digite sua agência");
    String agencia = scan.next();

    System.out.println("Digite sua conta");
    int numeroConta = scan.nextInt();

    System.out.println("Digite seu saldo");
    double saldo = scan.nextDouble();

    System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo (" + saldo + ") já está disponível para saque");
  }
}
