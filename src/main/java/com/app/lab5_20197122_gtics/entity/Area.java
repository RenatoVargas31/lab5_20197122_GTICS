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
@Table(name = "areas")
public class Area {
    @Id
    @Column(name = "idAreas", nullable = false)
    private Integer id;

    @Column(name = "nombreArea", nullable = false, length = 45)
    private String nombreArea;

}