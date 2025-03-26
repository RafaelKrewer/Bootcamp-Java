package Exercicios;

public class IMC {
  public static void main(String[] args) {
    int peso = 60;
    double altura = 1.70;
    double calculoIMC = peso / (altura * altura);

    System.out.println("Seu índice IMC é de " + Math.round(calculoIMC));

    if (calculoIMC < 0) {
      System.out.println("Número Inválido");
    } else if (calculoIMC < 18.5 && calculoIMC > 0) {
      System.out.println("Você está abaixo do peso");
    } else if (calculoIMC >= 18.5 && calculoIMC < 24.9) {
      System.out.println("Você está com peso normal");
    } else if (calculoIMC >= 25.0 && calculoIMC < 29.9) {
      System.out.println("Você está com sobrepeso");
    } else if (calculoIMC >= 30.0 && calculoIMC < 39.9) {
      System.out.println("Você está com obesidade");
    } else if (calculoIMC >= 39.9 && calculoIMC <= 185) {
      System.out.println("Você está com obesidade mórbida");
    } else {
      System.out.println("Morreu");
    }

  }
}
