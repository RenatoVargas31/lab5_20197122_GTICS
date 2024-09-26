package com.app.lab5_20197122_gtics.repository;

import com.app.lab5_20197122_gtics.entity.Fecha;
import com.app.lab5_20197122_gtics.entity.FechaId;
import org.springframework.data.jpa.repository.JpaRepository;

//Llave compuesta
public interface FechaRepository extends JpaRepository<Fecha, FechaId> {
}
