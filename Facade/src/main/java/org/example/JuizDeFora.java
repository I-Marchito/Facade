package org.example;

public class JuizDeFora extends Ginásio {
    private static JuizDeFora steel = new JuizDeFora();

    private JuizDeFora(){}

    public static JuizDeFora getInstancia(){
        return steel;
    }
}
