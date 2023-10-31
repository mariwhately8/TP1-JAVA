package br.com.infnet.personagens;

import br.com.infnet.util.DadoUtil;

public class Orc extends Personagem{
    public Orc(){
        super("Orc",20,6,2,2);
    }

    @Override
    public int calcularFatorDeDano() {
        DadoUtil dadoUtil = new DadoUtil();
        return dadoUtil.rollD8() + dadoUtil.rollD8() + getPontosDeForca();
    }
}
