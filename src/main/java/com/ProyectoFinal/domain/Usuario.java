
package com.ProyectoFinal.domain;

import lombok.Data;

@Data
public class Usuario {
    private String nombre;
    private String apellidos;
    private String contraseña;
    private String ciudad;
    private String condigoPostal;
    private String foto; 

    public Usuario() {
    }

    public Usuario(String nombre, String apellidos, String contraseña, String ciudad, String condigoPostal, String foto) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.contraseña = contraseña;
        this.ciudad = ciudad;
        this.condigoPostal = condigoPostal;
        this.foto = foto;
    }
    



    
    
    
    
    
    
    
}
