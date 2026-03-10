package com.saude.reembolso.service;

import com.saude.reembolso.model.Paciente;

public class CalculadoraReembolso {

    public double calcular(double valorConsulta, double percentualCobertura, Paciente paciente) {

        double valor = valorConsulta * percentualCobertura;

        if (valor > 150) {
            return 150;
        }

        return valor;
    }

}