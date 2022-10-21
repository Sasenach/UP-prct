package com.example.nikogdanesvyajusvoujiznsvebom.Controller;
import com.example.nikogdanesvyajusvoujiznsvebom.Model.Employee;
import com.example.nikogdanesvyajusvoujiznsvebom.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;
    @GetMapping("")
    public String employeeMain(Model model){
        Iterable<Employee> listEmployee = employeeRepository.findAll();
        model.addAttribute("listPeople", listEmployee);
        return "employee/index";
    }

    @GetMapping("/add")
    public String employeeAddView(Model model){
        return "employee/add";
    }

    @PostMapping("/add")
    public String employeeAdd(@RequestParam String name,
                              @RequestParam Integer age,
                              @RequestParam String post,
                              @RequestParam String animal,
                              @RequestParam String timetable, Model model){
        Employee employee = new Employee(name, age, post, animal, timetable);
        employeeRepository.save(employee);
        return "redirect:/employee";
    }

    @GetMapping("/employee/filter")
    public String employeeFilter(@RequestParam String searchName,
                                 Model model){
        List<Employee> employee =employeeRepository.findByNameContaining(searchName);
        model.addAttribute("listPeople", employee);
        return "employee/index";
    }
}