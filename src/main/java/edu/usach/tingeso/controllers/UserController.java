package edu.usach.tingeso.controllers;


import edu.usach.tingeso.models.User;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface UserController extends CrudRepository<User, Long>{

    public User findByUsername(String username);
}
