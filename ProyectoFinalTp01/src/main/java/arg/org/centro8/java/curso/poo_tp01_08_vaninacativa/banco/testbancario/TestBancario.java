package arg.org.centro8.java.curso.poo_tp01_08_vaninacativa.banco.testbancario;

import java.time.LocalDate;

import arg.org.centro8.java.curso.poo_tp01_08_vaninacativa.banco.cliente.ClienteEmpresa;
import arg.org.centro8.java.curso.poo_tp01_08_vaninacativa.banco.cliente.ClienteIndividual;
import arg.org.centro8.java.curso.poo_tp01_08_vaninacativa.banco.cuenta.CajaDeAhorro;
import arg.org.centro8.java.curso.poo_tp01_08_vaninacativa.banco.cuenta.Cheque;
import arg.org.centro8.java.curso.poo_tp01_08_vaninacativa.banco.cuenta.CuentaConvertibilidad;
import arg.org.centro8.java.curso.poo_tp01_08_vaninacativa.banco.cuenta.CuentaCorriente;

public class TestBancario {
    public static void main(String[] args) {
        System.out.println("***** Test Bancario ****");
        System.out.println("***************************************");
        System.out.println("*******Test  de Clientes ******");
        System.out.println("*******************************************");
        System.out.println("**** Cliente Individual *****");
        ClienteIndividual clienteIndividual1 = new ClienteIndividual(1, "Chester", "Benniton", "2899400");
        System.out.println(clienteIndividual1);
        System.out.println();
        System.out.println("*************************************");
        ClienteIndividual clienteIndividual2 = new ClienteIndividual(2, "Kurt", "Kobain", "2054885");
        System.out.println(clienteIndividual2);
        System.out.println();
        System.out.println("*******************************************************");
        System.out.println("Test Clientes Empresa");
        ClienteEmpresa clienteEmpresa1 = new ClienteEmpresa(3, "Linkin Park", "20039849");
        System.out.println(clienteEmpresa1);
        System.out.println();
        System.out.println("*************************************");
        ClienteEmpresa clienteEmpresa2 = new ClienteEmpresa(4, "Nirvana", "208488430");
        System.out.println(clienteEmpresa2);
        System.out.println();
        System.out.println("**********************************");
        System.out.println("***Test Cuenta***");
        CajaDeAhorro cajaDeAhorro1 = new CajaDeAhorro(1, clienteIndividual1, 15);
        System.out.println(cajaDeAhorro1);
        System.out.println();
        System.out.println("deposito en Caja de Ahorro");
        cajaDeAhorro1.depositarEfectivo(100000);
        System.out.println();
        System.out.println("el saldo con el deposito es" + cajaDeAhorro1.getSaldo());
        System.out.println();
        System.out.println("extraccion en caja de ahorro");
        cajaDeAhorro1.extraerEfectivo(10000);
        System.out.println();
        System.out.println(" el  saldo con la extraccion es " + cajaDeAhorro1.getSaldo());
        System.out.println(" cobrar interes en caja de ahorro");
        cajaDeAhorro1.cobrarInteres();
        System.out.println();
        System.out.println("*********************");
        System.out.println();
        System.out.println("Test Cuenta Corrriente");
        System.out.println();
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente(8, clienteEmpresa2, 50000);
        System.out.println();
        System.out.println(cuentaCorriente1);
        System.out.println();
        System.out.println("deposito en Cuenta Corriente");
        cuentaCorriente1.depositarEfectivo(100000);
        System.out.println();
        System.out.println("su saldo con el deposito es" + cuentaCorriente1.getSaldo());
        System.out.println("extraccion en Cuenta Corriente");
        cuentaCorriente1.extraerEfectivo(50000);
        System.out.println("su saldo con el la extraccion es" + cuentaCorriente1.getSaldo());
        System.out.println("***********************************");
        System.out.println("Deposito de cheque en Cuenta Corriente");
        Cheque cheque1 = new Cheque(100000, "Banco Galicia", LocalDate.of(2026, 10, 06));
        System.out.println();
        cuentaCorriente1.depositarCheque(cheque1);
        System.out.println();
        System.out.println("*********************************");
        System.out.println("Test Cuenta Convertibilidad");
        System.out.println("**************************************");
        CuentaConvertibilidad cuentaConvertibilidad1 = new CuentaConvertibilidad(1, clienteEmpresa1, 50000);
        System.out.println();
        System.out.println(cuentaConvertibilidad1);
        System.out.println();
        System.out.println("deposito en Cuenta Convertibilidad");
        cuentaConvertibilidad1.depositarEfectivo(50000);
        System.out.println();
        System.out.println("deposito en dolares en Cuenta  Convertibilidad");
        cuentaConvertibilidad1.depositarDolares(10000);
        System.out.println();
        System.out.println("su  saldo con el deposito en dolares es de" + cuentaConvertibilidad1.getSaldoDolares());
        System.out.println("**************************************************");
        System.out.println("extraccion de dolares en Cuenta Convertibilidad");
        System.out.println();
        cuentaConvertibilidad1.extraerDolares(1000);
        System.out.println("su saldo con la extraccion es de dolares es de" + cuentaConvertibilidad1.getSaldoDolares());
        System.out.println("Conversion de dolares a pesos en cuenta convertibilidad");
        cuentaConvertibilidad1.convertirDolaresApesos(100, 1460);

        cuentaConvertibilidad1.convertirPesosAdolares(1000, 1450);

    }
}
