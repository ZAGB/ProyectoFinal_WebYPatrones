
package com.ProyectoFinal.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class CotizarController {
    @GetMapping("/cotizar/cotizarInf")
    public String Cotizar(){
    return "/cotizar/cotizarInf";
    } 
    @GetMapping("/cotizar/transporteCotizar")
    public String TransporteCotizar(){
    return "/cotizar/transporteCotizar";
    } 
}
