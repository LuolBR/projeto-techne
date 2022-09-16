
package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;


/**
* Classe que representa a tabela EQUIPE
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"EQUIPE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Equipe")
public class Equipe implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @Column(name = "nome_equipe", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nome_equipe;


    /**
    * @generated
    */
    @Column(name = "nome_lider_equipe", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nome_lider_equipe;


    /**
    * Construtor
    * @generated
    */
    public Equipe(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Equipe setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém nome_equipe
    * return nome_equipe
    * @generated
    */
    public java.lang.String getNome_equipe() {
        return this.nome_equipe;
    }

    /**
    * Define nome_equipe
    * @param nome_equipe nome_equipe
    * @generated
    */
    public Equipe setNome_equipe(java.lang.String nome_equipe) {
        this.nome_equipe = nome_equipe;
        return this;
    }
    /**
    * Obtém nome_lider_equipe
    * return nome_lider_equipe
    * @generated
    */
    public java.lang.String getNome_lider_equipe() {
        return this.nome_lider_equipe;
    }

    /**
    * Define nome_lider_equipe
    * @param nome_lider_equipe nome_lider_equipe
    * @generated
    */
    public Equipe setNome_lider_equipe(java.lang.String nome_lider_equipe) {
        this.nome_lider_equipe = nome_lider_equipe;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Equipe object = (Equipe)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}