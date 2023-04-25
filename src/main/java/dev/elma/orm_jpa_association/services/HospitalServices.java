package dev.elma.orm_jpa_association.services;

import dev.elma.orm_jpa_association.entities.Consultation;
import dev.elma.orm_jpa_association.entities.Medecin;
import dev.elma.orm_jpa_association.entities.Patient;
import dev.elma.orm_jpa_association.entities.RendezVous;
import dev.elma.orm_jpa_association.repositories.ConsultationRepository;
import dev.elma.orm_jpa_association.repositories.MedecinRepository;
import dev.elma.orm_jpa_association.repositories.PatientRepository;
import dev.elma.orm_jpa_association.repositories.RendezVousRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class HospitalServices implements IHospitalServices{
    private PatientRepository patientRepository;
    private MedecinRepository medecinRepository;
    private RendezVousRepository rendezVousRepository;
    private ConsultationRepository consultationRepository;
    @Override
    public Patient savePatient(Patient p) {

        return patientRepository.save(p);
    }

    @Override
    public Medecin saveMedecin(Medecin m) {
        return medecinRepository.save(m);
    }

    @Override
    public RendezVous saveRendezVous(RendezVous r) {
        return rendezVousRepository.save(r);
    }

    @Override
    public Consultation saveConsultation(Consultation c) {
        return consultationRepository.save(c);
    }
}
