package com.estudo.SalvandoEntidadeComCollection.services;

import com.estudo.SalvandoEntidadeComCollection.dto.CategoriaDTO;
import com.estudo.SalvandoEntidadeComCollection.dto.ProdutoDTO;
import com.estudo.SalvandoEntidadeComCollection.entities.Categoria;
import com.estudo.SalvandoEntidadeComCollection.entities.Produto;
import com.estudo.SalvandoEntidadeComCollection.repositories.CategoriaRepository;
import com.estudo.SalvandoEntidadeComCollection.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository repository;
    @Autowired
    private CategoriaRepository categoriaRepository;

    //        public ProdutoDTO insere(ProdutoDTO dto){//Não retorna o nome da categoria
//        Produto entity = new Produto();
//        entity.setNome(dto.getNome());
//        entity.setPreco(dto.getPreco());
//        for(CategoriaDTO cDTO: dto.getCategorias()){
//            Categoria cat = new Categoria();
//            cat.setId(cDTO.getId());
//            entity.getCategorias().add(cat);
//        }
//        entity = repository.save(entity);
//        return new ProdutoDTO(entity);
//    }
    public ProdutoDTO insere(ProdutoDTO dto) {//Para retornar o nome da categoria
        Produto entity = new Produto();
        entity.setNome(dto.getNome());
        entity.setPreco(dto.getPreco());
        for (CategoriaDTO catDTO : dto.getCategorias()) {
            Categoria cat = categoriaRepository.getReferenceById(catDTO.getId());
            entity.getCategorias().add(cat);
        }
        entity = repository.save(entity);
        return new ProdutoDTO(entity);
    }
}
