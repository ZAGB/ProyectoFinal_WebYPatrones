
package com.ProyectoFinal.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class AsesoriaController {
    
    @GetMapping("/asesoria/asesoriaInf")
    public String Asesoria(){
    return "/asesoria/asesoriaInf";
    } 
    
    @GetMapping("/asesoria/informacionTransportes")
    public String InformacionDeTransportes(){
    return "/asesoria/informacionTransportes";
    } 
    
    @GetMapping("/asesoria/aereoInf")
    public String InfomacionA(){
    return "/asesoria/aereoInf";
    } 
    
    @GetMapping("/asesoria/maritimoInf")
    public String InfomacionM(){
    return "/asesoria/maritimoInf";
    } 
    
    @GetMapping("/asesoria/terrestreInf")
    public String InfomacionT(){
    return "/asesoria/terrestreInf";
    } 
    
}

