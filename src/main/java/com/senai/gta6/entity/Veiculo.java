package com.senai.gta6.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Veiculo {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nomeVeiculo;
    private String categoriaVeiculo;
    private String marca;
    private String fotoVeiculo;
    private String descricao;

    public Veiculo(){}

    public Veiculo(int id, String nomeVeiculo, String categoriaVeiculo, String marca, String fotoVeiculo, String descricao) {
        this.id = id;
        this.nomeVeiculo = nomeVeiculo;
        this.categoriaVeiculo = categoriaVeiculo;
        this.marca = marca;
        this.fotoVeiculo = fotoVeiculo;
        this.descricao = descricao;
    }

    public Veiculo(String nomeVeiculo, String categoriaVeiculo, String marca, String fotoVeiculo, String descricao) {
        this.nomeVeiculo = nomeVeiculo;
        this.categoriaVeiculo = categoriaVeiculo;
        this.marca = marca;
        this.fotoVeiculo = fotoVeiculo;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeVeiculo() {
        return nomeVeiculo;
    }

    public void setNomeVeiculo(String nomeVeiculo) {
        this.nomeVeiculo = nomeVeiculo;
    }

    public String getCategoriaVeiculo() {
        return categoriaVeiculo;
    }

    public void setCategoriaVeiculo(String categoriaVeiculo) {
        this.categoriaVeiculo = categoriaVeiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFotoVeiculo() {
        return fotoVeiculo;
    }

    public void setFotoVeiculo(String fotoVeiculo) {
        this.fotoVeiculo = fotoVeiculo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
