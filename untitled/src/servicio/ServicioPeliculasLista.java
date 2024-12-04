package servicio;

import dominio.Pelicula;

import java.util.ArrayList;
import java.util.List;

public class ServicioPeliculasLista implements IServicioPeliculas{

    private final List<Pelicula> peliculas;

    public ServicioPeliculasLista(){
        this.peliculas = new ArrayList<>();
    }

    @Override
    public void listarPeliculas() {
        System.out.println("Listado de películas: ");
        peliculas.forEach(System.out::println);
    }

    @Override
    public void agregarPeliculas(Pelicula pelicula) {
        peliculas.add(pelicula);
        System.out.println(pelicula + " fue agregada correctamente.");
    }

    @Override
    public void buscarPeliculas(Pelicula pelicula) {
        var indice = peliculas.indexOf(pelicula);
        System.out.println("Película encontrada en el indice: " + indice);
    }
}
