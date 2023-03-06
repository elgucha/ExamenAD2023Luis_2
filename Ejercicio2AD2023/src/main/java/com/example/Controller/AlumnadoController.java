/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Controller;

/**
 *
 * @author LuisGutiérrezChamizo
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.proyecto.modelo.Alumno;
import com.example.proyecto.servicio.AlumnadoServicio;

@RestController
@RequestMapping("/alumnado")
public class AlumnadoController {

    @Autowired
    private AlumnadoServicio servicio;

    @GetMapping("/")
    public ResponseEntity<List<Alumno>> obtenerAlumnos() {
        List<Alumno> alumnos = servicio.obtenerTodosLosAlumnos();
        return new ResponseEntity<>(alumnos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Alumno> obtenerAlumnoPorId(@PathVariable("id") int id) {
        Alumno alumno = servicio.obtenerAlumnoPorId(id);
        return new ResponseEntity<>(alumno, HttpStatus.OK);
    }

    @GetMapping("/suspensos/{modulo}")
    public ResponseEntity<List<Alumno>> obtenerAlumnosSuspensosPorModulo(@PathVariable("modulo") String modulo) {
        List<Alumno> alumnosSuspensos = servicio.obtenerAlumnosSuspensosPorModulo(modulo);
        return new ResponseEntity<>(alumnosSuspensos, HttpStatus.OK);
    }

}