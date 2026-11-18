package com.senai.gta6.controller;

import com.senai.gta6.entity.Missao;
import com.senai.gta6.service.MissaoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/missoes")
public class MissaoController {

    private final MissaoService missaoService;
    public MissaoController(MissaoService missaoService) {
        this.missaoService = missaoService;
    }

    @GetMapping
    public List<Missao> mostrar(){
        return missaoService.mostrarMissao();
    }

    @PostMapping
    public void criar(@RequestBody Missao m){
        missaoService.addMissao(m);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id){
        missaoService.deletarMissao(id);
    }

    @PutMapping("/{id}")
    public void alterar(@PathVariable int id, @RequestBody Missao m){
        missaoService.alterarMissao(id, m);
    }
}
