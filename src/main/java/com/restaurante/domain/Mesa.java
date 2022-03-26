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
@Table(name = "mesa")
public class Mesa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mesa")
    private String id_mesa;
    private String cant_personas;
    private String estado;  // boolean ocupada
    private String factura;

    public Mesa() {
    }

    public Mesa(String id_mesa, String cant_personas, String factura) {
        this.id_mesa = id_mesa;
        this.cant_personas = cant_personas;
        this.factura = factura;
    }
}
