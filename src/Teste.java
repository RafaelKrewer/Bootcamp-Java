public class Teste {
  public static void main(String[] args) {

  int numero10 = 10;
  int numero32 = 32;

  int resultado = numero10 * (numero32 + numero10);

  System.out.println(resultado);

    String primeiroNome = "Rafael";
    String segundoNome = "Krewer";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

    System.out.println(nomeCompleto);
  }

  public static String nomeCompleto(String primeiroNome, String segundoNome) {
    return primeiroNome + (" ") + segundoNome;
  } 
}