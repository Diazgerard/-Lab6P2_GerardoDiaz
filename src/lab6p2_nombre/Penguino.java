/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_nombre;

import java.util.ArrayList;

/**
 *
 * @author gerar
 */
public class Penguino {
    private String usuario;
    private String contrasenia;
    private String socio;
    private Object dinero;
//    ArrayList<Item> item  = new ArrayList();
//    ArrayList<Casa> casa  = new ArrayList();

    public Penguino() {
    }

    public Penguino(String usuario, String contrasenia, String socio, Object dinero) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.socio = socio;
        this.dinero = dinero;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getSocio() {
        return socio;
    }

    public void setSocio(String socio) {
        this.socio = socio;
    }

    public Object getDinero() {
        return dinero;
    }

    public void setDinero(Object dinero) {
        this.dinero = dinero;
    }

//    public ArrayList<Item> getItem() {
//        return item;
//    }
//
//    public void setItem(ArrayList<Item> item) {
//        this.item = item;
//    }
//
//    public ArrayList<Casa> getCasa() {
//        return casa;
//    }
//
//    public void setCasa(ArrayList<Casa> casa) {
//        this.casa = casa;
//    }
    
    
}
