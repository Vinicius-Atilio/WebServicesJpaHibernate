package com.educandoweb.ProjetoWebServicesJpaHibernate.repository;

import com.educandoweb.ProjetoWebServicesJpaHibernate.entities.OrderItem;
import com.educandoweb.ProjetoWebServicesJpaHibernate.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OderItemRepository extends JpaRepository<OrderItem, Long> {
}
