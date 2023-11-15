package br.com.infnet.util;

import java.util.List;
import java.util.Random;

import br.com.infnet.batalhas.Batalha;
import br.com.infnet.exception.HeroiInvalidoException;
import br.com.infnet.personagens.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PersonagemUtil {

    private static final Logger logger = LoggerFactory.getLogger(PersonagemUtil.class);
    public Personagem escolherHeroi(int escolha){
        List<Personagem> personagems =
                List.of(new Guerreiro(), new Barbaro(), new Paladino());
        try {
            return personagems.get(escolha - 1);
        } catch (Exception e) {
            logger.error("Escolha de herói inexistente.");
            throw new HeroiInvalidoException("Escolha de herói inexistente.");
        }
    }
    public Personagem escolhaMostro(){
        Random random = new Random();
        List<Personagem> monstros = List.of(new MortoVivo(), new Orc(), new Kobold());
        int escolhaMostro = random.nextInt(monstros.size());
        return monstros.get(escolhaMostro);
    }
}
