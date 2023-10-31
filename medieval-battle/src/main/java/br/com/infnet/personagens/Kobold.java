package br.com.infnet.personagens;

import br.com.infnet.util.DadoUtil;

public class Kobold extends Personagem{
    public Kobold(){
        super("Kobold", 20,4,2,4);
    }

    @Override
    public int calcularFatorDeDano() {
        DadoUtil dadoUtil = new DadoUtil();
        int somDados = 0;
        for(int i=0;i<3;i++){
            somDados = dadoUtil.rollD2();
        }
        return somDados + getPontosDeForca();
    }
}
