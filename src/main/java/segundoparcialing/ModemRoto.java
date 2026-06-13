/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundoparcialing;

/**
 *
 * @author Asus X515EA
 */
public class ModemRoto {
    private int idModem;
    private String tamaño;
    private String barrio;
    private int prioridadUrgencia;
    private String estado = "sin reparar";
    private Esquina ubicacion;

    public ModemRoto(int idModem, String tamaño, String calleA, String calleB, int altura, String barrio, int prioridadUrgencia) {
        this.idModem = idModem;
        this.tamaño = tamaño;
        this.barrio = barrio;
        this.prioridadUrgencia = prioridadUrgencia;
        this.ubicacion = new Esquina(calleA, calleB, altura);
    }
    
    public int getIdModem(){
    return idModem;
    }
    public String getEstado(){
        return estado;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    public int getPrioridadUrgencia(){
        return prioridadUrgencia;
    }
    public void setPrioridadUrgencia(int prioridad){
        if(prioridad >= 1 && prioridad <= 5){
            this.prioridadUrgencia = prioridad;
        }else{
            this.prioridadUrgencia = 5;
        }
    }
    
    public Esquina getUbicacion(){
        return ubicacion;
    }
    
    public String getBarrio(){
        return barrio;
    }
    
    public String getTamaño(){
        return tamaño;
    }
    
    
}
