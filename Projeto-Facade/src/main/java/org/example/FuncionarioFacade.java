package org.example;

public class FuncionarioFacade {

    public static boolean verificarPendenciasContratacao(Funcionario funcionario) {
        if (Juridico.getInstancia().verificarFuncionarioComPendencia(funcionario)) {
            return false;
        }
        if (Patrimonial.getInstancia().verificarFuncionarioComPendencia(funcionario)) {
            return false;
        }
        return true;
    }
}
