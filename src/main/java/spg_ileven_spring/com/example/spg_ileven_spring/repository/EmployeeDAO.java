package spg_ileven_spring.com.example.spg_ileven_spring.repository;

import spg_ileven_spring.com.example.spg_ileven_spring.model.EmployeeDTO;
import spg_ileven_spring.com.example.spg_ileven_spring.model.EmployeeResponseDTO;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import java.util.Collections;
import java.util.List;
import org.springframework.http.*;
@Repository
public class EmployeeDAO {
    private final RestTemplate restTemplate = new RestTemplate();
    private final String BASE_URL = "http://dummy.restapiexample.com/api/v1";

    private HttpHeaders getHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64)");
        headers.set("Accept", "application/json");
        return headers;
    }

    public List<EmployeeDTO> getAll() {
        try {
            HttpEntity<String> entity = new HttpEntity<>(getHeaders());
            ResponseEntity<EmployeeResponseDTO> response = restTemplate.exchange(
                    BASE_URL + "/employees",
                    HttpMethod.GET,
                    entity,
                    EmployeeResponseDTO.class
            );
            return response.getBody() != null ? response.getBody().getData() : Collections.emptyList();
        } catch (Exception e) {
            System.err.println("Error al obtener empleados: " + e.getMessage());
            return Collections.emptyList();
        }
    }

    public EmployeeDTO getById(Long id) {
        try {
            HttpEntity<String> entity = new HttpEntity<>(getHeaders());
            ResponseEntity<EmployeeResponseDTO> response = restTemplate.exchange(
                    BASE_URL + "/employee/" + id,
                    HttpMethod.GET,
                    entity,
                    EmployeeResponseDTO.class
            );
            if (response.getBody() != null && response.getBody().getData() != null) {
                return response.getBody().getData().get(0);
            }
        } catch (Exception e) {
            System.err.println("Error al obtener empleado con ID " + id + ": " + e.getMessage());
        }
        return null;
    }
}