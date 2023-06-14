package com.educandoweb.ProjetoWebServicesJpaHibernate.repository;

import com.educandoweb.ProjetoWebServicesJpaHibernate.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
