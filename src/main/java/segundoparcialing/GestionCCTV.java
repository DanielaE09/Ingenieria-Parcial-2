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
public class GestionCCTV {
    
    private List<Abonado> listaAbonados = new ArrayList<>();
    private List<ModemRoto> listaModemsRotos = new ArrayList<>();
    private List<SolicitudArreglo> listaSolicitudes = new ArrayList<>();
    private List<VisitaTecnica> listaVisitasTecnicas = new ArrayList<>();
    private List<Cuadrilla> listaCuadrillas = new ArrayList<>();
    private List<Trabajador> listaTrabajadores = new ArrayList<>();

    public GestionCCTV() {
    }
    
    
    public void registrarAbonado(Abonado a){
        listaAbonados.add(a);
    }
    
    public void registrarModemRoto(ModemRoto m){
        listaModemsRotos.add(m);
    }
    
    public void registrarCuadrilla(Cuadrilla c){
        listaCuadrillas.add(c);
    }
    
    public Abonado buscarAbonado(String dni){
        for(Abonado a : listaAbonados){
            if(a.getDni().equals(dni)) return a;
        }
        return null;
    }
    
    public SolicitudArreglo procesarDenunciaModem(String dniAbonado, int idModem, String problema,int urgencia, String nombreAux, String mailAux){
        Abonado ab = buscarAbonado(dniAbonado);
        if( ab == null){
            ab = new Abonado(dniAbonado, nombreAux, mailAux, 1234);
            registrarAbonado(ab);
            
        }
        
        for (SolicitudArreglo sol : listaSolicitudes){
            if(sol.getModemAsociado().getIdModem() == idModem && sol.getModemAsociado().getEstado().equals("sin reparar")){
                return sol;
            }
        }
        
        ModemRoto modem = null;
        for(ModemRoto m : listaModemsRotos){
            if(m.getIdModem() == idModem){
                modem = m;
                break;
            }
        }
        if (modem == null){
            modem = new ModemRoto(idModem, "Estándar", "Perito Moreno","Maximiliano Gomez" , 150, "Centro", urgencia);
            registrarModemRoto(modem);
        
    }
     int nuevoCodigoInforme = listaSolicitudes.size() + 1;
    SolicitudArreglo nuevaSol = new SolicitudArreglo(nuevoCodigoInforme, problema, urgencia, modem, ab);
    listaSolicitudes.add(nuevaSol);
    return nuevaSol;
}
    
    public void informesPorAbonado(String dni){
        System.out.println("Informes del abonado con DNI: " + dni);
    }
    
    public List<Cuadrilla> informeCuadrrillaOciosas(){
        List<Cuadrilla> ociosas = new ArrayList<>();
        for(Cuadrilla c : listaCuadrillas){
            boolean asignadaActiva = false;
            for(VisitaTecnica v : listaVisitasTecnicas){
                if(v.getCuadrillaAsignada() != null && v.getCuadrillaAsignada().getNroCuadrilla() == c.getNroCuadrilla() && v.getFechaReparacion() == null){
                    asignadaActiva = true;
                    break;
                }
            }
            if(!asignadaActiva){
                ociosas.add(c);
            }
        }
            return ociosas;
        }
        
        
        public List<VisitaTecnica> pedidosPorCuadrilla(int nroCuadrilla){
            List<VisitaTecnica> aux = new ArrayList<>();
            for(VisitaTecnica v : listaVisitasTecnicas){
                if(v.getCuadrillaAsignada() != null && v.getCuadrillaAsignada().getNroCuadrilla() == nroCuadrilla){
                    aux.add(v);
                }
            }
            return aux;
        }
        
        public List<ModemRoto> modemsRotosSinReparar(){
            List<ModemRoto> aux = new ArrayList<>();
            for(ModemRoto m : listaModemsRotos){
                if (m.getEstado().equals("sin reparar")){
                    aux.add(m);
                }
            }
                return aux;
            }
            
            public List<Trabajador> trabajadoresPorCuadrilla(int nroCuadrilla){
                for (Cuadrilla c : listaCuadrillas){
                    if(c.getNroCuadrilla() == nroCuadrilla){
                        return c.getListaTrabajadores();
                    }
                }
                return new ArrayList<>();
            }
            
            public List<SolicitudArreglo> getSolicitudArreglos(){
                return listaSolicitudes;
            }
            public List<Abonado> getListaAbonados(){
                return listaAbonados;
            }
            
            public List<ModemRoto> getListaModemRotos(){
                return listaModemsRotos;
            }
        }
    
    

