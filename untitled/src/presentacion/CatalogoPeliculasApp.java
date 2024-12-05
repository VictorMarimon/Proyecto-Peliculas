package presentacion;

import dominio.Pelicula;
import servicio.IServicioPeliculas;
import servicio.ServicioPeliculasArchivos;
import servicio.ServicioPeliculasLista;

import java.util.Scanner;

public class CatalogoPeliculasApp {
    public static void main(String[] args) {
        boolean salir = false;
        Scanner entrada = new Scanner(System.in);

        IServicioPeliculas servicioPelicula = new ServicioPeliculasArchivos();
        while (!salir){
            try {
                mostrarMenu();
                salir = ejecutarOpciones(entrada, servicioPelicula);
            } catch (Exception e) {
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
            System.out.println();
        }
    }

    private static void mostrarMenu(){
        System.out.print("""
                *** Catálogo de películas ***
                1. Agregar película
                2. Listar películas
                3. Buscar película
                4. Salir
                
                Elige una opción:
                """);
    }

    private static boolean ejecutarOpciones(Scanner entrada, IServicioPeliculas servicioPeliculas){
        var opcion = Integer.parseInt(entrada.nextLine());
        boolean salir = false;
        switch (opcion){
            case 1-> {
                System.out.println("Introduce el nombre de la película: ");
                String nombrePelicula = entrada.nextLine();
                servicioPeliculas.agregarPeliculas(new Pelicula(nombrePelicula));
            }
            case 2-> {
                servicioPeliculas.listarPeliculas();
            }
            case 3-> {
                System.out.println("Introduce la película a buscar: ");
                String busquedaPelicula = entrada.nextLine();
                servicioPeliculas.buscarPeliculas(new Pelicula(busquedaPelicula));
            }
            case 4-> {
                System.out.println("Programa finalizado.");
                salir = true;
            }
            default-> {
                System.out.println("Ingrese una opción correcta...");
            }
        }
        return salir;
    }
}