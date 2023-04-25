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
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service @Transactional
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

    @Override
    public List<Patient> getAllPatient() {
        return patientRepository.findAll();
    }

    @Override
    public List<Medecin> getAllMedecin() {
        return medecinRepository.findAll();
    }

    @Override
    public List<RendezVous> getAllRendezVous() {
        return rendezVousRepository.findAll();
    }

    @Override
    public List<Consultation> getAllConsultations() {
        return consultationRepository.findAll();
    }

    public Patient findPatient(String name){
        return patientRepository.findPatientByName(name);
    }
    public Medecin findMedecin(String name){
        return medecinRepository.findMedecinByName(name);
    }


}
