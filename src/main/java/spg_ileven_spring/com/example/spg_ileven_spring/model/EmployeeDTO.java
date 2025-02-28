package spg_ileven_spring.com.example.spg_ileven_spring.model;



import com.fasterxml.jackson.annotation.JsonProperty;

public class EmployeeDTO {
    @JsonProperty("id") private Long id;
    @JsonProperty("employee_name") private String name;
    @JsonProperty("employee_salary") private Double salary;

    public Double getAnnualSalary() { return salary * 12; }

    // Getters y setters...
}