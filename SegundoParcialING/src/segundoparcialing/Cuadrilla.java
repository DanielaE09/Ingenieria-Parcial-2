/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundoparcialing;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus X515EA
 */
public class Cuadrilla {
    
    private int nroCuadrilla;
    private int cantTrabajadores;
    private String equipamiento;
    private String materiales;
    private List<Trabajador> listaTrabajadores;

    public Cuadrilla(int nroCuadrilla, String equipamiento, String materiales) {
        this.nroCuadrilla = nroCuadrilla;
        this.equipamiento = equipamiento;
        this.materiales = materiales;
        this.listaTrabajadores = new ArrayList<>();
        this.cantTrabajadores = 0;
    }
    
    public void agregarTrabajador(Trabajador t){
        this.listaTrabajadores.add(t);
        t.setEstado(false); //pasa a estar ocupado una vez agregado
        this.cantTrabajadores = this.listaTrabajadores.size();
        
    }

    public int getNroCuadrilla() {
        return nroCuadrilla;
    }

    public void setNroCuadrilla(int nroCuadrilla) {
        this.nroCuadrilla = nroCuadrilla;
    }

    public int getCantTrabajadores() {
        return cantTrabajadores;
    }

    public void setCantTrabajadores(int cantTrabajadores) {
        this.cantTrabajadores = cantTrabajadores;
    }

    public String getEquipamiento() {
        return equipamiento;
    }

    public void setEquipamiento(String equipamiento) {
        this.equipamiento = equipamiento;
    }

    public String getMateriales() {
        return materiales;
    }

    public void setMateriales(String materiales) {
        this.materiales = materiales;
    }

    public List<Trabajador> getListaTrabajadores() {
        return listaTrabajadores;
    }

    public void setListaTrabajadores(List<Trabajador> listaTrabajadores) {
        this.listaTrabajadores = listaTrabajadores;
    }
    
    
    
    
    
    
}
