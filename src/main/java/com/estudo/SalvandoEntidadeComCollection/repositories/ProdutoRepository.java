package com.estudo.SalvandoEntidadeComCollection.repositories;

import com.estudo.SalvandoEntidadeComCollection.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
