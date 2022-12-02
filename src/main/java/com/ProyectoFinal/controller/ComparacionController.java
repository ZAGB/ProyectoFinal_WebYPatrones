
package com.ProyectoFinal.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@Slf4j
public class ComparacionController {

    @GetMapping("/comparacion/comparacionTransporte")
    public String Comparacion(){
    return "/comparacion/comparacionTransporte";   
    }
    @GetMapping("/comparacion/comparacionTransporte_1")
    public String ComparacionTransporte(){
    return "/comparacion/comparacionTransporte_1";   
    }
}
