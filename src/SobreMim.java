import java.util.Locale;
import java.util.Scanner;

public class SobreMim {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite seu nome");
    String nome = scanner.next();

    System.out.println("Digite seu sobrenome");
    String sobrenome = scanner.next();

    System.out.println("Seu nome é: " + nome);
    System.out.println("Seu sobrenome é: " + nome);
  }
}
