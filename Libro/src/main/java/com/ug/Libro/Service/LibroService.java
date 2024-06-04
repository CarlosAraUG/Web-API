package com.ug.Libro.Service;

import org.springframework.stereotype.Service;

import java.util.List;
import com.ug.Libro.Model.Libro;
import com.ug.Libro.Repository.LibroRepository;

@Service
public class LibroService {
    
    private LibroRepository libroRepository;

    public LibroService(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    public Libro guardarLibro(Libro libro) {
        return libroRepository.save(libro);
    }

    public List<Libro> ObtenerLibros() {
        return libroRepository.findAll();
    }
}
