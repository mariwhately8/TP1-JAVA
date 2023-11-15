package br.com.infnet;

import br.com.infnet.util.DadoUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertTrue;

public class DadoUtilTest {
    @Test
    @DisplayName("Dado D10 - Deve retornar valores <= 10")
    public void testeD10(){
        DadoUtil dadoUtil = new DadoUtil();
        for(int i=0; i<100;i++){
            int valorDoDado = dadoUtil.rollD10();
            assertTrue(valorDoDado <= 10);
        }
    }
    @Test
    @DisplayName("Dado D4 - Deve retornar valores <= 4")
    public void testeD4(){
        DadoUtil dadoUtil = new DadoUtil();
        for(int i=0; i<100;i++){
            int valorDoDado = dadoUtil.rollD4();
            assertTrue(valorDoDado <= 4);
        }
    }
    @Test
    @DisplayName("Dado D6 - Deve retornar valores <= 6")
    public void testeD6(){
        DadoUtil dadoUtil = new DadoUtil();
        for(int i=0; i<100;i++){
            int valorDoDado = dadoUtil.rollD6();
            assertTrue(valorDoDado <= 6);
        }
    }
    @Test
    @DisplayName("Dado D8 - Deve retornar valores <= 8")
    public void testeD8(){
        DadoUtil dadoUtil = new DadoUtil();
        for(int i=0; i<100;i++){
            int valorDoDado = dadoUtil.rollD8();
            assertTrue(valorDoDado <= 8);
        }
    }
    @Test
    @DisplayName("Dado D2 - Deve retornar valores <= 2")
    public void testeD2(){
        DadoUtil dadoUtil = new DadoUtil();
        for(int i=0; i<100;i++){
            int valorDoDado = dadoUtil.rollD2();
            assertTrue(valorDoDado <= 2);
        }
    }
}
