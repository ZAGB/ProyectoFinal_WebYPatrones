
package com.ProyectoFinal.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@Slf4j
public class ComparacionController {

     @GetMapping("/comparacion/comparacion")
    public String Comparacion(){
    return "/comparacion/comparacion";   
    }
    
    @GetMapping("/comparacion/comparacionTransporte")
    public String ComparacionTrasnporte(){
    return "/comparacion/comparacionTransporte";   
    }
}
