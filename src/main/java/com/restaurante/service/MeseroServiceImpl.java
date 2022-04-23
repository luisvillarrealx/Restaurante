package com.restaurante.service;

import com.restaurante.domain.Mesero;
import java.util.List;
import com.restaurante.dao.MeseroDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MeseroServiceImpl implements MeseroService {

    @Autowired
    private MeseroDao meseroDao;

    @Override
    @Transactional(readOnly = true)
    public List<Mesero> getMeseros(boolean activos) {
        var lista = (List<Mesero>) meseroDao.findAll();

        return lista;
    }

    @Override
    @Transactional
    public void save(Mesero mesero) {
        meseroDao.save(mesero);
    }

    @Override
    public void delete(Mesero mesero) {
        meseroDao.delete(mesero);
    }

    @Override
    @Transactional(readOnly = true)
    public Mesero getMesero(Mesero mesero) {
        return meseroDao.findById(mesero.getId_mesero()).orElse(null);
    }
}
