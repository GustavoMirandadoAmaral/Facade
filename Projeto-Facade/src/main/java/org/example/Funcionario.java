package org.example;

public class Funcionario {

    public boolean contratar(){return FuncionarioFacade.verificarPendenciasContratacao(this);}
}
