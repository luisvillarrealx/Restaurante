package com.restaurante.dao;

import com.restaurante.domain.Proveedor;
import org.springframework.data.repository.CrudRepository;

public interface ProveedorDao extends CrudRepository<Proveedor, Long> {
    
}
