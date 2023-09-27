package org.example;

import java.util.List;
import java.util.ArrayList;

public abstract class Ginásio {
    private List<Personagem> pjComInsignia = new ArrayList<>();

    public void addPJComInsignia(Personagem pj){
        this.pjComInsignia.add(pj);
    }

    public boolean verificarInsigniaPJ(Personagem pj){
        return this.pjComInsignia.contains(pj);
    }

}
