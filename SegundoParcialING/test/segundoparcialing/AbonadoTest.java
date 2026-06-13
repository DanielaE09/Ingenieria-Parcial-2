/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package segundoparcialing;

import java.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AbonadoTest {
    
    private static Abonado ciu;
    private static int numeroTest = 0;
    
    
    public AbonadoTest() {
    }
    
    @BeforeClass
    public static void antesDeTodo() {
        ciu = new Abonado("Anonimus", "Daniela Mestre", "daniela@gmail.com", 1212);
        System.out.println("INGRESO de abonado del bien");
    }
    
    @AfterClass
    public static void despuesDeTodo() {
        LocalDate fechaAyer = LocalDate.now().minusDays(1);
        System.out.println(fechaAyer + "Modem rotos reparados, Abonadoes Felices");
    }
    
    @Before
    public void setUp() {
        numeroTest++;
        System.out.println("--------------------------------------------");
        System.out.println("Iniciando método de Test N°: " + numeroTest);
    }
    
    @After
    public void tearDown() {
        System.out.println("--------------------------------------------");
    }

 
    @Test
    public void testValidarUsr() {
        System.out.println("validarUsr");
        boolean result = ciu.validarIngreso(123456);
        assertTrue("La prueba debe FALLAR de forma intencional", result);
      
    }

   
    @Test
    public void testValidarEmail() {
       System.out.println("ValidarEmail");
       String email = "inge@software.com";
       
       boolean tieneArroba = email.contains("@");
       boolean tienePunto = email.contains(".");
       boolean largoValido = email.length() < 20;
       
       boolean result = tieneArroba && tienePunto && largoValido;
       assertTrue("El email no cumple los requisitos ", result);
       
    }
       

    @Test
    public void testCambioPass() {
        System.out.println("cambioPass");
        String newPassword = "1234";
        ciu.cambioContraseña(newPassword);
        
        assertEquals(1234, ciu.getContraseña());
        System.out.println("Contraseña modificada correctamente: " + ciu.getContraseña());
      
    }

    /**
     forzar el error por timeout 45ms > 30 ms
     */
    @Test(timeout = 30)
    public void testDelay() {
        System.out.println("delay");
        ciu.delay(45);
        
    }


    @Test
    public void testAbonadosDiferentes() {
        System.out.println("abonadosDiferentes");
        Abonado c1 = new Abonado("42.568.598", "Jorge", "jorge@gmail.com",1778);
        Abonado c2 = new Abonado ("39.254.465", "Rodrigo", "rodrigo@gmail.com",6666);
        
        boolean resultadoLogico = c1.abonadosDiferentes(c2);
        assertTrue(resultadoLogico);
        assertNotSame("misma persona", c1, c2);
    }
}