package com.educandoweb.ProjetoWebServicesJpaHibernate.repository;

import com.educandoweb.ProjetoWebServicesJpaHibernate.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
