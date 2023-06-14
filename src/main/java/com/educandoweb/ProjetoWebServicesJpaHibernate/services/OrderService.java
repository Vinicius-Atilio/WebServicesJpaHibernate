package com.educandoweb.ProjetoWebServicesJpaHibernate.services;

import com.educandoweb.ProjetoWebServicesJpaHibernate.entities.Order;
import com.educandoweb.ProjetoWebServicesJpaHibernate.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repo;

    public List<Order> findAll() {
        return repo.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = repo.findById(id);
        return obj.get();
    }
}
