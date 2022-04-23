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
@Table(name = "proveedor")
public class Proveedor implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proveedor")

    private Long id_proveedor;
    //private String nombre;
    //private String estado;

    public Proveedor() {
    }

    public Proveedor(Long id_proveedor) {
        this.id_proveedor = id_proveedor;
        //this.nombre = nombre;
        //this.estado = estado;
    }

}
