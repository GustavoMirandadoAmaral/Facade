package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveRetornarPendenciaJuridicoContratacao() {
        Funcionario funcionario = new Funcionario();
        Juridico.getInstancia().adicionarFuncionarioPendente(funcionario);

        assertEquals(false, funcionario.contratar());
    }

    @Test
    void deveRetornarPendenciaPatrimonialContratacao() {
        Funcionario funcionario = new Funcionario();
        Patrimonial.getInstancia().adicionarFuncionarioPendente(funcionario);

        assertEquals(false, funcionario.contratar());
    }

    @Test
    void deveRetornarAlunoSemPendenciaContratacao() {
        Funcionario funcionario = new Funcionario();

        assertEquals(true, funcionario.contratar());
    }
}