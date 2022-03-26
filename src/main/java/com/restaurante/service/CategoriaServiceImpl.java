package com.restaurante.service;

import com.restaurante.dao.CategoriaDao;
import com.restaurante.domain.Categoria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

public class CategoriaServiceImpl implements CategoriaService{
    
        @Autowired
    private CategoriaDao categoriaDao;
        
     /*      @Override
    @Transactional(readOnly = true)
    public List<Categoria> getCategorias(boolean activos) {
        var lista = (List<Categoria>) categoriaDao.findAll();
        
        /*if(activos) { lista.removeIf( e -> !e.isActivo()); }
        
        return lista;*/

    @Override
    public List<Categoria> getCategorias(boolean activos) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void save(Categoria categoria) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(Categoria categoria) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Categoria getCategoria(Categoria categoria) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    }




