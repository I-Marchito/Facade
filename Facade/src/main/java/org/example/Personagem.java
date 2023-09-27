package org.example;

public class Personagem {

    public String iniciarDesafioEliteFour(){
        return PersonagemFacade.verificarInsignias(this);
    }
}