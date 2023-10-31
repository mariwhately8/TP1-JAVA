package br.com.infnet.personagens;

import br.com.infnet.util.DadoUtil;

public class Barbaro extends Personagem{
    public Barbaro() {
        super("Barbaro", 13, 6, 1, 3);
    }

    @Override
    public int calcularFatorDeDano() {
        DadoUtil dadoUtil = new DadoUtil();
        return dadoUtil.rollD6() + dadoUtil.rollD6() + getPontosDeForca();
    }
}
