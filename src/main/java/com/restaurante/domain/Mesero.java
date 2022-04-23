package com.restaurante.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import javax.persistence.Table;
import javax.persistence.Entity;

@Data
@Entity
@Table(name = "mesero")
public class Mesero implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mesero")

    private Long id_mesero;
    private String nombre;
    private String apellido;
    private String cedula;
    private String telefono;
    private String correo;


    public Mesero() {
    }

    public Mesero(String nombre, String apellido, String cedula, String telefono, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.telefono = telefono;
        this.correo = correo;
    }



    
    
}
