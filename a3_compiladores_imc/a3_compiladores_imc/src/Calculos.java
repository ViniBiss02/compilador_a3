public class Calculos {
  Integer v1;
  Double v2;
  Double v3;

  Calculos(Integer v1, Double v2, Double v3) {
    this.v1 = v1;
    this.v2 = v2;
    this.v3 = v3;
  }

  public String imc() {
    double resultado = v2 / (v3 * v3);
    if (v1 >= 18 && v1 <= 20) {
      return classificacaoIMC(resultado);
    } else if (v1 >= 21 && v1 <= 25) {
      return classificacaoIMC(resultado);
    } else if (v1 >= 26 && v1 <= 29) {
      return classificacaoIMC(resultado);
    } else if (v1 >= 30 && v1 <= 40) {
      return classificacaoIMC(resultado);
    } else {
      return "Idade fora das faixas especificadas";
    }
  }

  public String iac() {
    double resultado = (v2 / (v3 * v3 * Math.sqrt(v3 / 2.5))) - 18;

    // Verificar a faixa etária
    if (v1 >= 18 && v1 <= 20) {
      return classificacaoIAC(resultado);
    } else if (v1 >= 21 && v1 <= 25) {
      return classificacaoIAC(resultado);
    } else if (v1 >= 26 && v1 <= 29) {
      return classificacaoIAC(resultado);
    } else if (v1 >= 30 && v1 <= 40) {
      return classificacaoIAC(resultado);
    } else {
      return "Idade fora das faixas especificadas";
    }
  }

  private String classificacaoIMC(double resultado) {
    if (resultado < 18.5) {
      return "Abaixo do peso";
    } else if (resultado < 25) {
      return "Peso normal";
    } else {
      return "Sobrepeso";
    }
  }

  private String classificacaoIAC(double resultado) {
    if (resultado < 8) {
      return "Abaixo do normal";
    } else if (resultado < 21) {
      return "Normal";
    } else {
      return "Acima do normal";
    }
  }
}
