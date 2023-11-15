package br.com.infnet.batalhas;

import br.com.infnet.personagens.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class Batalha{
    Personagem heroi;
    Personagem monstro;
    Personagem atacante;
    Personagem defensor;
    String apelido;

    private static final Logger logger = LoggerFactory.getLogger(Batalha.class);

    public Batalha(Personagem heroi, Personagem monstro, String apelido){
        this.heroi = heroi;
        this.monstro = monstro;
        this.apelido = apelido;
    }

    public void iniciativa() {
        while(true){
            int iniciativaHeroi = heroi.calcularIniciativa();
            int iniciativaMonstro = monstro.calcularIniciativa();
            logger.info("A iniciativa do " + heroi.getNome() + " é: "
                    + iniciativaHeroi);
            logger.info("A iniciativa do " + monstro.getNome() + " é: "
                    + iniciativaMonstro);
            if(iniciativaHeroi > iniciativaMonstro){
                logger.info(heroi.getNome() + " ataca!");
                atacante = heroi;
                defensor = monstro;
                break;
            }else if(iniciativaHeroi < iniciativaMonstro){
                logger.info(monstro.getNome() + " ataca!");
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
                logger.debug("O fator de ataque é: " + fatorAtaque);
                logger.debug("O fator de defesa é: " + fatorDefesa);
                logger.debug("O vencedor é: " + atacante.getNome());
                logger.debug("O fator de dano do defensor foi: "
                        + calculoDano);
                logger.debug("O defensor agora tem: " + resultado + " pontos de vida.");
            }else if(fatorAtaque < fatorDefesa){
                logger.debug("O fator de ataque é: " + fatorAtaque);
                logger.debug("O fator de defesa é: " + fatorDefesa);
                logger.debug("Nada acontece.");
            }else{
                logger.debug("Empate!");
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
        return atacante;
    }

}
