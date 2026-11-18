package com.senai.gta6.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Missao {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nomeMissao;
    private String local;
    private String dificuldade;
    private String fotoMissao;
    private String objetivo;

    public Missao(){}

    public Missao(int id, String nomeMissao, String local, String dificuldade, String fotoMissao, String objetivo) {
        this.id = id;
        this.nomeMissao = nomeMissao;
        this.local = local;
        this.dificuldade = dificuldade;
        this.fotoMissao = fotoMissao;
        this.objetivo = objetivo;
    }

    public Missao(String nomeMissao, String local, String dificuldade, String fotoMissao, String objetivo) {
        this.nomeMissao = nomeMissao;
        this.local = local;
        this.dificuldade = dificuldade;
        this.fotoMissao = fotoMissao;
        this.objetivo = objetivo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeMissao() {
        return nomeMissao;
    }

    public void setNomeMissao(String nomeMissao) {
        this.nomeMissao = nomeMissao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public String getFotoMissao() {
        return fotoMissao;
    }

    public void setFotoMissao(String fotoMissao) {
        this.fotoMissao = fotoMissao;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
}
