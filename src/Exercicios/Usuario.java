package Exercicios;

public class Usuario {
  public static void main(String[] args) {

    TV SmartTV = new TV();

    SmartTV.ligar();
    SmartTV.aumentarCanal();
    SmartTV.aumentarVolume();
    SmartTV.mudarCanal(5);

    System.out.println("A TV tá ligada? " + SmartTV.ligada);
    System.out.println("Qual canal? " + SmartTV.canal);
    System.out.println("Volume atual? " + SmartTV.volume);

  }
}
