package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonagemTest {

    @Test
    void deveRetornarPendenciaEmBicas() {
        Personagem pj = new Personagem();
        assertEquals("Sem Insígnia de Pedra (Bicas)", pj.iniciarDesafioEliteFour());
    }

    @Test
    void deveRetornarPendenciaEmRecreio() {
        Personagem pj = new Personagem();
        Bicas.getInstancia().addPJComInsignia(pj);
        assertEquals("Sem Insígnia de Fogo (Recreio)", pj.iniciarDesafioEliteFour());
    }

    @Test
    void deveRetornarPendenciaEmUba() {
        Personagem pj = new Personagem();
        Bicas.getInstancia().addPJComInsignia(pj);
        Recreio.getInstancia().addPJComInsignia(pj);
        assertEquals("Sem Insígnia de Planta (Ubá)", pj.iniciarDesafioEliteFour());
    }

    @Test
    void deveRetornarPendenciaEmJuizDeFora() {
        Personagem pj = new Personagem();
        Bicas.getInstancia().addPJComInsignia(pj);
        Recreio.getInstancia().addPJComInsignia(pj);
        Uba.getInstancia().addPJComInsignia(pj);
        assertEquals("Sem Insígnia de Steel (Juiz de Fora)", pj.iniciarDesafioEliteFour());
    }

    @Test
    void deveRetornarDesafioIniciado() {
        Personagem pj = new Personagem();
        Bicas.getInstancia().addPJComInsignia(pj);
        Recreio.getInstancia().addPJComInsignia(pj);
        Uba.getInstancia().addPJComInsignia(pj);
        JuizDeFora.getInstancia().addPJComInsignia(pj);
        assertEquals("Desafio iniciado, boa sorte", pj.iniciarDesafioEliteFour());
    }

}