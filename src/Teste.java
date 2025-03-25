public class Teste {
  public static void main(String[] args) {
    int valor1, valor2;

    valor1 = 1;
    valor2 = 2;

    String valor = "";

    boolean simNão = valor1 == valor2;
    if (simNão == true) {
      valor = "Sim";
    } else {
      valor = "Não";
    }

    System.out.println("Número Um é igual ao número Dois? " + valor);

  }
}
