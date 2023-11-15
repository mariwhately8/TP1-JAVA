package br.com.infnet;


import java.util.List;
import java.util.Random;
import java.io.IOException;
import java.util.Scanner;
import br.com.infnet.personagens.*;
import br.com.infnet.util.PersonagemUtil;
import br.com.infnet.batalhas.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class App 
{
    private static final Logger logger = LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu Apelido.");
        String apelido = in.nextLine();

        System.out.println("Escolha seu Herói: [1] Guerreiro; [2] Barbaro; [3] Paladino.");
        int escolhaHeroi = in.nextInt();
        PersonagemUtil personagemUtil = new PersonagemUtil();
        Personagem heroi = personagemUtil.escolherHeroi(escolhaHeroi);
        Personagem monstro = personagemUtil.escolhaMostro();
        System.out.println(apelido + " você escolheu o heroi " + heroi.getNome() + " e vai batalhar contra " + monstro.getNome());



        try{
            Batalha bat = new Batalha(heroi, monstro, apelido);
            Personagem vencedor = bat.ataque();
            System.out.println("O vencedor foi " + vencedor.getNome());
        }catch(IOException ex) {
            logger.error("Erro na criação do log!");
        }


    }
}
