package dev.elma.orm_jpa_association.repositories;

import dev.elma.orm_jpa_association.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {
}
