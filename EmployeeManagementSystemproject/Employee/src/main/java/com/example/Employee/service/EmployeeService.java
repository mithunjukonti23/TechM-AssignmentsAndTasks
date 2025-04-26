package com.example.Employee.service;

import com.example.Employee.entity.Emp;
import com.example.Employee.repository.EmpRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private final EmpRepository empRepository;

    public EmployeeService(EmpRepository empRepository) {
        this.empRepository = empRepository;
    }

    public Emp save(Emp emp) {
        return empRepository.save(emp);
    }

    public List<Emp> findAll() {
        return empRepository.findAll();
    }

    public Optional<Emp> findById(Long id) {
        return empRepository.findById(id);
    }

    public void deleteById(Long id) {
        empRepository.deleteById(id);
    }
}