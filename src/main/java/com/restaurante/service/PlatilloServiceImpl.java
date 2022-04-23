package com.restaurante.service;

import com.restaurante.domain.Platillo;
import java.util.List;
import com.restaurante.dao.PlatilloDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PlatilloServiceImpl implements PlatilloService {

    @Autowired
    private PlatilloDao platilloDao;

    @Override
    @Transactional(readOnly = true)
    public List<Platillo> getPlatillos(boolean activos) {
        var lista = (List<Platillo>) platilloDao.findAll();

        return lista;
    }

    @Override
    @Transactional
    public void save(Platillo platillo) {
        platilloDao.save(platillo);
    }

    @Override
    @Transactional
    public void delete(Platillo platillo) {
        platilloDao.delete(platillo);
    }

    @Override
    @Transactional(readOnly = true)
    public Platillo getPlatillo(Platillo platillo) {
        return platilloDao.findById(platillo.getId_platillo()).orElse(null);
    }

}
