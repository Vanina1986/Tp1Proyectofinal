package arg.org.centro8.java.curso.poo_tp01_08_vaninacativa.banco.cuenta;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Cheque {
    private double monto;
    private String bancoEmisor;
    private LocalDate fechaDePago;
}
