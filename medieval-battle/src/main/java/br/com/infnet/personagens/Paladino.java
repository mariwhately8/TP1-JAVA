package br.com.infnet.personagens;

import br.com.infnet.util.DadoUtil;

public class Paladino extends Personagem{
    public Paladino(){
        super("Paladino",15,2,5,1);
    }

    @Override
    public int calcularFatorDeDano() {
        DadoUtil dadoUtil = new DadoUtil();
        return dadoUtil.rollD4() + dadoUtil.rollD4() + getPontosDeForca();
    }
}
