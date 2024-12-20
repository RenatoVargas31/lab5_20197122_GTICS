package com.app.lab5_20197122_gtics.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.util.Objects;

@Getter
@Setter
@Embeddable
public class FechaId implements java.io.Serializable {

    @Column(name = "idFechas", nullable = false)
    private Integer idFechas;

    @Column(name = "idProfesional", nullable = false)
    private Integer idProfesional;

}