package com.senai.gta6.service;

import com.senai.gta6.entity.Veiculo;
import com.senai.gta6.repository.VeiculoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoService {

    private final VeiculoRepository veiculoRepository;
    public VeiculoService(VeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }

    public List<Veiculo> mostrarVeiculo(){
        return veiculoRepository.findAll();
    }

    public void addVeiculo (Veiculo v){
        Veiculo veiculo = new Veiculo(v.getNomeVeiculo(), v.getMarca(), v.getDescricao(), v.getFotoVeiculo(), v.getCategoriaVeiculo());
        veiculoRepository.save(veiculo);
    }

    public void deletarVeiculo(int id){
        veiculoRepository.deleteById(id);
    }

    @Transactional
    public void alterarVeiculo(int id, Veiculo v){
        Veiculo veiculo = veiculoRepository.getReferenceById(id);
        veiculo.setNomeVeiculo(v.getNomeVeiculo());
        veiculo.setMarca(v.getMarca());
        veiculo.setCategoriaVeiculo(v.getCategoriaVeiculo());
        veiculo.setFotoVeiculo(v.getFotoVeiculo());
        veiculo.setDescricao(v.getDescricao());
    }
}
