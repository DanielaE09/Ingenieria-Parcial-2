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
public class SolicitudArreglo {
    private int codInforme;
    private Date fechaInforme;
    private String problema;
    private int codUrgencia;
    private String pedidoVisita = null;
    private ModemRoto modemAsociado;
    private Abonado abonadoInformante;

    public SolicitudArreglo(int codInforme, String problema, int codUrgencia, ModemRoto modemAsociado, Abonado abonadoInformante) {
        this.codInforme = codInforme;
        this.fechaInforme = new Date();
        this.problema = problema;
        this.codUrgencia = codUrgencia;
        this.modemAsociado = modemAsociado;
        this.abonadoInformante = abonadoInformante;
    }

    public int getCodInforme() {
        return codInforme;
    }

    public void setCodInforme(int codInforme) {
        this.codInforme = codInforme;
    }

    public Date getFechaInforme() {
        return fechaInforme;
    }

    public void setFechaInforme(Date fechaInforme) {
        this.fechaInforme = fechaInforme;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public int getCodUrgencia() {
        return codUrgencia;
    }

    public void setCodUrgencia(int codUrgencia) {
        this.codUrgencia = codUrgencia;
    }

    public String getPedidoVisita() {
        return pedidoVisita;
    }

    public void setPedidoVisita(String pedidoVisita) {
        this.pedidoVisita = pedidoVisita;
    }

    public ModemRoto getModemAsociado() {
        return modemAsociado;
    }

    public void setModemAsociado(ModemRoto modemAsociado) {
        this.modemAsociado = modemAsociado;
    }

    public Abonado getAbonadoInformante() {
        return abonadoInformante;
    }

    public void setAbonadoInformante(Abonado abonadoInformante) {
        this.abonadoInformante = abonadoInformante;
    }
    
    
    
    
}
