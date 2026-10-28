package arg.org.centro8.java.curso.poo_tp01_08_vaninacativa.banco.cuenta;

import arg.org.centro8.java.curso.poo_tp01_08_vaninacativa.banco.cliente.Cliente;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)
public class CuentaCorriente extends Cuenta {
    private double montoAutorizado;

    public CuentaCorriente(int numeroCuenta, Cliente clienteAsociado, double montoAutorizado) {
        super(numeroCuenta, clienteAsociado);
        this.montoAutorizado = montoAutorizado;
    }

    public void depositarCheque(Cheque cheque) {
        if (cheque == null) {
            System.out.println("usted no puede realizar un deposito de cheque porque es nulo");
        } else {
            this.setSaldo(this.getSaldo() + cheque.getMonto());
            System.out.println("el saldo con el cheque depositado es" + getSaldo());
        }
    }

    @Override
    public void extraerEfectivo(double monto) {
        double saldoDisponible = getSaldo() + montoAutorizado;
        if (monto > saldoDisponible) {
            System.out.println("no dispone de saldo para la extraccion");
        } else {
            this.setSaldo(getSaldo()-monto);
        }
    }
}
