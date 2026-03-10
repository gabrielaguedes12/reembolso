package com.saude.reembolso.fake;

import com.saude.reembolso.interfaces.HistoricoConsultas;
import com.saude.reembolso.model.Consulta;

import java.util.ArrayList;
import java.util.List;

public class HistoricoConsultasFake implements HistoricoConsultas {

    private List<Consulta> consultas = new ArrayList<>();

    public void registrarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public List<Consulta> listarConsultas() {
        return consultas;
    }

}