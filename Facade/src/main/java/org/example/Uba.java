package org.example;

public class Uba extends Ginásio{
    private static Uba planta = new Uba();

    private Uba(){}

    public static Uba getInstancia(){
        return planta;
    }
}
