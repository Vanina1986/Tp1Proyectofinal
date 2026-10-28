package arg.org.centro8.java.curso.poo_tp01_08_vaninacativa.banco.cuenta;

import arg.org.centro8.java.curso.poo_tp01_08_vaninacativa.banco.cliente.Cliente;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)

public class CajaDeAhorro extends Cuenta {

    private float tasaDeInteres;

    /*
     * CajaDeAhorro modificacion no se pide el saldo en el constructor
     */
    public CajaDeAhorro(int numeroCuenta, Cliente clienteAsociado, float tasaDeInteres) {
        super(numeroCuenta, clienteAsociado);
        this.tasaDeInteres = tasaDeInteres;
    }

    public void cobrarInteres() {
        final double interesGanado = (getSaldo() / 100 * getTasaDeInteres());
        this.setSaldo(this.getSaldo() + interesGanado);
        System.out.println("su saldo con el interes cobrado es " + getSaldo());
    }

    @Override
    public void extraerEfectivo(double monto) {
        if (monto > 0 && monto <= getSaldo())
            this.setSaldo(getSaldo() - monto);
        else
            System.out.println("No dispone de saldo para realizar la extraccion");

    }

}
