package com.transport.beta.repository;

import java.util.List;
import java.util.Optional;

import com.transport.beta.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	Optional<Employee> findByName(String name);
	
	List<Employee> findAllByDepoId(String depoId);
 
}
