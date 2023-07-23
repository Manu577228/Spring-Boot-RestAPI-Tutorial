package com.bnmanubharadwaj.SpringBootTutorial1.service;

import com.bnmanubharadwaj.SpringBootTutorial1.entity.Department;

import java.util.List;

public interface DepartmentService {

    public Department saveDepartment(Department department);

   public List<Department> fetchDepartmentList();

  public Department fetchDepartmentById(Long departmentId);

   public void deleteDepartmentById(Long departmentId);

   public Department updateDepartment(Long departmentId, Department department);
}
