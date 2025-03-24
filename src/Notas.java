public class Notas {
  public static void main(String[] args) {

    int nota1 = 9;
    int nota2 = 5;
    int nota3 = 4;

    int notaFinal = (nota1 + nota2 + nota3) / 3;
 
    if (notaFinal <= 5) {
      System.out.println("Nota: " + notaFinal + " Reprovado");
    } else if (notaFinal == 6) {
      System.out.println("Nota: " + notaFinal + " Recuperação");
    } else if ((notaFinal > 6) && (notaFinal < 10)) {
      System.out.println("Nota: " + notaFinal + " Aprovado");
    } else {
      System.out.println("Erro");
    }

  }
}
