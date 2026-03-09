package com.saude.reembolso.service;

import com.saude.reembolso.model.Paciente;

public class CalculadoraReembolso {

    public double calcular(double valorConsulta, double percentual, Paciente paciente){

        double resultado = valorConsulta * percentual;

        if(resultado > 150){
            return 150;
        }

        return resultado;
    }
}