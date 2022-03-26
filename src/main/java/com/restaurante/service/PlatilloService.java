package com.restaurante.service;

import com.restaurante.domain.Platillo;
import java.util.List;

public interface PlatilloService {

    public List<Platillo> getPlatillos(boolean activos);

    public void save(Platillo platillo);

    public void delete(Platillo platillo);

    public Platillo getPlatillo(Platillo platillo);
}
