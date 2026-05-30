package com.juanhenrique.sistemaautomotivo.controller;

import com.juanhenrique.sistemaautomotivo.model.Marca;
import com.juanhenrique.sistemaautomotivo.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/marcas")
public class MarcaController {

    @Autowired
    private MarcaRepository marcaRepository;

    @PostMapping
    public Marca cadastrar(@RequestBody Marca marca) {
        return marcaRepository.save(marca);
    }

    @GetMapping
    public List<Marca> listarTodas() {
        return marcaRepository.findAll();
    }
}