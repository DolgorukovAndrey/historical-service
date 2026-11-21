package Main.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "employee_id", nullable = false)
    private Integer employeeId;

    @NotBlank(message = "ФИО не может быть пустым")
    @Size(min = 1, max = 300, message = "ФИО должно быть от 1 до 300 символов")
    @Column(name = "full_name", nullable = false, length = 300)
    private String fullName;

    @NotNull(message = "Поле даты рождения не может быть пустым")
    @Column(name = "birth_date")
    private LocalDate birthDate;

    @NotBlank(message = "Серия и номер паспорта не могут быть пустыми")
    @Size(min = 1, max = 11, message = "Серия и номер паспорта должны быть от 1 до 11 символов")
    @Column(name = "passport", nullable = false, length = 11)
    private String passport;

    @NotBlank(message = "СНИЛС не может быть пустыми")
    @Size(min = 1, max = 12, message = "СНИЛС должен быть от 1 до 12 символов")
    @Column(name = "snils", nullable = false, length = 12)
    private String snils;

    @NotBlank(message = "ИНН не может быть пустыми")
    @Size(min = 1, max = 14, message = "ИНН должен быть от 1 до 14 символов")
    @Column(name = "inn", nullable = false, length = 14)
    private String inn;

    @NotBlank(message = "Номер телефона не может быть пустыми")
    @Size(min = 1, max = 20, message = "Номер телефона должен быть от 1 до 14 символов")
    @Column(name = "phone_number", nullable = false, length = 20)
    private String phoneNumber;

    @NotBlank(message = "Адрес электронной почты не может быть пустыми")
    @Size(min = 1, max = 200, message = "Адрес электронной почты должен быть от 1 до 200 символов")
    @Column(name = "mail", nullable = false, length = 200)
    private String mail;

    @NotBlank(message = "Адрес проживания не может быть пустыми")
    @Size(min = 1, max = 500, message = "Адрес проживания должен быть от 1 до 500 символов")
    @Column(name = "address", nullable = false, length = 500)
    private String address;

    @NotBlank(message = "Рабочий статус не может быть пустыми")
    @Size(min = 1, max = 30, message = "Рабочий статус должен быть от 1 до 30 символов")
    @Column(name = "work_status", nullable = false, length = 30)
    private String workStatus;

    @Size(min = 1, max = 250, message = "Причина увольнения должна быть от 1 до 250 символов")
    @Column(name = "reason_dismissal", length = 250)
    private String reasonDismissal;

    @NotNull(message = "Поле даты создания записи не может быть пустым")
    @Column(name = "add_date")
    private LocalDateTime addDate;


    public Employee() {
    }

    public Employee(Integer employeeId, String fullName, LocalDate birthDate, String passport,
                    String snils, String inn, String phoneNumber, String mail, String address,
                    String workStatus, LocalDateTime addDate) {
        this.employeeId = employeeId;
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.passport = passport;
        this.snils = snils;
        this.inn = inn;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
        this.address = address;
        this.workStatus = workStatus;
        this.addDate = addDate;
    }

    public Employee(Long id, Integer employeeId, String fullName, LocalDate birthDate, String passport,
                    String snils, String inn, String phoneNumber, String mail, String address,
                    String workStatus, String reasonDismissal, LocalDateTime addDate) {
        this.id = id;
        this.employeeId = employeeId;
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.passport = passport;
        this.snils = snils;
        this.inn = inn;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
        this.address = address;
        this.workStatus = workStatus;
        this.reasonDismissal = reasonDismissal;
        this.addDate = addDate;
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getSnils() {
        return snils;
    }

    public void setSnils(String snils) {
        this.snils = snils;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(String workStatus) {
        this.workStatus = workStatus;
    }

    public String getReasonDismissal() {
        return reasonDismissal;
    }

    public void setReasonDismissal(String reasonDismissal) {
        this.reasonDismissal = reasonDismissal;
    }

    public LocalDateTime getAddDate() {
        return addDate;
    }

    public void setAddDate(LocalDateTime addDate) {
        this.addDate = addDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", employeeId=" + employeeId +
                ", fullName=" + fullName +
                ", birthDate=" + birthDate +
                ", passport=" + passport +
                ", snils=" + snils +
                ", inn=" + inn +
                ", phoneNumber=" + phoneNumber +
                ", mail=" + mail +
                ", address=" + address +
                ", workStatus=" + workStatus +
                ", reasonDismissal=" + reasonDismissal +
                ", addDate=" + addDate + '}';
    }
}
