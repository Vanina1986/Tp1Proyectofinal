package arg.org.centro8.java.curso.poo_tp01_08_vaninacativa.banco.cliente;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter // permite modificar a los atributos
@Getter // permite acceder a los atributos
@ToString(callSuper = true)

public class ClienteIndividual extends Cliente {
    // extends plabra reservada indica que la clase extiende
    // o hereda de otra clase.
    private String nombre;
    private String apellido;
    private String dni;

    /*
     * Constructor permite crear objeto de la clase, tiene mismo nombre de la
     * clase.super()trae el atributo de la clase padre en este caso es numero
     * cliente
     */
    public ClienteIndividual(int numeroCliente, String nombre, String apellido, String dni) {
        super(numeroCliente);
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

}
