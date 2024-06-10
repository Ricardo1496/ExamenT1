package com.examen.T1Cibertec.repository;

import com.examen.T1Cibertec.model.Alumnos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAlumnosRepository extends JpaRepository<Alumnos, Integer> {



}
