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

    @Test
    public void deveRetornarZeroQuandoConsultaZero() {

        CalculadoraReembolso calc = new CalculadoraReembolso();

        double resultado = calc.calcular(0, 0.7);

        assertEquals(0, resultado);
    }

    @Test
    public void deveRetornarZeroQuandoCoberturaZero() {

        CalculadoraReembolso calc = new CalculadoraReembolso();

        double resultado = calc.calcular(200, 0);

        assertEquals(0, resultado);
    }

    @Test
    public void deveRetornarValorTotalQuandoCobertura100() {

        CalculadoraReembolso calc = new CalculadoraReembolso();

        double resultado = calc.calcular(200, 1);

        assertEquals(200, resultado);
    }

}