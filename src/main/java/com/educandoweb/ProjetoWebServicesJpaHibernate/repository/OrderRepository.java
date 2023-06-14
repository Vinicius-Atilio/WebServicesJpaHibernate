package com.educandoweb.ProjetoWebServicesJpaHibernate.repository;

import com.educandoweb.ProjetoWebServicesJpaHibernate.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
