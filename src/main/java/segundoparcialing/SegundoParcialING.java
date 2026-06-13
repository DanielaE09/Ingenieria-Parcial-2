/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package segundoparcialing;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus X515EA
 */
public class SegundoParcialING {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        GestionCCTV sistema = new GestionCCTV();
        
        boolean arroba = false;
        boolean punto = false;
        
        String mail = JOptionPane.showInputDialog("Ingrese su mail por favor: ");
        
        for (int i = 0; i < mail.length(); i++) {
            if (mail.charAt(i) == '@') {
                arroba = true;
            }
            if (mail.charAt(i) == '.') {
                punto = true;
            }
        }

        // Muestra el cartel en la consola de NetBeans
        if (arroba == true && punto == true) {
            System.out.println("El mail ingresado es correcto");
        } else {
            System.out.println("El mail ingresado es incorrecto");
        }
    }
    }
    

