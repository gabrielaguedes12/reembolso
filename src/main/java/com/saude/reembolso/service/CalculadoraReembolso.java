package com.saude.reembolso.service;

public class CalculadoraReembolso {

    public double calcular(double valorConsulta, double percentualCobertura) {

        return valorConsulta * percentualCobertura;

    }

}