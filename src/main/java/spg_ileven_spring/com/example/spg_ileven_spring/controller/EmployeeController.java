package spg_ileven_spring.com.example.spg_ileven_spring.controller;

import spg_ileven_spring.com.example.spg_ileven_spring.model.EmployeeDTO;
import spg_ileven_spring.com.example.spg_ileven_spring.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeService service;
    public EmployeeController(EmployeeService service) { this.service = service; }

    @GetMapping public List<EmployeeDTO> getAll() { return service.getAll(); }
    @GetMapping("/{id}") public EmployeeDTO getById(@PathVariable Long id) { return service.getById(id); }
}