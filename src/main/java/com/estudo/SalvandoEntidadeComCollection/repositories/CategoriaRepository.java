package com.estudo.SalvandoEntidadeComCollection.repositories;

import com.estudo.SalvandoEntidadeComCollection.entities.Categoria;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, CriteriaBuilder.In> {
}
