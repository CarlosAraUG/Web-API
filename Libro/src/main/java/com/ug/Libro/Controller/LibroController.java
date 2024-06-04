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
@RequestMapping("/Libros")
public class LibroController {

    @Autowired
    LibroService libroService;

    @PostMapping
    public Libro crearLibro(@RequestBody Libro libro) {
        return libroService.guardarLibro(libro);
    }
    
    @GetMapping("/listar")
    public List<Libro> ObtenerLibros() {
        return libroService.ObtenerLibros();
    }
}
