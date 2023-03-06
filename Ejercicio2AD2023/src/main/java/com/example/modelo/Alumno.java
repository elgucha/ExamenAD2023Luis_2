/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.modelo;

/**
 *
 * @author LuisGutiérrezChamizo
 */
package com.example.proyecto.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Alumno {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank
    private String nombre;
    
    @NotBlank
    private String telefono;
    
    @NotBlank
    private String email;
    
    @NotNull
    private Double ad;
    
    @NotNull
    private Double di;
    
    // Constructor vacío
    public Alumno() {}
    
    // Constructor con parámetros
    public Alumno(String nombre, String telefono, String email, Double ad, Double di) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.ad = ad;
        this.di = di;
    }
    
    // Getters y setters
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getTelefono() {
        return telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public Double getAd() {
        return ad;
    }
    
    public void setAd(Double ad) {
        this.ad = ad;
    }
    
    public Double getDi() {
        return di;
    }
    
    public void setDi(Double di) {
        this.di = di;
    }
}