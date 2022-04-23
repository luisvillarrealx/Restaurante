package com.restaurante.service;

import com.restaurante.dao.MesaDao;
import com.restaurante.domain.Mesa;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MesaServiceImpl implements MesaService {

    @Autowired
    private MesaDao mesaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Mesa> getMesas(boolean activos) {
        var lista = (List<Mesa>) mesaDao.findAll();

        if (activos) {
            lista.removeIf(e -> !e.isOcupada());
        }

        return lista;
    }

    @Override
    @Transactional
    public void save(Mesa mesa) {
        mesaDao.save(mesa);
    }

    @Override
    @Transactional
    public void delete(Mesa mesa) {
        mesaDao.delete(mesa);
    }

    @Override
    @Transactional(readOnly = true)
    public Mesa getMesa(Mesa mesa) {
        return mesaDao.findById(mesa.getId_mesa()).orElse(null);
    }

}
