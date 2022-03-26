package com.restaurante.service;

import com.restaurante.domain.Mesero;
import java.util.List;

public interface MeseroService {

    public List<Mesero> getMeseros(boolean activos);

    public void save(Mesero mesero);

    public void delete(Mesero mesero);

    public Mesero getMesero(Mesero mesero);
}
