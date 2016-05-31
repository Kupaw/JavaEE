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
public class Usuario {
    private int usuario_id;
    private String nombre;
    private String apepat;
    private String apemat;
    private int ciudad_id;
    private String estado;
    Coneccion con;
    
    public Usuario(){
        con = new Coneccion();
    }
    
    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApepat() {
        return apepat;
    }

    public void setApepat(String apepat) {
        this.apepat = apepat;
    }

    public String getApemat() {
        return apemat;
    }

    public void setApemat(String apemat) {
        this.apemat = apemat;
    }

    public int getCiudad_id() {
        return ciudad_id;
    }

    public void setCiudad_id(int ciudad_id) {
        this.ciudad_id = ciudad_id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public void insertUsuario(){
        con.setInsertar("insert into Usuarios(nombre,apepat,apemat,ciudad_id,estado) " + 
                "values('" + this.getNombre() + "','" + this.getApepat() + "','" + this.getApemat() + "','" + this.getCiudad_id() + "','Activo')");
    }
    public void deleteUsuario(){
        con.setInsertar("update Usuarios set estado='Pasivo' where usuario_id = '" + this.getUsuario_id() + "'");
    }
    public void updateUsuario(){
        con.setInsertar("update Usuarios set nombre='" + this.getNombre() + "', apepat='" + this.getApepat() + "', apemat='" + this.getApemat() + "',ciudad_id='" + this.getCiudad_id() + "' where usuario_id ='" + this.getUsuario_id() + "'");
    }
    
}
