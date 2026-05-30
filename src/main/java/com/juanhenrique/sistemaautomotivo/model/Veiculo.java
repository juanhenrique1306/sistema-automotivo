package com.juanhenrique.sistemaautomotivo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "veiculos")
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String modelo;

    @ManyToOne
    @JoinColumn(name = "marca_id")
    private Marca marca;

    private Integer anoFabricacao;
    private String cor;
    private Double preco;
    private Integer quilometragem;
    private String statusDisponibilidade;
    private String imagem;

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public String getModelo() {return modelo;}
    public void setModelo(String modelo) {this.modelo = modelo;}
    public Marca getMarca() {return marca;}
    public void setMarca(Marca marca) {this.marca = marca;}
    public Integer getAnoFabricacao() {return anoFabricacao;}

    public void setAnoFabricacao(Integer anoFabricacao) {this.anoFabricacao = anoFabricacao;}
    public String getCor() {return cor;}
    public void setCor(String cor) {this.cor = cor;}
    public Double getPreco() {return preco;}
    public void setPreco(Double preco) {this.preco = preco;}
    public Integer getQuilometragem() {return quilometragem;}
    public void setQuilometragem(Integer quilometragem) {this.quilometragem = quilometragem;}

    public String getStatusDisponibilidade() {return statusDisponibilidade;}
    public void setStatusDisponibilidade(String statusDisponibilidade) {this.statusDisponibilidade = statusDisponibilidade;}
    public String getImagem() { return imagem; }
    public void setImagem(String imagem) { this.imagem = imagem; }
}
