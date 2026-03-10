package com.saude.reembolso.interfaces;

import com.saude.reembolso.model.Consulta;
import java.util.List;

public interface HistoricoConsultas {

    void registrarConsulta(Consulta consulta);

    List<Consulta> listarConsultas();

}