
package model;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CarroTest {

    @Test
    public void testarLigarMotor() {

        // CENÁRIO
        String modelo1 = "Audi R8";
        String modelo2 = "Bmw I8";
        String modelo3 = "Ferrari SF90 Stradale";

        Carro carro1 = new Carro("Audi", modelo1, 2006, false, 0);
        Carro carro2 = new Carro("BMW", modelo2, 2015, true, 0);
        Carro carro3 = new Carro("Ferrari", modelo3, 2019, true, 60);

        // AÇÃO
        System.out.println(carro1.situacaoMotor());
        System.out.println(carro2.situacaoMotor());
        System.out.println(carro3.situacaoMotor());

        // VERIFICAÇÃO
        assertEquals(modelo1 + " teve seu motor ligado agora",
                     carro1.ligarMotor());

        assertEquals(modelo2 + " já estava com o motor ligado.",
                     carro2.ligarMotor());

        assertEquals(modelo3 + " já estava com o motor ligado.",
                     carro3.ligarMotor());
    }


@Test
public void testarDesligarMotor() {

    // CENÁRIO
    String modelo1 = "Audi R8";
    String modelo2 = "Bmw I8";
    String modelo3 = "Ferrari SF90 Stradale";

    Carro carro1 = new Carro("Audi", modelo1, 2006, false, 0);
    Carro carro2 = new Carro("BMW", modelo2, 2015, true, 0);
    Carro carro3 = new Carro("Ferrari", modelo3, 2019, true, 60);

    // AÇÃO
    System.out.println(carro1.situacaoMotor());
    System.out.println(carro2.situacaoMotor());
    System.out.println(carro3.situacaoMotor());

    // VERIFICAÇÃO
    assertEquals(modelo1 + " já está com o motor desligado.",
                 carro1.desligarMotor());

    assertEquals(modelo2 + " foi desligado(a) agora",
                 carro2.desligarMotor());

    assertEquals("o motor do(a)" + modelo3 +
                 "não pôde ser desligado, carro em movimento!",
                 carro3.desligarMotor());
}


@Test
public void testarAcelerar() {

    // CENÁRIO
    String modelo1 = "Audi R8";
    String modelo2 = "Bmw I8";
    String modelo3 = "Ferrari SF90 Stradale";

    Carro carro1 = new Carro("Audi", modelo1, 2006, false, 0);
    Carro carro2 = new Carro("BMW", modelo2, 2015, true, 0);
    Carro carro3 = new Carro("Ferrari", modelo3, 2019, true, 60);

    // AÇÃO
    System.out.println(carro1.situacaoMotor());
    System.out.println(carro2.situacaoMotor());
    System.out.println(carro3.situacaoMotor());

    // VERIFICAÇÃO
    assertEquals("ATENÇÃO!!! Não é possível acelerar com o motor desligado, seu animal.",
                 carro1.acelerar(20));

    assertEquals(modelo2 + " acelerou, VRUM VRUM! \n" +
                 "Velocidade atual do carro: 20 Km/h",
                 carro2.acelerar(20));

    assertEquals(modelo3 + " acelerou, VRUM VRUM! \n" +
                 "Velocidade atual do carro: 80 Km/h",
                 carro3.acelerar(20));
}



@Test
public void testarFrear() {

    // CENÁRIO
    String modelo1 = "Audi R8";
    String modelo2 = "Bmw I8";
    String modelo3 = "Ferrari SF90 Stradale";
    String modelo4 = "Porsche 911";

    Carro carro1 = new Carro("Audi", modelo1, 2006, false, 0);
    Carro carro2 = new Carro("BMW", modelo2, 2015, true, 0);
    Carro carro3 = new Carro("Ferrari", modelo3, 2019, true, 60);
    Carro carro4 = new Carro("Porsche", modelo4, 2020, true, 30);

    // AÇÃO
    System.out.println(carro1.situacaoMotor());
    System.out.println(carro2.situacaoMotor());
    System.out.println(carro3.situacaoMotor());
    System.out.println(carro4.situacaoMotor());

    // VERIFICAÇÃO
    assertEquals("ATENÇÃO! O motor do(a) " + modelo1 +
                 " está desligado! O carro já está parado!",
                 carro1.frear(40));

    assertEquals("Atenção!!! O carro já está parado!",
                 carro2.frear(40));

    assertEquals("FREOU!!! Velocidade atual: 20 Km/h",
                 carro3.frear(40));

    assertEquals("FREOU!!! O carro agora está parado!",
                 carro4.frear(40));
}



}




