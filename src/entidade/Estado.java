package entidade;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author jaimedias
 */
@Entity
public class Estado implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_estado;
    @Column(length = 100, nullable = false, unique = true)
    private String nome_estado;
    @Column(length = 2, nullable = false)
    private String sigla_estado;

    public Long getId_estado() {
        return id_estado;
    }

    public void setId_estado(Long id_estado) {
        this.id_estado = id_estado;
    }

    public String getNome_estado() {
        return nome_estado;
    }

    public void setNome_estado(String nome_estado) {
        this.nome_estado = nome_estado;
    }

    public String getSigla_estado() {
        return sigla_estado;
    }

    public void setSigla_estado(String sigla_estado) {
        this.sigla_estado = sigla_estado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.id_estado);
        hash = 83 * hash + Objects.hashCode(this.nome_estado);
        hash = 83 * hash + Objects.hashCode(this.sigla_estado);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Estado other = (Estado) obj;
        if (!Objects.equals(this.nome_estado, other.nome_estado)) {
            return false;
        }
        if (!Objects.equals(this.sigla_estado, other.sigla_estado)) {
            return false;
        }
        return Objects.equals(this.id_estado, other.id_estado);
    }

}
