
package com.ProyectoFinal.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class UsuarioController {
    
    @GetMapping("/usuario/loginUsuario")
    public String Ingresar(){
    return "/usuario/loginUsuario";
    } 
    
    @GetMapping("/usuario/cuentaUsuario")
    public String PerfilUsuario(){
    return "/usuario/cuentaUsuario";
    } 
    
    @GetMapping("/usuario/formularioRegistroUsuario")
    public String RegistrarOModificar(){
    return "/usuario/formularioRegistroUsuario";
    } 
    
}
