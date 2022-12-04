
package com.ProyectoFinal.controller;


import com.ProyectoFinal.DAO.UsuarioDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class UsuarioController {
    
    @Autowired
    private UsuarioDao usuarioDao;
    
    @GetMapping("/usuario/loginUsuario")
    public String Ingresar(Model model){
        log.info("Estamos usando arquitectura MVC");
        
        var usuarios =usuarioDao.findAll();
        model.addAttribute("usarios", usuarios);
  
    return "/usuario/loginUsuario";
    } 
    
    @GetMapping("/usuario/cuentaUsuario")
    public String PerfilUsuario(Model model){
        log.info("Estamos usando arquitectura MVC");
        
        var usuarios =usuarioDao.findAll();
        model.addAttribute("usarios", usuarios);
        
    return "/usuario/cuentaUsuario";
    } 
    
    @GetMapping("/usuario/formularioRegistroUsuario")
    public String RegistrarOModificar(Model model){
        log.info("Estamos usando arquitectura MVC");
        
        var usuarios =usuarioDao.findAll();
        model.addAttribute("usarios", usuarios);
    return "/usuario/formularioRegistroUsuario";
    } 
    
}
