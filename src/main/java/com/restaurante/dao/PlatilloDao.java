package com.restaurante.dao;

import com.restaurante.domain.Platillo;
import org.springframework.data.repository.CrudRepository;

public interface PlatilloDao extends CrudRepository<Platillo, Long> {

}
