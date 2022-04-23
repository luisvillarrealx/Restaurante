package com.restaurante.dao;

import com.restaurante.domain.Mesa;
import org.springframework.data.repository.CrudRepository;

public interface MesaDao extends CrudRepository<Mesa, Long>{
    
}
