package com.juanhenrique.sistemaautomotivo.controller;

import com.juanhenrique.sistemaautomotivo.model.Veiculo;
import com.juanhenrique.sistemaautomotivo.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoRepository veiculoRepository;

    // 1. Cadastro de Veículos
    @PostMapping
    public Veiculo cadastrar(@RequestBody Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

    // 2. Consulta e Filtro (Exemplo listando todos)
    @GetMapping
    public List<Veiculo> listarTodos() {
        return veiculoRepository.findAll();
    }

    // 3. Consulta por Status de Disponibilidade
    @GetMapping("/status/{status}")
    public List<Veiculo> listarPorStatus(@PathVariable String status) {
        return veiculoRepository.findByStatusDisponibilidade(status);
    }

    // 4. Atualização de Informações (Preço, KM, Status)
    @PutMapping("/{id}")
    public ResponseEntity<Veiculo> atualizar(@PathVariable Long id, @RequestBody Veiculo veiculoAtualizado) {
        return veiculoRepository.findById(id)
                .map(veiculo -> {
                    veiculo.setPreco(veiculoAtualizado.getPreco());
                    veiculo.setQuilometragem(veiculoAtualizado.getQuilometragem());
                    veiculo.setStatusDisponibilidade(veiculoAtualizado.getStatusDisponibilidade());
                    Veiculo atualizado = veiculoRepository.save(veiculo);
                    return ResponseEntity.ok().body(atualizado);
                }).orElse(ResponseEntity.notFound().build());
    }

    // 5. Remoção de Veículos (quando vendidos ou descontinuados)
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id) {
        return veiculoRepository.findById(id)
                .map(veiculo -> {
                    veiculoRepository.delete(veiculo);
                    return ResponseEntity.ok().<Void>build();
                }).orElse(ResponseEntity.notFound().build());
    }
}