package es.iesquevedo;

import es.iesquevedo.dao.ClienteRepository;
import es.iesquevedo.dao.VentaRepository;
import es.iesquevedo.dao.VideojuegoRepository;
import es.iesquevedo.service.ClienteService;
import es.iesquevedo.service.VentaService;
import es.iesquevedo.service.VideojuegoService;
import es.iesquevedo.ui.ControladorConsola;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import java.awt.*;
import java.util.Scanner;

public class Main {

    /*private static final Scanner entrada = new Scanner(System.in);
    //objetos del dao
    public static ClienteRepository cr = new ClienteRepository();
    public static  VideojuegoRepository vr = new VideojuegoRepository();
    public static VentaRepository ventarepository = new VentaRepository();

    //objetos del service
    public static  ClienteService cs = new ClienteService(cr);
    public static  VideojuegoService vds = new VideojuegoService(vr);
    public static  VentaService vs = new VentaService(ventarepository, vr,cr);

    //Obajeto controller del paquete ui
    private static final ControladorConsola controlador = new ControladorConsola(entrada,vds,cs,vs);

        Inyeccion de dependencias manual comentados para utilizar la libreria Weld
*/



    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        WeldContainer container = new Weld().initialize();
        ControladorConsola controlador = container.select(ControladorConsola.class).get();


        boolean ejecutando = true;
        while (ejecutando) {
            System.out.println("\n=== Tienda de Videojuegos ===");
            System.out.println("1) Gestión de Videojuegos");
            System.out.println("2) Gestión de Clientes");
            System.out.println("3) Gestión de Ventas");
            System.out.println("0) Salir");
            System.out.print("Seleccione opción: ");
            String opcion = entrada.nextLine().trim();
            switch (opcion) {
                case "1" -> controlador.menuVideojuegos();
                case "2" -> controlador.menuClientes();
                case "3" -> controlador.menuVentas();
                case "0" -> ejecutando = false;
                default -> System.out.println("Opción no válida");
            }
        }
        System.out.println("Hasta pronto!");
    }
}



