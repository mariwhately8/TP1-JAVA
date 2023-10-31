package br.com.infnet.personagens;

import br.com.infnet.util.DadoUtil;

public class MortoVivo extends Personagem{
    public MortoVivo() {
        super("Morto-Vivo",25, 4, 0, 1);
    }

    @Override
    public int calcularFatorDeDano() {
        DadoUtil dadoUtil = new DadoUtil();
        return dadoUtil.rollD4() + dadoUtil.rollD4() + getPontosDeForca();
    }
}
