package com.ug.Libro.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ug.Libro.Model.Libro;
import com.ug.Libro.Repository.LibroRepository;

@Service
public class LibroService {
    private LibroRepository bookRepository;

    public LibroService (LibroRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public Libro guardarLibro (Libro book){
        return bookRepository.save(book);
    }

    public List <Libro> obtenerLibros (){
        return bookRepository.findAll();
    }
}
