package com.ug.Libro.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ug.Libro.Model.Libro;

public interface LibroRepository extends JpaRepository<Libro, Long>{
    List<Libro> findAll();
}
