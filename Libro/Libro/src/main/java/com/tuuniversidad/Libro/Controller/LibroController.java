package com.ug.Libro.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ug.Libro.Model.Libro;
import com.ug.Libro.Service.LibroService;

@RestController
@RequestMapping ("/libro")

public class LibroController {
    @Autowired
    LibroService bookService;

    @PostMapping("/guardar")
    public Libro guardarLibro (@RequestBody Libro book){
        return bookService.guardarLibro(book);
    }

    @GetMapping ("/mostrar")
    public List <Libro> obtenerLibros(){
        return bookService.obtenerLibros();
    }
}
