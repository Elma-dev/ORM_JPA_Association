package dev.elma.orm_jpa_association.entities;

import java.util.Collection;

public class Medecin {
    private Long id;
    private String name;
    private String speciality;
    private String email;
    private Collection<RendezVous> rendezVousCollection;
}
