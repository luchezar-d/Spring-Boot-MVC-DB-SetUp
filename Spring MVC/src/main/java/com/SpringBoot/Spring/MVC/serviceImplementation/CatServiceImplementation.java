package com.SpringBoot.Spring.MVC.serviceImplementation;

import com.SpringBoot.Spring.MVC.entities.Cat;
import com.SpringBoot.Spring.MVC.models.CatModel;
import com.SpringBoot.Spring.MVC.repository.CatRepository;
import com.SpringBoot.Spring.MVC.service.CatService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatServiceImplementation implements CatService {

    @Autowired
    private CatRepository catRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void buy(CatModel catModel) {
        Cat cat = this.modelMapper.map(catModel,Cat.class);
        this.catRepository.save(cat);
    }
}
