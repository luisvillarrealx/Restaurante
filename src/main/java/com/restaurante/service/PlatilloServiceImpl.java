package com.restaurante.service;

import com.restaurante.domain.Platillo;
import java.util.List;
import com.restaurante.dao.PlatilloDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

public class PlatilloServiceImpl implements PlatilloService{

    @Override
    public List<Platillo> getPlatillos(boolean activos) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void save(Platillo platillo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(Platillo platillo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Platillo getPlatillo(Platillo platillo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
