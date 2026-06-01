package es.iesquevedo.dao;

import es.iesquevedo.modelo.Videojuego;

import java.util.List;
import java.util.Optional;

public interface VideojuegoRepositoryInterface {
    void cargarDatos();

    void guardarDatos();

    List<Videojuego> obtenerTodos();

    Optional<Videojuego> buscarPorCodigo(String codigo);

    boolean insertar(Videojuego nuevoVideojuego);

    boolean eliminarPorCodigo(String codigo);

    void modificar(Videojuego videojuegoModificado);
}
