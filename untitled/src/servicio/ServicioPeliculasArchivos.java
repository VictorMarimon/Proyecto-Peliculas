package servicio;

import dominio.Pelicula;

import java.io.*;

public class ServicioPeliculasArchivos implements IServicioPeliculas{

    private final String NOMBRE_ARCHIVO = "peliculas.txt";

    public ServicioPeliculasArchivos(){
        File archivo = new File(NOMBRE_ARCHIVO);
        try {
            if (archivo.exists()){
                System.out.println("El archivo ya existe!");
            }else {
                var salida = new PrintWriter(new FileWriter(archivo));
                salida.close();
                System.out.println("Se ha creado el archivo.");
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error al abrir el archivo: " + e.getMessage());
        }
    };

    @Override
    public void listarPeliculas() {
        var archivo = new File(NOMBRE_ARCHIVO);
        try{
            System.out.println("Listado de películas");
            var entrada = new BufferedReader(new FileReader(archivo));
            String linea;
            linea = entrada.readLine();
            while (linea != null){
                var pelicula = new Pelicula(linea);
                System.out.println(pelicula);
                linea = entrada.readLine();
            }
            entrada.close();
        } catch (Exception e) {
            System.out.println("Hubo un error al leer el archivo.");
        }
    }

    @Override
    public void agregarPeliculas(Pelicula pelicula) {
        boolean anexar = false;
        var archivo = new File(NOMBRE_ARCHIVO);
        try {
            anexar = archivo.exists();
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(pelicula.toString());
            salida.close();
            System.out.println("Película "+ pelicula + " agregada con exito");
        } catch (Exception e) {
            System.out.println("Hubo un error al agregar película al archivo: " + e.getMessage());
        }
    }

    @Override
    public void buscarPeliculas(Pelicula pelicula) {
        var archivo = new File(NOMBRE_ARCHIVO);
        try{
            var entrada = new BufferedReader(new FileReader(archivo));
            String lineaTexto;
            lineaTexto = entrada.readLine();
            int indice = 1;
            boolean encontrada = false;
            String peliculaBuscar = pelicula.getNombre();
            while (lineaTexto != null){
                if (peliculaBuscar != null && peliculaBuscar.equalsIgnoreCase(lineaTexto)){
                    encontrada = true;
                    break;
                }
                lineaTexto = entrada.readLine();
                indice += 1;
            }

            if (encontrada){
                System.out.println("La película " + lineaTexto + " encontrada en la linea " + indice);
            }else {
                System.out.println("La película " + pelicula.getNombre() + " no fue encontrada o no existe.");
            }
            entrada.close();
        } catch (Exception e) {
            System.out.println("Ocurrio un error al buscar la película en el archivo " + e.getMessage());
        }
    }
}
