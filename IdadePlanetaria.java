import java.text.DecimalFormat;
import java.util.Scanner;

public class IdadePlanetaria {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double idadeTerrestre = scanner.nextDouble();
    String planeta = scanner.next();

    DecimalFormat formatter = new DecimalFormat("#0.00");

    if (planeta.equals("Marte")){
      idadeCalculada = idadeTerrestre / 1.88;
      System.out.println("Idade equivalente em Marte: "+ (formatter.format(idadeCalculada)) + " anos");
    } else if (planeta.equals("Venus")){
      idadeCalculada = idadeTerrestre / 0.62;
      System.out.println("Idade equivalente em Venus: " + (formatter.format(idadeCalculada)) + " anos");
    } else if (planeta.equals("Jupiter")){
      idadeCalculada = idadeTerrestre / 11.86;
      System.out.println("Idade equivalente em Jupiter: " + (formatter.format(idadeCalculada)) + " anos");
    } else {
      System.out.println("Planeta invalido.");
    }
    scanner.close();
  }
}
