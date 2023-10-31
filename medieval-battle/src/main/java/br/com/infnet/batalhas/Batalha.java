package br.com.infnet.batalhas;

import br.com.infnet.personagens.*;
import java.io.IOException;

public class Batalha{
    Personagem heroi;
    Personagem monstro;
    Personagem atacante;
    Personagem defensor;
    String apelido;

    public Batalha(Personagem heroi, Personagem monstro, String apelido){
        this.heroi = heroi;
        this.monstro = monstro;
        this.apelido = apelido;
    }

    public void iniciativa() {
        while(true){
            int iniciativaHeroi = heroi.calcularIniciativa();
            int iniciativaMonstro = monstro.calcularIniciativa();
            System.out.println("A iniciativa do " + heroi.getNome() + " é: "
                    + iniciativaHeroi);
            System.out.println("A iniciativa do " + monstro.getNome() + " é: "
                    + iniciativaMonstro);
            if(iniciativaHeroi > iniciativaMonstro){
                System.out.println(heroi.getNome() + " ataca!");
                atacante = heroi;
                defensor = monstro;
                break;
            }else if(iniciativaHeroi < iniciativaMonstro){
                System.out.println(monstro.getNome() + " ataca!");
                atacante = monstro;
                defensor = heroi;
                break;
            }else{
                System.out.println("Empate!");
            }
        }
    }

    public Personagem ataque() throws IOException {
        int numeroJogadas = 0;
        while(heroi.getPontosDeVida() > 0 && monstro.getPontosDeVida() > 0){
            iniciativa();
            int fatorAtaque = atacante.calcularFatorAtaque();
            int fatorDefesa = defensor.calcularFatorDefesa();
            int calculoDano = defensor.calcularFatorDeDano();
            if(fatorAtaque > fatorDefesa){
                int resultado = defensor.getPontosDeVida() - calculoDano;
                defensor.setPontosDeVida(resultado);
                System.out.println("O fator de ataque é: " + fatorAtaque);
                System.out.println("O fator de defesa é: " + fatorDefesa);
                System.out.println("O vencedor é: " + atacante.getNome());
                System.out.println("O fator de dano do defensor foi: "
                        + calculoDano);
                System.out.println("O defensor agora tem: " + resultado + " pontos de vida.");
            }else if(fatorAtaque < fatorDefesa){
                System.out.println("O fator de ataque é: " + fatorAtaque);
                System.out.println("O fator de defesa é: " + fatorDefesa);
                System.out.println("Nada acontece.");
            }else{
                System.out.println("Empate!");
            }
            numeroJogadas ++;
        }
        System.out.println("Numero de jogadas: " + numeroJogadas);
        boolean vitoria = true;
        if(atacante == heroi){
            vitoria = true;
        }else{
            vitoria = false;
        }
        /*
        LinhasLog linhasLog = new LinhasLog(heroi.getNome(), vitoria, monstro.getNome(), numeroJogadas);

        System.out.println(linhasLog.geraLinha());
        Log log = new Log(apelido);
        log.adicionarLinha(linhasLog);*/
        return atacante;
    }

}
