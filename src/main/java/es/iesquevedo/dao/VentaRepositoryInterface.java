package es.iesquevedo.dao;

import es.iesquevedo.modelo.Venta;

import java.util.List;
import java.util.Optional;

public interface VentaRepositoryInterface {
    void cargarDatos();

    void guardarDatos();

    List<Venta> obtenerTodas();

    Optional<Venta> buscarPorNumero(String numeroVenta);

    boolean insertar(Venta nuevaVenta);

    boolean eliminarPorNumero(String numeroVenta);
}
