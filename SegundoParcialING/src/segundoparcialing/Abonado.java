/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundoparcialing;

/**
 *
 * @author Asus X515EA
 */
public class Abonado {
    private String dni;
    private String nombre;
    private String mail;
    private int contraseña;

    public Abonado() {
    }

    public Abonado(String dni, String nombre, String mail, int contraseña) {
        this.dni = dni;
        this.nombre = nombre;
        this.mail = mail;
        this.contraseña = contraseña;
    }
    
    
    public boolean validarIngreso(int password){
        return this.contraseña == password;
    }
    
    public void cambioContraseña(String newPassword){
        this.contraseña = Integer.parseInt(newPassword);
    }
    
    public void delay(int mili){
        try{
            Thread.sleep(mili);
        }catch(InterruptedException e){
            System.err.println("Retraso de " + mili + "milisegundos");
        }
    }
    
    public boolean abonadosDiferentes(Abonado c2){
        if(c2 == null)
            return true;
        
        return !this.dni.equals(c2.getDni());
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }
    
    
    
    
    
    
    
}
