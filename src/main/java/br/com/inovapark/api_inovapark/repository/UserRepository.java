package br.com.inovapark.api_inovapark.repository;

import br.com.inovapark.api_inovapark.model.UserModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long> {
    
}