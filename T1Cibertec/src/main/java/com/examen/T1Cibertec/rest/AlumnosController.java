package com.examen.T1Cibertec.rest;

import com.examen.T1Cibertec.model.Alumnos;
import com.examen.T1Cibertec.services.IAlumnosServices;
import com.examen.T1Cibertec.services.Impl.AlumnosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AlumnosController {

    IAlumnosServices alumnosServices;
    @Autowired
    public AlumnosController(IAlumnosServices alumnosServices) {this.alumnosServices = alumnosServices;}

    @GetMapping("/alumnos")
    public List<Alumnos> getAll(){
    return alumnosServices.GetallAlumnos();
    }

    @GetMapping("/alumnos/{id}")
    public Alumnos getAll(@PathVariable int id){
        return alumnosServices.FindAlumnosById(id);
    }

    @PostMapping("/alumno")
    public Alumnos saveAlumnos(Alumnos entity)
    {
        return alumnosServices.SaveAlumnos(entity);
    }
    
}
