package com.saude.reembolso;

import com.saude.reembolso.service.CalculadoraReembolso;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraReembolsoTest {

    @Test
    public void deveCalcularReembolsoBasico() {

        CalculadoraReembolso calc = new CalculadoraReembolso();

        double resultado = calc.calcular(200, 0.7);

        assertEquals(140, resultado);
    }

}