package es.iesquevedo.service;

import es.iesquevedo.modelo.Videojuego;
import es.iesquevedo.dao.VideojuegoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;
import java.util.Optional;
@ApplicationScoped
public class VideojuegoService implements VideojuegoServiceInterface {
    private final VideojuegoRepository repositorio;
    @Inject
    public VideojuegoService(VideojuegoRepository repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<Videojuego> obtenerTodos() {
        return repositorio.obtenerTodos();
    }

    @Override
    public Optional<Videojuego> buscarPorCodigo(String codigo) {
        return repositorio.buscarPorCodigo(codigo);
    }

    @Override
    public boolean agregarVideojuego(Videojuego videojuego) {
        if (videojuego.getCodigo() == null || videojuego.getCodigo().isBlank()) {
            return false;
        }
        if (videojuego.getTitulo() == null || videojuego.getTitulo().isBlank()) {
            return false;
        }
        if (videojuego.getPrecioUnitario() <= 0) {
            return false;
        }
        return repositorio.insertar(videojuego);
    }

    @Override
    public boolean eliminarVideojuego(String codigo) {
        return repositorio.eliminarPorCodigo(codigo);
    }

    @Override
    public void actualizarVideojuego(Videojuego videojuego) {
        repositorio.modificar(videojuego);
    }
}
