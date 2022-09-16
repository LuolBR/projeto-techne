
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
* Classe que representa a tabela VAGA
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"VAGA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Vaga")
public class Vaga implements Serializable {
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
    @Column(name = "nome_vaga", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nome_vaga;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_tipo_vaga", nullable = false, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Tipo_vaga tipo_vaga;


    /**
    * @generated
    */
    @Temporal(TemporalType.DATE)
    @Column(name = "data_inicio", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.util.Date data_inicio;


    /**
    * @generated
    */
    @Temporal(TemporalType.DATE)
    @Column(name = "data_fim", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.util.Date data_fim;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_equipe", nullable = false, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Equipe equipe;


    /**
    * Construtor
    * @generated
    */
    public Vaga(){
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
    public Vaga setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém nome_vaga
    * return nome_vaga
    * @generated
    */
    public java.lang.String getNome_vaga() {
        return this.nome_vaga;
    }

    /**
    * Define nome_vaga
    * @param nome_vaga nome_vaga
    * @generated
    */
    public Vaga setNome_vaga(java.lang.String nome_vaga) {
        this.nome_vaga = nome_vaga;
        return this;
    }
    /**
    * Obtém tipo_vaga
    * return tipo_vaga
    * @generated
    */
    public Tipo_vaga getTipo_vaga() {
        return this.tipo_vaga;
    }

    /**
    * Define tipo_vaga
    * @param tipo_vaga tipo_vaga
    * @generated
    */
    public Vaga setTipo_vaga(Tipo_vaga tipo_vaga) {
        this.tipo_vaga = tipo_vaga;
        return this;
    }
    /**
    * Obtém data_inicio
    * return data_inicio
    * @generated
    */
    public java.util.Date getData_inicio() {
        return this.data_inicio;
    }

    /**
    * Define data_inicio
    * @param data_inicio data_inicio
    * @generated
    */
    public Vaga setData_inicio(java.util.Date data_inicio) {
        this.data_inicio = data_inicio;
        return this;
    }
    /**
    * Obtém data_fim
    * return data_fim
    * @generated
    */
    public java.util.Date getData_fim() {
        return this.data_fim;
    }

    /**
    * Define data_fim
    * @param data_fim data_fim
    * @generated
    */
    public Vaga setData_fim(java.util.Date data_fim) {
        this.data_fim = data_fim;
        return this;
    }
    /**
    * Obtém equipe
    * return equipe
    * @generated
    */
    public Equipe getEquipe() {
        return this.equipe;
    }

    /**
    * Define equipe
    * @param equipe equipe
    * @generated
    */
    public Vaga setEquipe(Equipe equipe) {
        this.equipe = equipe;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Vaga object = (Vaga)obj;
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