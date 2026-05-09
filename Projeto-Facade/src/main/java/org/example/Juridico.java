package org.example;

public class Juridico extends Setor{

    private static Juridico juridico = new Juridico();

    private Juridico() {};

    public static Juridico getInstancia() {
        return juridico;
    }
}
