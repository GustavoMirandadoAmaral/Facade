package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Setor {

    private List<Funcionario> funcionariosComPendencia = new ArrayList<>();

    public void adicionarFuncionarioPendente(Funcionario funcionario){
        this.funcionariosComPendencia.add(funcionario);
    }

    public boolean verificarFuncionarioComPendencia(Funcionario funcionario){
        return this.funcionariosComPendencia.contains(funcionario);
    }
}
