package spg_ileven_spring.com.example.spg_ileven_spring.service;

import spg_ileven_spring.com.example.spg_ileven_spring.repository.EmployeeDAO;
import spg_ileven_spring.com.example.spg_ileven_spring.model.EmployeeDTO;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import java.util.List;

import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private final WebClient webClient;

    public EmployeeService(WebClient.Builder webClientBuilder) {
        this.webClient = WebClient.create("http://dummy.restapiexample.com");
    }

    public ResponseEntity<Object> getAll() {
        return webClient.get()
                .uri("/api/v1/employees")
                .header("cookie", "humans_21909=1")
                .retrieve()
                .toEntity(Object.class)
                .block(); // Bloquea hasta obtener respuesta (puedes usarlo de forma reactiva sin block)
    }

    public ResponseEntity<Object> getById(Long id) { 
        return webClient.get()
                .uri("/api/v1/employee/" + id)
                .header("cookie", "humans_21909=1")
                .retrieve()
                .toEntity(Object.class)
                .block(); // Bloquea hasta obtener respuesta (puedes usarlo de forma reactiva sin block)
    }
}
