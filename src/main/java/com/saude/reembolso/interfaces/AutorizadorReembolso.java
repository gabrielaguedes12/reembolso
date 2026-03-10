package com.saude.reembolso.interfaces;

import com.saude.reembolso.model.Consulta;

public interface AutorizadorReembolso {

    boolean autorizar(Consulta consulta);

}