package dev.elma.orm_jpa_association;

import dev.elma.orm_jpa_association.entities.*;
import dev.elma.orm_jpa_association.repositories.ConsultationRepository;
import dev.elma.orm_jpa_association.repositories.MedecinRepository;
import dev.elma.orm_jpa_association.repositories.PatientRepository;
import dev.elma.orm_jpa_association.repositories.RendezVousRepository;
import dev.elma.orm_jpa_association.services.HospitalServices;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
@AllArgsConstructor
public class OrmJpaAssociationApplication implements CommandLineRunner {

    HospitalServices hospitalServices;
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
                    hospitalServices.savePatient(p);
                });
        Stream.of("Imad","Jamila","Nadia")
                .forEach(name->{
                    Medecin m=Medecin.builder()
                            .name(name)
                            .speciality(Math.random()>0.5?"Chijurgien":"Dentiste")
                            .email(name+"@gmail.com").build();
                    hospitalServices.saveMedecin(m);
                });

        Patient p=hospitalServices.findPatient("Ibrahim");
        Medecin m=hospitalServices.findMedecin("Jamila");
        RendezVous rendezVous1=RendezVous.builder()
                .date(new Date()).patient(p).medecin(m).statusRDV(StatusRDV.PENDING).build();
        hospitalServices.saveRendezVous(rendezVous1);

        Consultation consultation = Consultation.builder()
                .consultationDate(new Date()).rendezVous(rendezVous1).rapport("rapport...").build();
        hospitalServices.saveConsultation(consultation);

    }
}
