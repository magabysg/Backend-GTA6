package com.senai.gta6.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Personagem {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String apelido;
    private String categoria;
    private String foto;
    private String descricao;

    public Personagem(){}

    public Personagem(int id, String nome, String apelido, String categoria, String foto, String descricao) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.categoria = categoria;
        this.foto = foto;
        this.descricao = descricao;
    }

    public Personagem(String nome, String apelido, String categoria, String foto, String descricao) {
        this.nome = nome;
        this.apelido = apelido;
        this.categoria = categoria;
        this.foto = foto;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
