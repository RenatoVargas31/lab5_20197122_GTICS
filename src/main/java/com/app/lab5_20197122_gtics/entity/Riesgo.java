package com.app.lab5_20197122_gtics.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "riesgos")
public class Riesgo {
    @Id
    @Column(name = "idRiesgos", nullable = false)
    private Integer id;

    @Column(name = "Bajo", nullable = false)
    private Integer bajo;

    @Column(name = "Moderado", nullable = false)
    private Integer moderado;

    @Column(name = "Alto", nullable = false)
    private Integer alto;

    @Column(name = "`Muy Alto`", nullable = false)
    private Integer muyAlto;

}