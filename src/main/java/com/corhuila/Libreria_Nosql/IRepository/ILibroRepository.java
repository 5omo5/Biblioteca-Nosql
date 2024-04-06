package com.corhuila.Libreria_Nosql.IRepository;

;
import com.corhuila.Libreria_Nosql.Documentos.Libro;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ILibroRepository extends MongoRepository<Libro, String> {

}
