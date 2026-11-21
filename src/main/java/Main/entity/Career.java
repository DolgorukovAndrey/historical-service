package Main.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

@Entity
@Table(name = "Career")
public class Career {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "employee_id", nullable = false)
    private Integer employeeId;

    @NotBlank(message = "Название должности не может быть пустым")
    @Size(min = 1, max = 250, message = "Название должности должно быть от 1 до 250 символов")
    @Column(name = "post", nullable = false, length = 250)
    private String post;

    @NotBlank(message = "Название отдела не может быть пустым")
    @Size(min = 1, max = 250, message = "Название должности должно быть от 1 до 250 символов")
    @Column(name = "department", nullable = false, length = 250)
    private String department;

    @NotNull(message = "Ставка не может быть пустой")
    @Min(value = 0, message = "Ставка должна быть больше 0")
    @Column(name = "salary")
    private Integer salary;

    @NotNull(message = "Поле даты начала не может быть пустым")
    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;


    public Career() {
    }

    public Career(Integer employeeId, String post, String department, int salary, LocalDate startDate) {
        this.employeeId = employeeId;
        this.post = post;
        this.department = department;
        this.salary = salary;
        this.startDate = startDate;
        this.endDate = null;
    }

    public Career(Integer employeeId, String post, String department, int salary, LocalDate startDate, LocalDate endDate) {
        this.employeeId = employeeId;
        this.post = post;
        this.department = department;
        this.salary = salary;
        this.startDate = startDate;
        this.endDate = endDate;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
    @Override
    public String toString() {
        return "Career{" +
                "id = " + id +
                ", employeeId = " + employeeId +
                ", post = " + post +
                ", department = " + department +
                ", salary = " + salary +
                ", startDate = " + startDate +
                ", endDate = " + endDate + "}";
    }
}
