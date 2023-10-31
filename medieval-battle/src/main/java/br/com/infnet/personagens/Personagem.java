package br.com.infnet.personagens;

import br.com.infnet.util.DadoUtil;
import lombok.Getter;
import lombok.Setter;


public abstract class Personagem {
    @Getter
    private String nome;
    @Getter@Setter
    private int pontosDeVida;
    @Getter
    private int pontosDeForca;
    @Getter
    private int pontosDeDefesa;
    @Getter
    private int pontosDeAgilidade;


    public Personagem(String nome, int pontosDeVida, int pontosDeForca,
                      int pontosDeDefesa, int pontosDeAgilidade) {
        this.nome = nome;
        this.pontosDeVida = pontosDeVida;
        this.pontosDeForca = pontosDeForca;
        this.pontosDeDefesa = pontosDeDefesa;
        this.pontosDeAgilidade = pontosDeAgilidade;

    }
    public int calcularIniciativa(){
        DadoUtil dadoUtil = new DadoUtil();
        return dadoUtil.rollD10() + getPontosDeAgilidade();
    }
    public int calcularFatorAtaque(){
        DadoUtil dadoUtil = new DadoUtil();
        return dadoUtil.rollD10() + getPontosDeAgilidade() + getPontosDeForca();
    }
    public int calcularFatorDefesa(){
        DadoUtil dadoUtil = new DadoUtil();
        return dadoUtil.rollD10() + getPontosDeAgilidade() + getPontosDeDefesa();
    }
    public abstract int calcularFatorDeDano();
    public void retirarPontosDeVida(int pontos){
        this.pontosDeVida -= pontos;
    }

}
