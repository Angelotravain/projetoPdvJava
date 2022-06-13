/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Angelo
 */
@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProd;
    @Column(length = 100, nullable = false, unique = true)
    private String nomeProd;
    @Column(length = 100, nullable = false)
    private String descProd;
    @Column(length = 100, nullable = false)
    private String quantProd;
    @Column(length = 100, nullable = false)
    private String valorProd;

    public String getValorProd() {
        return valorProd;
    }

    public void setValorProd(String valorProd) {
        this.valorProd = valorProd;
    }

    public Long getIdProd() {
        return idProd;
    }

    public void setIdProd(Long idProd) {
        this.idProd = idProd;
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public String getDescProd() {
        return descProd;
    }

    public void setDescProd(String descProd) {
        this.descProd = descProd;
    }

    public String getQuantProd() {
        return quantProd;
    }

    public void setQuantProd(String quantProd) {
        this.quantProd = quantProd;
    }

    
}
