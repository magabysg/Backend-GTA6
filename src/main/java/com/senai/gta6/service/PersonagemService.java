package com.senai.gta6.service;

import com.senai.gta6.entity.Personagem;
import com.senai.gta6.repository.PersonagemRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonagemService {

    private final PersonagemRepository personagemRepository;
    public PersonagemService(PersonagemRepository personagemRepository) {
        this.personagemRepository = personagemRepository;
    }

    public List<Personagem> mostrarPersonagem(){
        return personagemRepository.findAll();
    }

    public void addPersonagem (Personagem p){
        Personagem personagem = new Personagem(p.getNome(), p.getApelido(), p.getDescricao(), p.getFoto(), p.getCategoria());
        personagemRepository.save(personagem);
    }

    public void deletarPersonagem(int id){
        personagemRepository.deleteById(id);
    }

    @Transactional
    public void alterarPersonagem(int id, Personagem p){
        Personagem personagem = personagemRepository.getReferenceById(id);
        personagem.setNome(p.getNome());
        personagem.setApelido(p.getApelido());
        personagem.setCategoria(p.getCategoria());
        personagem.setFoto(p.getFoto());
        personagem.setDescricao(p.getDescricao());
    }
}
