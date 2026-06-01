package es.iesquevedo.dao;

import es.iesquevedo.modelo.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteRepositoryInterface {
    void cargarDatos();

    void guardarDatos();

    List<Cliente> obtenerTodos();

    Optional<Cliente> buscarPorCodigo(String codigo);

    boolean insertar(Cliente nuevoCliente);

    boolean eliminarPorCodigo(String codigo);
}
