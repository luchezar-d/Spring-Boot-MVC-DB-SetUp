package com.SpringBoot.Spring.MVC.repository;

import com.SpringBoot.Spring.MVC.entities.Cat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatRepository extends CrudRepository<Cat, Long> {

}
