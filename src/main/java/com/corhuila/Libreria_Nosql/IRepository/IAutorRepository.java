package com.corhuila.Libreria_Nosql.IRepository;


import com.corhuila.Libreria_Nosql.Documentos.Autor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;;

@Repository
public interface IAutorRepository extends  MongoRepository<Autor, String> {
}
