package spg_ileven_spring.com.example.spg_ileven_spring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class TestContoller {
    @RequestMapping("/")
    @ResponseBody
    public ResponseEntity<String> function(){
        return new ResponseEntity<>("Cambio Prueba", HttpStatus.OK);
    }

}
