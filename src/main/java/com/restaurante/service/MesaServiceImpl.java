package com.restaurante.service;

import com.restaurante.domain.Mesa;
import java.util.List;
import com.restaurante.dao.MesaDao;
import com.restaurante.domain.Mesa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

public class MesaServiceImpl implements MesaService{

    @Override
    public List<Mesa> getMesas(boolean activos) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void save(Mesa mesa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(Mesa mesa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Mesa getMesa(Mesa mesa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
