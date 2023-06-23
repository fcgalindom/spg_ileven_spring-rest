package spg_ileven_spring.com.example.spg_ileven_spring.responce;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}