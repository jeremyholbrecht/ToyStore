package be.intecbrussel.toyStore.controllers;

import be.intecbrussel.toyStore.entities.Toy;
import be.intecbrussel.toyStore.services.interfaces.ToyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ToyController {


    private ToyService toyService;

    @Autowired
    public ToyController(ToyService toyService) {
        this.toyService = toyService;
    }

    @GetMapping("/hello")
    public String hello(){

        return "test";
    }

    @GetMapping("/hello2")
    public String hello2(Model model){

        String greeting = "Hi!";
        model.addAttribute("message", greeting);

        return "test";
    }


    @GetMapping("/toy/{id}")
    public String oneToy(Model model, @PathVariable int id){
        Toy toy = toyService.getOneById(id);

        model.addAttribute("toy", toy);

        return "toy";
    }

    @GetMapping("/toys")
    public String allToys(Model model){


        model.addAttribute("toys", toyService.getAllToys());

        return "toys";
    }



}