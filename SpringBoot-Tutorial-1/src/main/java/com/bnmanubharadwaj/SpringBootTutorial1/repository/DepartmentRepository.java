package com.bnmanubharadwaj.SpringBootTutorial1.repository;

import com.bnmanubharadwaj.SpringBootTutorial1.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
