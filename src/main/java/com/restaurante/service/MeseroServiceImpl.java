package com.restaurante.service;

import com.restaurante.domain.Mesero;
import java.util.List;
import com.restaurante.dao.MeseroDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

public class MeseroServiceImpl implements MeseroService{

    @Override
    public List<Mesero> getMeseros(boolean activos) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void save(Mesero mesero) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(Mesero mesero) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Mesero getMesero(Mesero mesero) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
