package com.senai.gta6.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Arma {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nomeArma;
    private String categoriaArma;
    private String fabricante;
    private String fotoArma;
    private String descricaoArma;

    public Arma(int id, String nomeArma, String categoriaArma, String fabricante, String fotoArma, String descricaoArma) {
        this.id = id;
        this.nomeArma = nomeArma;
        this.categoriaArma = categoriaArma;
        this.fabricante = fabricante;
        this.fotoArma = fotoArma;
        this.descricaoArma = descricaoArma;
    }

    public Arma(String nomeArma, String categoriaArma, String fabricante, String fotoArma, String descricaoArma) {
        this.nomeArma = nomeArma;
        this.categoriaArma = categoriaArma;
        this.fabricante = fabricante;
        this.fotoArma = fotoArma;
        this.descricaoArma = descricaoArma;
    }

    public Arma(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeArma() {
        return nomeArma;
    }

    public void setNomeArma(String nomeArma) {
        this.nomeArma = nomeArma;
    }

    public String getCategoriaArma() {
        return categoriaArma;
    }

    public void setCategoriaArma(String categoriaArma) {
        this.categoriaArma = categoriaArma;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getFotoArma() {
        return fotoArma;
    }

    public void setFotoArma(String fotoArma) {
        this.fotoArma = fotoArma;
    }

    public String getDescricaoArma() {
        return descricaoArma;
    }

    public void setDescricaoArma(String descricaoArma) {
        this.descricaoArma = descricaoArma;
    }
}
