package arg.org.centro8.java.curso.poo_tp01_08_vaninacativa.banco.cuenta;

import arg.org.centro8.java.curso.poo_tp01_08_vaninacativa.banco.cliente.ClienteEmpresa;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class CuentaConvertibilidad extends CuentaCorriente {
  private double saldoDolares;

  public CuentaConvertibilidad(int numeroCuenta, ClienteEmpresa clienteEmpresa, double montoAutorizado) {
    super(numeroCuenta, clienteEmpresa, montoAutorizado);
  }

  public void depositarDolares(double montoDolares) {
    if (montoDolares > 0)
      this.saldoDolares += montoDolares;
    else
      System.out.println(" Usted  no puede realizar depositos en negativo");
  }

  public void extraerDolares(double montoDolares) {
    if (montoDolares > 0 && montoDolares <= saldoDolares)
      this.saldoDolares -= montoDolares;
    else
      System.out.println("Usted no puede realizar  la extraccion no dispone de saldo");
  }

  public void convertirPesosAdolares(double montoPesos, double tasaConversion) {
    if (montoPesos <= 0 || tasaConversion <= 0) {
      System.out.println(" no se puede realiza la conversion");
    } else if (montoPesos <= getSaldo()) {
      double dolar = montoPesos / tasaConversion;
      setSaldo(getSaldo() - montoPesos);
      saldoDolares += dolar;
      System.out.println("Su saldo en dolares con la conversion de pesos a dolares es " + getSaldoDolares());
    } else {
      System.out.println("no dispone  de saldo en pesos para la conversion");
    }

  }

  public void convertirDolaresApesos(double montoDolares, double tasaConversion) {
    if (montoDolares <= 0 || tasaConversion <= 0)
      System.out.println(" no se puede realiza la conversion");
    else if (montoDolares <= getSaldoDolares()) {
      setSaldoDolares(getSaldoDolares() - montoDolares);
      double peso = montoDolares * tasaConversion;
      setSaldo(getSaldo() + peso);
      System.out.println("su saldo en pesos con la conversion de dolares a pesos es " + getSaldo());
    } else {
      System.out.println("no dispone saldo dolares para la conversion");
    }
  }

}
