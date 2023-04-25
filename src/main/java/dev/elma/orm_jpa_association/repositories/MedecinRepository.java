package dev.elma.orm_jpa_association.repositories;

import dev.elma.orm_jpa_association.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin,Long> {
}
