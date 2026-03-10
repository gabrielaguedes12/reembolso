package com.saude.reembolso.spy;

import com.saude.reembolso.interfaces.Auditoria;
import com.saude.reembolso.model.Consulta;

public class AuditoriaSpy implements Auditoria {

    public boolean chamado = fals;

    public void registrarConsulta(Consulta consulta) {
        chamado = true;
    }

}