package com.examen.T1Cibertec.services.Impl;

import com.examen.T1Cibertec.model.Alumnos;
import com.examen.T1Cibertec.repository.IAlumnosRepository;
import com.examen.T1Cibertec.services.IAlumnosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlumnosServices implements IAlumnosServices {

    IAlumnosRepository _alumnosRepository;

    @Autowired
    public AlumnosServices(IAlumnosRepository alumnosRepository) {

        _alumnosRepository = alumnosRepository;
    }

    @Override
    public List<Alumnos> GetallAlumnos() {
        return _alumnosRepository.findAll();
    }

    @Override
    public Alumnos FindAlumnosById(int id) {

        Optional<Alumnos> busqueda = _alumnosRepository.findById(id);
        if (busqueda.isPresent())
        return busqueda.get();
        else
            return new Alumnos();
    }

    @Override
    public Alumnos SaveAlumnos(Alumnos entity) {
    Alumnos alumnosSaved = _alumnosRepository.save(entity);
        return alumnosSaved;
    }

}
