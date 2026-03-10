package com.saude.reembolso;

import com.saude.reembolso.service.CalculadoraReembolso;
import com.saude.reembolso.model.Paciente;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraReembolsoTest {

    CalculadoraReembolso calc = new CalculadoraReembolso();

    private Paciente pacienteDummy() {
        return new Paciente("Maria");
    }

    @Test
    public void deveCalcularReembolsoBasico() {

        double resultado = calc.calcular(200,0.7,pacienteDummy());

        assertEquals(140,resultado,0.01);
    }

    @Test
    public void consultaZero() {

        double resultado = calc.calcular(0,0.7,pacienteDummy());

        assertEquals(0,resultado,0.01);
    }

    @Test
    public void coberturaZero() {

        double resultado = calc.calcular(200,0,pacienteDummy());

        assertEquals(0,resultado,0.01);
    }

    @Test
    public void coberturaTotal() {

        double resultado = calc.calcular(200,1,pacienteDummy());

        assertEquals(150,resultado,0.01);
    }

}