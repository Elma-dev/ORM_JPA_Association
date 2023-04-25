package dev.elma.orm_jpa_association.services;

import dev.elma.orm_jpa_association.entities.Consultation;
import dev.elma.orm_jpa_association.entities.Medecin;
import dev.elma.orm_jpa_association.entities.Patient;
import dev.elma.orm_jpa_association.entities.RendezVous;

import java.util.List;

public interface IHospitalServices {
    Patient savePatient(Patient p);
    Medecin saveMedecin(Medecin m);
    RendezVous saveRendezVous(RendezVous r);
    Consultation saveConsultation(Consultation c);
    List<Patient> getAllPatient();
    List<Medecin> getAllMedecin();
    List<RendezVous> getAllRendezVous();
    List<Consultation> getAllConsultations();
}
