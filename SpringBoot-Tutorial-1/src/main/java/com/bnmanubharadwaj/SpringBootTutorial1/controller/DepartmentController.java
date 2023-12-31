package com.bnmanubharadwaj.SpringBootTutorial1.controller;

import com.bnmanubharadwaj.SpringBootTutorial1.entity.Department;
import com.bnmanubharadwaj.SpringBootTutorial1.service.DepartmentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

@PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department) {
    return departmentService.saveDepartment(department);
}

@GetMapping("/departments")
    public List<Department> fetchDepartmentList() {
    return departmentService.fetchDepartmentList();
}

@GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId){
    return departmentService.fetchDepartmentById(departmentId);
}

@DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
    departmentService.deleteDepartmentById(departmentId);
    return "Department deleted Successfully!!";
}

@PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId, @RequestBody Department department) {
    return departmentService.updateDepartment(departmentId, department);
}
}
