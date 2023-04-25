package dev.elma.orm_jpa_association.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Medecin {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String speciality;
    private String email;
    @OneToMany(mappedBy = "medecin",fetch = FetchType.LAZY)
    private Collection<RendezVous> rendezVousCollection;
}
