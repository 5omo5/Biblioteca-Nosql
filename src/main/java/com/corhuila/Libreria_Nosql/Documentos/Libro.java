package com.corhuila.Libreria_Nosql.Documentos;

import nonapi.io.github.classgraph.json.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection = "libro")
public class Libro {

    @Id
    private String id;
    @Field
   private String Titulo;
    @Field
    private String ISBN;
    @Field
    private String Genero;
    @Field
    private int anipublicacion;
    @Field
    private String sinopsis;
    @Field
    private String Autor;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public int getAnipublicacion() {
        return anipublicacion;
    }

    public void setAnipublicacion(int anipublicacion) {
        this.anipublicacion = anipublicacion;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }
}
