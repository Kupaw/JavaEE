/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import accesodato.Coneccion;

/**
 *
 * @author Administrador
 */
public class Ciudad {
    private int ciudad_id;
    private String nombre;
    private String estado;
    Coneccion con;
    
    public Ciudad(){
        con = new Coneccion();
    }
    
    public int getCiudad_id() {
        return ciudad_id;
    }

    public void setCiudad_id(int ciudad_id) {
        this.ciudad_id = ciudad_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public void insertCiudad(){
        con.setInsertar("insert into Ciudades(nombre,estado) " + 
                "values('" + this.nombre + "','Activo')");
    }
    public void deleteCiudad(){
        
    }
    public void updateCiudad(){
        
    }
    
}
