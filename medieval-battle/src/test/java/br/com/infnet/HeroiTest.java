package br.com.infnet;

import br.com.infnet.exception.HeroiInvalidoException;
import br.com.infnet.util.PersonagemUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class HeroiTest {
    @Test
    @DisplayName("Deve retornar exception para escolha de herói inexistente.")
    public void testHeroi(){
        PersonagemUtil personagemUtil = new PersonagemUtil();
        assertThrows(HeroiInvalidoException.class, () -> {
            personagemUtil.escolherHeroi(10);
        });
    }

}
