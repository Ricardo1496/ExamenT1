package com.examen.T1Cibertec.services;

import com.examen.T1Cibertec.model.Alumnos;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IAlumnosServices {
    List<Alumnos> GetallAlumnos();
    Alumnos FindAlumnosById(int id);
    Alumnos SaveAlumnos(Alumnos entity);

    }
