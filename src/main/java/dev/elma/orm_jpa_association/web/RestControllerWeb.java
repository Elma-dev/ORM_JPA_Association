package dev.elma.orm_jpa_association.web;

import dev.elma.orm_jpa_association.entities.Patient;
import dev.elma.orm_jpa_association.services.HospitalServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class RestControllerWeb {
    HospitalServices hospitalServices;
    @GetMapping("/patients")
    public List<Patient> allPatient(){
        return hospitalServices.getAllPatient();
    }
    

}
