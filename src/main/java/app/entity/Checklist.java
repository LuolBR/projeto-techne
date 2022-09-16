
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
* Classe que representa a tabela CHECKLIST
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"CHECKLIST\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Checklist")
public class Checklist implements Serializable {
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
    @Column(name = "nome_item", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nome_item;


    /**
    * @generated
    */
    @Column(name = "realizado", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean realizado;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_participante", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Participante participante;


    /**
    * Construtor
    * @generated
    */
    public Checklist(){
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
    public Checklist setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém nome_item
    * return nome_item
    * @generated
    */
    public java.lang.String getNome_item() {
        return this.nome_item;
    }

    /**
    * Define nome_item
    * @param nome_item nome_item
    * @generated
    */
    public Checklist setNome_item(java.lang.String nome_item) {
        this.nome_item = nome_item;
        return this;
    }
    /**
    * Obtém realizado
    * return realizado
    * @generated
    */
    public java.lang.Boolean getRealizado() {
        return this.realizado;
    }

    /**
    * Define realizado
    * @param realizado realizado
    * @generated
    */
    public Checklist setRealizado(java.lang.Boolean realizado) {
        this.realizado = realizado;
        return this;
    }
    /**
    * Obtém participante
    * return participante
    * @generated
    */
    public Participante getParticipante() {
        return this.participante;
    }

    /**
    * Define participante
    * @param participante participante
    * @generated
    */
    public Checklist setParticipante(Participante participante) {
        this.participante = participante;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Checklist object = (Checklist)obj;
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