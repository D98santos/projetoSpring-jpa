package com.projetospring.projetospring.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.projetospring.projetospring.entities.User;

public interface UserRepository extends JpaRepositoryImplementation<User, Long>{

}
