package spg_ileven_spring.com.example.spg_ileven_spring.model;

import java.util.List;

public class EmployeeResponseDTO {
    private String status;
    private List<EmployeeDTO> data; // Aquí está la lista real de empleados

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public List<EmployeeDTO> getData() { return data; }
    public void setData(List<EmployeeDTO> data) { this.data = data; }
}
