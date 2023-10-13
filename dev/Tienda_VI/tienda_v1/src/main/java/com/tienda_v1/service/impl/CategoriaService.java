

package com.tienda_v1.service.impl;

import com.tienda_v1.domian.Categoria;
import java.util.List;

public interface CategoriaService {
    //se declara un metodo para obtener un arraylist de objetos categoria
    // Estos objetos vienen de la base de datos, todos los registros
    
    
    public List<Categoria> getCategorias(boolean activos);
    
    //Aqui se colocaran los metodos para hacer el CRUD de categorias
    
}
