
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
* Classe que representa a tabela PARTICIPANTE
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"PARTICIPANTE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Participante")
public class Participante implements Serializable {
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
    @Column(name = "nome_completo", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nome_completo;


    /**
    * @generated
    */
    @Column(name = "idade", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer idade;


    /**
    * @generated
    */
    @Column(name = "municipio", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String municipio;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_status_participante", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Status_participante status_participante;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_vaga", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Vaga vaga;


    /**
    * @generated
    */
    @Column(name = "email", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String email;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_user", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private User user;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "inicio_processo", nullable = true, unique = false, insertable=true, updatable=true, columnDefinition = "TIMESTAMP")
        
        private java.util.Date inicio_processo;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fim_processo", nullable = true, unique = false, insertable=true, updatable=true, columnDefinition = "TIMESTAMP")
        
        private java.util.Date fim_processo;


    /**
    * @generated
    */
    @Column(name = "total_horas_processo", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer total_horas_processo;


    /**
    * Construtor
    * @generated
    */
    public Participante(){
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
    public Participante setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém nome_completo
    * return nome_completo
    * @generated
    */
    public java.lang.String getNome_completo() {
        return this.nome_completo;
    }

    /**
    * Define nome_completo
    * @param nome_completo nome_completo
    * @generated
    */
    public Participante setNome_completo(java.lang.String nome_completo) {
        this.nome_completo = nome_completo;
        return this;
    }
    /**
    * Obtém idade
    * return idade
    * @generated
    */
    public java.lang.Integer getIdade() {
        return this.idade;
    }

    /**
    * Define idade
    * @param idade idade
    * @generated
    */
    public Participante setIdade(java.lang.Integer idade) {
        this.idade = idade;
        return this;
    }
    /**
    * Obtém municipio
    * return municipio
    * @generated
    */
    public java.lang.String getMunicipio() {
        return this.municipio;
    }

    /**
    * Define municipio
    * @param municipio municipio
    * @generated
    */
    public Participante setMunicipio(java.lang.String municipio) {
        this.municipio = municipio;
        return this;
    }
    /**
    * Obtém status_participante
    * return status_participante
    * @generated
    */
    public Status_participante getStatus_participante() {
        return this.status_participante;
    }

    /**
    * Define status_participante
    * @param status_participante status_participante
    * @generated
    */
    public Participante setStatus_participante(Status_participante status_participante) {
        this.status_participante = status_participante;
        return this;
    }
    /**
    * Obtém vaga
    * return vaga
    * @generated
    */
    public Vaga getVaga() {
        return this.vaga;
    }

    /**
    * Define vaga
    * @param vaga vaga
    * @generated
    */
    public Participante setVaga(Vaga vaga) {
        this.vaga = vaga;
        return this;
    }
    /**
    * Obtém email
    * return email
    * @generated
    */
    public java.lang.String getEmail() {
        return this.email;
    }

    /**
    * Define email
    * @param email email
    * @generated
    */
    public Participante setEmail(java.lang.String email) {
        this.email = email;
        return this;
    }
    /**
    * Obtém user
    * return user
    * @generated
    */
    public User getUser() {
        return this.user;
    }

    /**
    * Define user
    * @param user user
    * @generated
    */
    public Participante setUser(User user) {
        this.user = user;
        return this;
    }
    /**
    * Obtém inicio_processo
    * return inicio_processo
    * @generated
    */
    public java.util.Date getInicio_processo() {
        return this.inicio_processo;
    }

    /**
    * Define inicio_processo
    * @param inicio_processo inicio_processo
    * @generated
    */
    public Participante setInicio_processo(java.util.Date inicio_processo) {
        this.inicio_processo = inicio_processo;
        return this;
    }
    /**
    * Obtém fim_processo
    * return fim_processo
    * @generated
    */
    public java.util.Date getFim_processo() {
        return this.fim_processo;
    }

    /**
    * Define fim_processo
    * @param fim_processo fim_processo
    * @generated
    */
    public Participante setFim_processo(java.util.Date fim_processo) {
        this.fim_processo = fim_processo;
        return this;
    }
    /**
    * Obtém total_horas_processo
    * return total_horas_processo
    * @generated
    */
    public java.lang.Integer getTotal_horas_processo() {
        return this.total_horas_processo;
    }

    /**
    * Define total_horas_processo
    * @param total_horas_processo total_horas_processo
    * @generated
    */
    public Participante setTotal_horas_processo(java.lang.Integer total_horas_processo) {
        this.total_horas_processo = total_horas_processo;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Participante object = (Participante)obj;
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