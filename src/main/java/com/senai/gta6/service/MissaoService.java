package com.senai.gta6.service;

import com.senai.gta6.entity.Missao;
import com.senai.gta6.repository.MissaoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissaoService {

    private final MissaoRepository missaoRepository;
    public MissaoService(MissaoRepository missaoRepository) {
        this.missaoRepository = missaoRepository;
    }

    public List<Missao> mostrarMissao(){
        return missaoRepository.findAll();
    }

    public void addMissao (Missao m){
        Missao missao = new Missao(m.getNomeMissao(), m.getLocal(), m.getObjetivo(), m.getFotoMissao(), m.getDificuldade());
        missaoRepository.save(missao);
    }

    public void deletarMissao(int id){
        missaoRepository.deleteById(id);
    }

    @Transactional
    public void alterarMissao(int id, Missao m){
        Missao missao = missaoRepository.getReferenceById(id);
        missao.setNomeMissao(m.getNomeMissao());
        missao.setLocal(m.getLocal());
        missao.setObjetivo(m.getObjetivo());
        missao.setFotoMissao(m.getFotoMissao());
        missao.setDificuldade(m.getDificuldade());
    }
}
