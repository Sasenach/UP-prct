package com.example.nikogdanesvyajusvoujiznsvebom.Controller;

import com.example.nikogdanesvyajusvoujiznsvebom.Model.Zoo;
import com.example.nikogdanesvyajusvoujiznsvebom.Repository.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/zoo")
public class ZooController {
    @Autowired
    ZooRepository zooRepository;

    @GetMapping("")
    public String zooMain(Model model) {
        Iterable<Zoo> listZoo = zooRepository.findAll();
        model.addAttribute("listAnimal", listZoo);
        return "zoo/index";
    }

    @GetMapping("/add")
    public String zooAddView(Model model) {
        return "zoo/add";
    }

    @PostMapping("/add")
    public String zooAdd(@RequestParam String name,
                         @RequestParam Integer age,
                         @RequestParam String description,
                         @RequestParam Integer weight,
                         @RequestParam Integer height, Model model) {
        Zoo zoo = new Zoo(description, name, age, height, weight);
        zooRepository.save(zoo);
        return "redirect:/zoo";
    }

    @GetMapping("/filter")
    public String zooFilter(@RequestParam String searchName,
                            Model model){
        List<Zoo> zoo = zooRepository.findByNameContaining(searchName);
        model.addAttribute("listAnimal", zoo);
        return "zoo/index";
    }
}
