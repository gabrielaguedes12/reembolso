package com.saude.reembolso.interfaces;

import com.saude.reembolso.model.Consulta;

public interface Auditoria {

    void registrarConsulta(Consulta consulta);

}