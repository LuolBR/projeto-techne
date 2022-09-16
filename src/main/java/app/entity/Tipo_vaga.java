
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
* Classe que representa a tabela TIPO_VAGA
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"TIPO_VAGA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Tipo_vaga")
public class Tipo_vaga implements Serializable {
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
    @Column(name = "tipo_vaga", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String tipo_vaga;


    /**
    * Construtor
    * @generated
    */
    public Tipo_vaga(){
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
    public Tipo_vaga setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém tipo_vaga
    * return tipo_vaga
    * @generated
    */
    public java.lang.String getTipo_vaga() {
        return this.tipo_vaga;
    }

    /**
    * Define tipo_vaga
    * @param tipo_vaga tipo_vaga
    * @generated
    */
    public Tipo_vaga setTipo_vaga(java.lang.String tipo_vaga) {
        this.tipo_vaga = tipo_vaga;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Tipo_vaga object = (Tipo_vaga)obj;
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