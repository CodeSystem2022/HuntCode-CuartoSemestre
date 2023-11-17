package utn.tienda_libros.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.tienda_libros.modelo.Libro;
import utn.tienda_libros.repositorio.LibroRepositorio;

import java.util.List;

@Service
public class LibroServicio implements ILibroServicio {

    //Implementamos todos los metodos

    @Autowired
    private LibroRepositorio libroRepositorio; // Autowired Instancia de manera automatica

    @Override
    public List<Libro> listarLibros() {
        return libroRepositorio.findAll(); //regresa todos los libro a la tabla de datos
    }

    @Override
    public Libro buscarLibroPorId(Integer idLibro) {
        Libro libro = libroRepositorio.findById(idLibro).orElse(null); //Nos regresa el id el libro a un null
        return libro;
    }

    @Override
    public void guardarLibro(Libro libro) {
        libroRepositorio.save(libro); //Met para guardar el libro

    }

    @Override
    public void eliminarLibro(Libro libro) {
        libroRepositorio.delete(libro);//elimina el libro

    }
}
