package com.senai.gta6.controller;

import com.senai.gta6.entity.Arma;
import com.senai.gta6.service.ArmaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/armas")
public class ArmaController {

    private final ArmaService armaService;
    public ArmaController(ArmaService armaService) {
        this.armaService = armaService;
    }

    @GetMapping
    public List<Arma> mostrar(){
        return armaService.mostrarArma();
    }

    @PostMapping
    public void criar(@RequestBody Arma a){
        armaService.addArma(a);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id){
        armaService.deletarArma(id);
    }

    @PutMapping("/{id}")
    public void alterar(@PathVariable int id, @RequestBody Arma a){
        armaService.alterarArma(id, a);
    }
}
