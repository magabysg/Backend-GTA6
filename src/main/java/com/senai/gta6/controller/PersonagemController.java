package com.senai.gta6.controller;

import com.senai.gta6.entity.Personagem;
import com.senai.gta6.service.PersonagemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/personagens")
public class PersonagemController {

    private final PersonagemService personagemService;
    public PersonagemController(PersonagemService personagemService) {
        this.personagemService = personagemService;
    }

    @GetMapping
    public List<Personagem> mostrar(){
        return personagemService.mostrarPersonagem();
    }
    @PostMapping
    public void criar(@RequestBody Personagem p){
        personagemService.addPersonagem(p);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id){
        personagemService.deletarPersonagem(id);
    }

    @PutMapping("/{id}")
    public void alterar(@PathVariable int id, @RequestBody Personagem p){
        personagemService.alterarPersonagem(id, p);
    }
}
