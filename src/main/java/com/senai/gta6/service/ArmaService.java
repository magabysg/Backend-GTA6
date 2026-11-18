package com.senai.gta6.service;

import com.senai.gta6.entity.Arma;
import com.senai.gta6.repository.ArmaRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArmaService {

    private final ArmaRepository armaRepository;
    public ArmaService(ArmaRepository armaRepository) {
        this.armaRepository = armaRepository;
    }

    public List<Arma> mostrarArma(){
        return armaRepository.findAll();
    }

    public void addArma (Arma a){
        Arma arma = new Arma(a.getNomeArma(), a.getFabricante(), a.getDescricaoArma(), a.getFotoArma(), a.getCategoriaArma());
        armaRepository.save(arma);
    }

    public void deletarArma(int id){
        armaRepository.deleteById(id);
    }

    @Transactional
    public void alterarArma(int id, Arma a){
        Arma arma = armaRepository.getReferenceById(id);
        arma.setNomeArma(a.getNomeArma());
        arma.setFabricante(a.getFabricante());
        arma.setCategoriaArma(a.getCategoriaArma());
        arma.setFotoArma(a.getFotoArma());
        arma.setDescricaoArma(a.getDescricaoArma());
    }
}
