package com.SpringBoot.Spring.MVC.controller;

import com.SpringBoot.Spring.MVC.entities.Cat;
import com.SpringBoot.Spring.MVC.models.CatModel;
import com.SpringBoot.Spring.MVC.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CatController {

    @Autowired
    private CatService catService;

    @GetMapping("/cat")
    public String getCatHomePage() {
        return "cats.html";
    }

    @PostMapping("/buyCat")
    public String buyCat(@ModelAttribute CatModel cat) {
        System.out.println("Name: " + cat.getName());
        System.out.println("Age: " + cat.getAge());
        this.catService.buy(cat);
        return "redirect:/dog";
    }

    @GetMapping("cat/edit/{catId}")
    @ResponseBody
    public String getEdit(@PathVariable long catId) {
        return String.valueOf(catId);
    }

    @GetMapping("/mycat")
    public ModelAndView getCar(ModelAndView modelAndView, Model model){
        String cat = "cat";
        model.addAttribute("cat",cat);
        modelAndView.addObject("cat",cat);
        modelAndView.setViewName("cats.html");

        return modelAndView;
    }

}
