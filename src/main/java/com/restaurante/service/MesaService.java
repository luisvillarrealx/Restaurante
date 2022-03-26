package com.restaurante.service;

import com.restaurante.domain.Mesa;
import java.util.List;

public interface MesaService {

    public List<Mesa> getMesas(boolean activos);

    public void save(Mesa mesa);

    public void delete(Mesa mesa);

    public Mesa getMesa(Mesa mesa);
}
