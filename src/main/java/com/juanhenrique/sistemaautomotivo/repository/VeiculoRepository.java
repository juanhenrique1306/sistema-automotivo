package com.juanhenrique.sistemaautomotivo.repository;

import com.juanhenrique.sistemaautomotivo.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

    List<Veiculo> findByStatusDisponibilidade(String status);
    List<Veiculo> findByAnoFabricacao(Integer ano);
    List<Veiculo> findByModeloContainingIgnoreCase(String modelo);
    List<Veiculo> findByPrecoLessThanEqual(Double preco);
}