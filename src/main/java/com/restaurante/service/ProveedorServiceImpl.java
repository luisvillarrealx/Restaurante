package com.restaurante.service;

import com.restaurante.domain.Proveedor;
import java.util.List;
import com.restaurante.dao.ProveedorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProveedorServiceImpl implements ProveedorService {

    @Autowired
    private ProveedorDao proveedorDao;

    @Override
    @Transactional(readOnly = true)
    public List<Proveedor> getProveedores() {
        var lista = (List<Proveedor>) proveedorDao.findAll();

        return lista;
    }

    @Override
    @Transactional
    public void save(Proveedor proveedor) {
        proveedorDao.save(proveedor);
    }

    @Override
    @Transactional
    public void delete(Proveedor proveedor) {
        proveedorDao.delete(proveedor);
    }

    @Override
    @Transactional(readOnly = true)
    public Proveedor getProveedor(Proveedor proveedor) {
        return proveedorDao.findById(proveedor.getId_proveedor()).orElse(null);
    }
    
    
}
