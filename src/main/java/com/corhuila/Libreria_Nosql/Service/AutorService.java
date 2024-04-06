package com.corhuila.Libreria_Nosql.Service;


import com.corhuila.Libreria_Nosql.Documentos.Autor;
import com.corhuila.Libreria_Nosql.IRepository.IAutorRepository;
import com.corhuila.Libreria_Nosql.IService.IAutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService implements IAutorService {

    //Conectar con los datos - IRepository
    // Inyección de dependencia
    @Autowired
    private IAutorRepository repository;


    @Override
    public List<Autor> findAll() {
       return repository.findAll();
    }

    @Override
    public Optional<Autor> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Autor save(Autor autor) {
        return repository.save(autor);
    }

    @Override
    public void update(Autor autor, String id) {
        //Obtener el objeto autor y el String
        //Verificar con el String, si exiten los datos
        Optional<Autor> ps = repository.findById(id);

        //Cargar nuevo objeto
        if (!ps.isEmpty()){
            Autor autorUpdate = ps.get();
            autorUpdate.setNombre(autor.getNombre());
            autorUpdate.setApellido(autor.getApellido());
            autorUpdate.setNacionalidad(autor.getNacionalidad());
            autorUpdate.setFechaNacimiento(autor.getFechaNacimiento());
            autorUpdate.setBiografia(autor.getBiografia());

            //Actualizar el objeto autor
            repository.save(autorUpdate);
        }else{
            System.out.println("No existe el autor");
        }
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}
