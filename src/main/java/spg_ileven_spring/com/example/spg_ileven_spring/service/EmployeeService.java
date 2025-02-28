package spg_ileven_spring.com.example.spg_ileven_spring.service;

import spg_ileven_spring.com.example.spg_ileven_spring.repository.EmployeeDAO;
import spg_ileven_spring.com.example.spg_ileven_spring.model.EmployeeDTO;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeDAO dao;
    public EmployeeService(EmployeeDAO dao) { this.dao = dao; }

    public List<EmployeeDTO> getAll() { return dao.getAll(); }
    public EmployeeDTO getById(Long id) { return dao.getById(id); }
}