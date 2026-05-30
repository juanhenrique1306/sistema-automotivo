package com.juanhenrique.sistemaautomotivo.repository;

import com.juanhenrique.sistemaautomotivo.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRepository extends JpaRepository<Marca, Long> {
}