package com.educandoweb.ProjetoWebServicesJpaHibernate.services;

import com.educandoweb.ProjetoWebServicesJpaHibernate.entities.User;
import com.educandoweb.ProjetoWebServicesJpaHibernate.repository.UserRepository;
import com.educandoweb.ProjetoWebServicesJpaHibernate.resources.exceptions.DatabaseExcpetion;
import com.educandoweb.ProjetoWebServicesJpaHibernate.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

    public User findById(Long id){
        Optional<User> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User obj){
        return repo.save(obj);
    }

    public void delete(Long id){
        try {
            repo.deleteById(id);
        } catch (EmptyResultDataAccessException e){
            throw new ResourceNotFoundException(id);
        } catch (DataIntegrityViolationException e){
            throw new DatabaseExcpetion(e.getMessage());
        }

    }

    public User update(Long id, User obj){
        try {
            User entity = repo.getReferenceById(id);
            updateData(entity, obj);
            return repo.save(entity);
        }catch (EntityNotFoundException e){
            throw new ResourceNotFoundException(id);
        }

    }

    private void updateData(User entity, User obj){
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }
}
