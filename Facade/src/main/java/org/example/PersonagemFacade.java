package org.example;

public class PersonagemFacade {
    public static String verificarInsignias(Personagem pj){
        if (!(Bicas.getInstancia().verificarInsigniaPJ(pj))) {
            return "Sem Insígnia de Pedra (Bicas)";
        }
        if (!(Recreio.getInstancia().verificarInsigniaPJ(pj))){
            return "Sem Insígnia de Fogo (Recreio)";
        }
        if (!(Uba.getInstancia().verificarInsigniaPJ(pj))) {
            return "Sem Insígnia de Planta (Ubá)";
        }
        if (!(JuizDeFora.getInstancia().verificarInsigniaPJ(pj))){
            return "Sem Insígnia de Steel (Juiz de Fora)";
        }
        return "Desafio iniciado, boa sorte";
    }
}
