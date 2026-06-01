package es.iesquevedo.service;

import es.iesquevedo.modelo.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteServiceInterface {
    List<Cliente> obtenerTodos();

    Optional<Cliente> buscarPorCodigo(String codigo);

    boolean registrarCliente(Cliente cliente);

    boolean eliminarCliente(String codigo);
}
