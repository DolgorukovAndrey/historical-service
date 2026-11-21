package Main.service;

import Main.entity.Career;
import Main.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Main.repository.CareerRepository;
import Main.repository.EmployeeRepository;

import java.util.List;

@Service
public class HistoryService {

    private final EmployeeRepository employeeRepository;
    private final CareerRepository careerRepository;

    @Autowired
    public HistoryService(EmployeeRepository employeeRepository, CareerRepository careerRepository) {
        this.employeeRepository = employeeRepository;
        this.careerRepository = careerRepository;
    }

    public List<Employee> getAllEmployeeById(Integer employeeId){
        return employeeRepository.findAllEmployeeById(employeeId);
    }

    public List<Career> getAllCareerById(Integer employeeId){
        return careerRepository.findAllCareerById(employeeId);
    }
}