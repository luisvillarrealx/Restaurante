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

    private String id_mesero;
    private String nombre;
    private String estado;

    public Mesero() {
    }

    public Mesero(String id_mesero, String nombre, String estado) {
        this.id_mesero = id_mesero;
        this.nombre = nombre;
        this.estado = estado;
    }

    
    
}
