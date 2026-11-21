package Main.repository;

import Main.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query("SELECT e FROM Employee e WHERE e.employeeId = :employeeId")
    List<Employee> findAllEmployeeById(@Param("employeeId") Integer employeeId);
}