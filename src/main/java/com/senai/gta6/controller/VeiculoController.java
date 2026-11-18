package com.senai.gta6.controller;

import com.senai.gta6.entity.Veiculo;
import com.senai.gta6.service.VeiculoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/veiculos")
public class VeiculoController {

    private final VeiculoService veiculoService;
    public VeiculoController(VeiculoService veiculoService) {
        this.veiculoService = veiculoService;
    }

    @GetMapping
    public List<Veiculo> mostrar(){
        return veiculoService.mostrarVeiculo();
    }

    @PostMapping
    public void criar(@RequestBody Veiculo v){
        veiculoService.addVeiculo(v);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id){
        veiculoService.deletarVeiculo(id);
    }

    @PutMapping("/{id}")
    public void alterar(@PathVariable int id, @RequestBody Veiculo v){
        veiculoService.alterarVeiculo(id, v);
    }
}
