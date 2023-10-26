

package com.tienda_v1.service.impl;

import com.tienda_v1.CategoriaService;
import com.tienda_v1.dao.CategoriaDao;
import com.tienda_v1.domian.Categoria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl extends CategoriaService{
    
    
    @Autowired //la anotacion autowired crea un unico objeto mientras se ejecuta la app
    private CategoriaDao categoriaDao;
    public List<Categoria> getCategorias(boolean activos){
        
        var lista=categoriaDao.findAll();
        
        if(activos){
            lista.removeIf(e-> !e.isActivo());
        }
        return lista;
        
    }
    
}
