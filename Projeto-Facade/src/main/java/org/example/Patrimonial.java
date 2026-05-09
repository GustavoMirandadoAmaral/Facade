package org.example;

public class Patrimonial extends Setor{

    private static Patrimonial patrimonial = new Patrimonial();

    private Patrimonial() {};

    public static Patrimonial getInstancia() {
        return patrimonial;
    }
}
