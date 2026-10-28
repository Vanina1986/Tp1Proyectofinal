package arg.org.centro8.java.curso.poo_tp01_08_vaninacativa.banco.cliente;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true) // llama al ToString de la clase padre
public class ClienteEmpresa extends Cliente {
    private String nombreDeFantasia;
    private String cuit;

    public ClienteEmpresa(int numeroCliente, String nombreDeFantasia, String cuit) {
        super(numeroCliente);
        this.nombreDeFantasia = nombreDeFantasia;
        this.cuit = cuit;
    }

}
