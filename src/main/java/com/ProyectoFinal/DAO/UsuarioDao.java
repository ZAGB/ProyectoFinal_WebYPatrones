
package com.ProyectoFinal.DAO;

import com.ProyectoFinal.domain.Usuario;
import org.springframework.data.repository.CrudRepository;



public interface UsuarioDao extends CrudRepository<Usuario, Long>{
    
}
