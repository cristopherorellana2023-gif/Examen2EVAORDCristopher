package es.iesquevedo.service;

import es.iesquevedo.modelo.Cliente;
import es.iesquevedo.dao.ClienteRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;
import java.util.Optional;
@ApplicationScoped
public class ClienteService implements ClienteServiceInterface {
    private final ClienteRepository repositorio;
@Inject
    public ClienteService(ClienteRepository repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<Cliente> obtenerTodos() {
        return repositorio.obtenerTodos();
    }

    @Override
    public Optional<Cliente> buscarPorCodigo(String codigo) {
        return repositorio.buscarPorCodigo(codigo);
    }

    @Override
    public boolean registrarCliente(Cliente cliente) {
        if (cliente.getCodigo() == null || cliente.getCodigo().isBlank()) {
            return false;
        }
        if (cliente.getNombreCompleto() == null || cliente.getNombreCompleto().isBlank()) {
            return false;
        }
        if (cliente.getEmail() == null || cliente.getEmail().isBlank()) {
            return false;
        }
        return repositorio.insertar(cliente);
    }

    @Override
    public boolean eliminarCliente(String codigo) {
        return repositorio.eliminarPorCodigo(codigo);
    }
}
