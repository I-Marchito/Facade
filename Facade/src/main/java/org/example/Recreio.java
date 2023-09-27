package org.example;

public class Recreio extends Ginásio{

    private static Recreio fogo = new Recreio();

    private Recreio(){}

    public static Recreio getInstancia(){
        return fogo;
    }
}
