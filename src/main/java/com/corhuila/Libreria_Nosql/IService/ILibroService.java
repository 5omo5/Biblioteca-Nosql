package com.corhuila.Libreria_Nosql.IService;



import com.corhuila.Libreria_Nosql.Documentos.Libro;

import java.util.List;
import java.util.Optional;

public interface ILibroService {
    List<Libro> findAll(); // Devuelve una lista de clientes
    Optional<Libro> findById(String id); // Devuelve un cliente por su id
    Libro save(Libro libro); // Guarda un libro
    void update(Libro libro, String id); // Actualiza un libro
    void delete(String id); // Elimina un cliente
}
