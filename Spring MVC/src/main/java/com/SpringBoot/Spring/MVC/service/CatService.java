package com.SpringBoot.Spring.MVC.service;

import com.SpringBoot.Spring.MVC.models.CatModel;
import org.springframework.stereotype.Service;

@Service
public interface CatService {

    void buy(CatModel catModel);

}
