package dev.elma.orm_jpa_association.repositories;

import dev.elma.orm_jpa_association.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
}
