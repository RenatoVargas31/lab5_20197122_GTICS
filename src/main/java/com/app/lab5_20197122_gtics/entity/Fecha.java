package com.app.lab5_20197122_gtics.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "fechas")
public class Fecha {
    @EmbeddedId
    private FechaId id;

    @Column(name = "fechaDisponibilidad", nullable = false)
    private LocalDate fechaDisponibilidad;

}
