package br.com.infnet.personagens;

import br.com.infnet.util.DadoUtil;

public class Guerreiro extends Personagem{

    public Guerreiro() {
        super("Guerreiro", 12, 4, 3, 3);
    }

    @Override
    public int calcularFatorDeDano() {
        DadoUtil dadoUtil = new DadoUtil();
        return dadoUtil.rollD4() + dadoUtil.rollD4() + getPontosDeForca();
    }
}
