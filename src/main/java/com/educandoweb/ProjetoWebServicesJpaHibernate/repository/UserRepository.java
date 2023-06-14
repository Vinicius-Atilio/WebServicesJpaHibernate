package com.educandoweb.ProjetoWebServicesJpaHibernate.repository;

import com.educandoweb.ProjetoWebServicesJpaHibernate.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
