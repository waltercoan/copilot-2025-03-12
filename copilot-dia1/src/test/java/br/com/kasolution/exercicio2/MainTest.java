package br.com.kasolution.exercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testVerificarParOuImpar_Par() {
        assertEquals("Par", Main.verificarParOuImpar(4));
    }

    @Test
    public void testVerificarParOuImpar_Impar() {
        assertEquals("Ímpar", Main.verificarParOuImpar(5));
    }
}