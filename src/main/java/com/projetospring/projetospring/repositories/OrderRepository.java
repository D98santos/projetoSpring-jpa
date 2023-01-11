package com.projetospring.projetospring.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.projetospring.projetospring.entities.Order;

public interface OrderRepository extends JpaRepositoryImplementation<Order, Long>{

}
