package arg.org.centro8.java.curso.poo_tp01_08_vaninacativa.banco.cuenta;

import arg.org.centro8.java.curso.poo_tp01_08_vaninacativa.banco.cliente.Cliente;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RequiredArgsConstructor // Crea el los constructores declarados como finales
@Getter // se declaro getter para acceder al saldo de las clases hijas
@Setter // se declaro setter para poder modificar el saldo en las clases hijas

@ToString
public abstract class Cuenta {
    private final int numeroCuenta;
    private final Cliente clienteAsociado;
    private double saldo;

    public void depositarEfectivo(double monto) {
        if (monto > 0)
            this.saldo += monto;
        else
            System.out.println(" Usted  no puede realizar deposito en efectivo");
    }

    /**
     * @param extraerEfectivo: es un metodo abstracto no tiene cuerpo o
     *                         comportamiento
     *                         , la o las clases que hereden de Cuenta deberan
     *                         implementar los metodos
     *                         abstractos.
     */
    public abstract void extraerEfectivo(double monto);

}
