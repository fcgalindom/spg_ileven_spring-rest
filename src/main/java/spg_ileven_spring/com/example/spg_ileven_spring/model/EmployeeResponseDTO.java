package spg_ileven_spring.com.example.spg_ileven_spring.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true) // Ignora campos desconocidos en la respuesta
public class EmployeeResponseDTO {
    private String status;
    private List<EmployeeDTO> data; // Lista de empleados

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public List<EmployeeDTO> getData() { 
        return data != null ? data : List.of(); // Evita NullPointerException
    }
    
    public void setData(List<EmployeeDTO> data) { this.data = data; }
}