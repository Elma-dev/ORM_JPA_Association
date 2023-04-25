package dev.elma.orm_jpa_association;

import dev.elma.orm_jpa_association.entities.Medecin;
import dev.elma.orm_jpa_association.entities.Patient;
import dev.elma.orm_jpa_association.repositories.MedecinRepository;
import dev.elma.orm_jpa_association.repositories.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
@AllArgsConstructor
public class OrmJpaAssociationApplication implements CommandLineRunner {

    PatientRepository patientRepository;
    MedecinRepository medecinRepository;
    public static void main(String[] args) {

        SpringApplication.run(OrmJpaAssociationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Stream.of("Ahmed","Ibrahim","Nadia")
                .forEach(name->{
                    Patient p=Patient.builder().
                            birthDay(new Date()).
                            name(name).
                            sick(true).
                            build();
                    patientRepository.save(p);
                });
        Stream.of("Imad","Jamila","Nadia")
                .forEach(name->{
                    Medecin m=Medecin.builder()
                            .name(name)
                            .speciality(Math.random()>0.5?"Chijurgien":"Dentiste")
                            .email(name+"@gmail.com").build();
                    medecinRepository.save(m);
                });
    }
}
