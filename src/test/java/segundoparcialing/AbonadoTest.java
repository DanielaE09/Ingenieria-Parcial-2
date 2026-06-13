package segundoparcialing;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AbonadoTest {
    
    private static Abonado ciu;
    private static int numeroTest = 0;
    
    public AbonadoTest() {
    }
    
    @BeforeAll 
    public static void antesDeTodo() {
        ciu = new Abonado("Anonimus", "Daniela Mestre", "daniela@gmail.com", 1212);
        System.out.println("INGRESO de abonado del bien");
    }
    
    @AfterAll 
    public static void despuesDeTodo() {
        LocalDate fechaAyer = LocalDate.now().minusDays(1);
        System.out.println(fechaAyer + "Modem rotos reparados, Abonadoes Felices");
    }
    
    @BeforeEach 
    public void setUp() {
        numeroTest++;
        System.out.println("--------------------------------------------");
        System.out.println("Iniciando método de Test N°: " + numeroTest);
    }
    
    @AfterEach 
    public void tearDown() {
        System.out.println("--------------------------------------------");
    }

    @Test //tiene que fallar 
    public void testValidarUsr() {
        System.out.println("validarUsr");
        boolean result = ciu.validarIngreso(123456);
        assertTrue(result, "La prueba debe FALLAR de forma intencional");
    }

    @Test
    public void testValidarEmail() {
       System.out.println("ValidarEmail");
       String email = "inge@software.com";
       
       boolean tieneArroba = email.contains("@");
       boolean tienePunto = email.contains(".");
       boolean largoValido = email.length() < 20;
       
       boolean result = tieneArroba && tienePunto && largoValido;
       assertTrue(result, "El email no cumple los requisitos ");
    }

    @Test
    public void testCambioPass() {
        System.out.println("cambioPass");
        String newPassword = "1234";
        ciu.cambioContraseña(newPassword);
        
        assertEquals(1234, ciu.getContraseña());
        System.out.println("Contraseña modificada correctamente: " + ciu.getContraseña());
    }

    @Test //tiene que fallar 
    public void testDelay() {
        System.out.println("delay");
        assertTimeoutPreemptively(java.time.Duration.ofMillis(30), () -> {
            ciu.delay(45);
        });
    }

    @Test
    public void testAbonadosDiferentes() {
        System.out.println("abonadosDiferentes");
        Abonado c1 = new Abonado("42.568.598", "Jorge", "jorge@gmail.com", 1778);
        Abonado c2 = new Abonado("39.254.465", "Rodrigo", "rodrigo@gmail.com", 6666);
        
        boolean resultadoLogico = c1.abonadosDiferentes(c2);
        assertTrue(resultadoLogico);
        assertNotSame(c1, c2, "misma persona");
    }
}