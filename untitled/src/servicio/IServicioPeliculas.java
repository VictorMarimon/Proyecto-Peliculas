package servicio;

import dominio.Pelicula;

public interface IServicioPeliculas {
    public void listarPeliculas();

    public void agregarPeliculas(Pelicula pelicula);

    public void buscarPeliculas(Pelicula pelicula);
}
