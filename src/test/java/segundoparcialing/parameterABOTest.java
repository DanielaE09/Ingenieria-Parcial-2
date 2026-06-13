/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundoparcialing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.*;

public class parameterABOTest {

    
    public static boolean ValidarMail(String email){
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(email);
        return mather.find();
    }
    
 
    public static Stream<Arguments> tomarDatos() {
        return Stream.of(
            Arguments.of("jorgesys@tototita.com", "true", "Valido"),
            Arguments.of("jorgesys*tototita.com", "false", "Invalido1"),
            Arguments.of("@jorgesystototita.com", "false", "Invalido2"),
            Arguments.of("jorgesystototita@com", "false", "Invalido3")
        );
    }
    
   
    @ParameterizedTest
    @MethodSource("tomarDatos")
    public void testValidarEmail(String emailInput, String resultadoEsperado, String caso) {
        boolean resultadoActual = ValidarMail(emailInput);
        boolean esperandoBoolean = Boolean.parseBoolean(resultadoEsperado);
        
        assertEquals(esperandoBoolean, resultadoActual, "Falló en el caso: " + caso);
    }
}
