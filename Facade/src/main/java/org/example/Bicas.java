package org.example;

public class Bicas extends Ginásio{
    private static Bicas pedra = new Bicas();

    private Bicas(){}

    public static Bicas getInstancia(){
        return pedra;
    }
}
