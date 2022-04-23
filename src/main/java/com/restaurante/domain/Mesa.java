package com.restaurante.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "mesa")
public class Mesa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mesa")
    private Long id_mesa;
    private String cant_personas;
    private boolean ocupada;
    private String factura;

    public Mesa() {
    }

    public Mesa(Long id_mesa, String cant_personas, String factura, boolean ocupada) {
        this.id_mesa = id_mesa;
        this.cant_personas = cant_personas;
        this.factura = factura;
        this.ocupada = ocupada;
    }
}
