import java_cup.runtime.*;
import java.io.InputStreamReader;

public class Driver {
  static public void main(String argv[]) {
    try {
      System.out.println("BEM VINDO AO SEU CALCULO DE MASSA:\n");
      System.out.println("Para calcular o IMC insira: IMC=idade,peso,altura;");
      System.out.println("Para calcular o IAC insira: IAC=idade,circunferencia,altura; \n");

      System.out.println("Exemplo IMC: IMC=18,55.0,1.66;");
      System.out.println("Exemplo IAC: IAC=18,60.0,1.66; \n");

      InputStreamReader entrada = new InputStreamReader(System.in);
      Parser p = new Parser(new Lexer(entrada));

      Object result = p.parse().value;
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}