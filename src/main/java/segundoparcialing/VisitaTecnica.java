/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundoparcialing;

import java.util.Date;

/**
 *
 * @author Asus X515EA
 */
public class VisitaTecnica {
    
    
    private int nroVisita;
    private Date fechaCreacion;
    private Date fechaReparacion = null;
    private String observaciones;
    private SolicitudArreglo solicitudAsociada;
    private Cuadrilla cuadrillaAsignada;
    
    public VisitaTecnica(int nroVisita, SolicitudArreglo solicitud){
        this.nroVisita = nroVisita;
        this.fechaCreacion = new Date();
        this.solicitudAsociada = solicitud;
    }

    public int getNroVisita() {
        return nroVisita;
    }

    public void setNroVisita(int nroVisita) {
        this.nroVisita = nroVisita;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaReparacion() {
        return fechaReparacion;
    }

    public void setFechaReparacion(Date fechaReparacion) {
        this.fechaReparacion = fechaReparacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public SolicitudArreglo getSolicitudAsociada() {
        return solicitudAsociada;
    }

    public void setSolicitudAsociada(SolicitudArreglo solicitudAsociada) {
        this.solicitudAsociada = solicitudAsociada;
    }

    public Cuadrilla getCuadrillaAsignada() {
        return cuadrillaAsignada;
    }

    public void setCuadrillaAsignada(Cuadrilla cuadrillaAsignada) {
        this.cuadrillaAsignada = cuadrillaAsignada;
    }
    
    
    
    
}
