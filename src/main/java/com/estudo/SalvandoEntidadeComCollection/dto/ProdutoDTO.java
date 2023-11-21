package com.estudo.SalvandoEntidadeComCollection.dto;

import com.estudo.SalvandoEntidadeComCollection.entities.Categoria;
import com.estudo.SalvandoEntidadeComCollection.entities.Produto;

import java.util.HashSet;
import java.util.Set;

public class ProdutoDTO {
    private Long id;
    private String nome;
    private Double preco;
    private Set<CategoriaDTO> categorias = new HashSet<>();

    public ProdutoDTO(Long id, String nome, Double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
    public ProdutoDTO(Produto entity) {
        id = entity.getId();
        nome = entity.getNome();
        preco = entity.getPreco();
        for(Categoria c: entity.getCategorias()){
            categorias.add(new CategoriaDTO(c));
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Set<CategoriaDTO> getCategorias() {
        return categorias;
    }
}
