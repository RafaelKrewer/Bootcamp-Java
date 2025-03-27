package Exercicios;

public class TV {
  boolean ligada = false;  
  int canal = 1;
  int volume = 15;

  public void ligar() {
    ligada = true;
  }

  public void desligar() {
    ligada = false;
  }

  public void mudarCanal(int novoCanal) {
    canal = novoCanal;
  }

  public void aumentarCanal() {
   canal++; 
   System.out.println("Canal+ " + canal);
  }

  public void diminuirCanal() {
    canal--; 
    System.out.println("Canal- " + canal);
   }

   public void aumentarVolume() {
    volume++;
    System.out.println("Volume+ " + volume);
   }

   public void diminuirVolume() {
    volume--;
    System.out.println("Volume- " + volume);
   }
}

