package br.com.infnet.util;

import java.util.List;
import java.util.Random;

import br.com.infnet.personagens.*;

public class PersonagemUtil {
    public Personagem escolherHeroi(int escolha){
        List<Personagem> personagems =
                List.of(new Guerreiro(), new Barbaro(), new Paladino());
        try {
            return personagems.get(escolha - 1);
        } catch (Exception e) {
            return new Guerreiro();
        }
    }
    public Personagem escolhaMostro(){
        Random random = new Random();
        List<Personagem> monstros = List.of(new MortoVivo(), new Orc(), new Kobold());
        int escolhaMostro = random.nextInt(monstros.size());
        return monstros.get(escolhaMostro);
    }
}
