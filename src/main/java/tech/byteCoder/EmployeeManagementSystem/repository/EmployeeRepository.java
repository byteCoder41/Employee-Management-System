package tech.byteCoder.EmployeeManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.byteCoder.EmployeeManagementSystem.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
