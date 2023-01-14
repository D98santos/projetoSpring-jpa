package com.projetospring.projetospring.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.projetospring.projetospring.entities.Product;

public interface ProductRepository extends JpaRepositoryImplementation<Product, Long>{

}
