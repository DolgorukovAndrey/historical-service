package Main.controller;

import Main.entity.Career;
import Main.entity.Employee;
import Main.service.HistoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/history")
public class HistoryController {

    private final HistoryService historyService;

    public HistoryController(HistoryService historyService) {
        this.historyService = historyService;
    }

    @GetMapping("/employees/{employeeId}")
    public List<Employee> getEmployeeHistory(@PathVariable Integer employeeId) {
        return historyService.getAllEmployeeById(employeeId);
    }

    @GetMapping("/careers/{employeeId}")
    public List<Career> getCareerHistory(@PathVariable Integer employeeId) {
        return historyService.getAllCareerById(employeeId);
    }
}
