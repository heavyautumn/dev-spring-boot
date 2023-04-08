package com.heavyautumn.springboot.cruddemo.dao;

import com.heavyautumn.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


//@RepositoryRestResource(path = "members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> { // Entity type, Primary Key
    // that's it ...  no need to write any code
}
