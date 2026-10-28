package arg.org.centro8.java.curso.poo_tp01_08_vaninacativa.banco.cliente;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/*
 * Getter se agrego el getter para ser utilizado; getter es metodo
 * que permite acceder a los atributos.
 * ToString se agregro el ToString;ToString metodo heredado de Clase
 * Objet es la clase padre de todas la clase.Su funcion es
 * representar al objeto
 * en forma de cadena de caracteres.
 */
@Getter
@ToString
@RequiredArgsConstructor // crea el constructor con atributos finales

/**
 * class: es una plantilla o molde que define los atributos
 * y metodos que tendran los objetos.
 * abstract cuando una clase es abstracta no se pueden crear un objeto
 * se utiliza abstract para favorecer la herencia.
 */

/**
 * private nivel acceso restringido.Accesible solo para la
 * clase que lo esta definiendo.Utilizado para declarar
 * miembros solo deben ser utilizadospor la clase.
 */
public abstract class Cliente {
  // declaracion de atributo(variable que indican caracteristica)
  private final int numeroCliente;
  // final queda constante.No se va poder modificar su valor.
}
