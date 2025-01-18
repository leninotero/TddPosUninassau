import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestConversorTest {

    @Test
    void deveEntenderOSimboloI(){
        Conversor conversorRomanos = new Conversor();
        int valorEsperado = 1;

        assertEquals(valorEsperado, conversorRomanos.converter("I"));
    }

    @Test
    void deveEntenderOSimboloV(){
        Conversor conversorRomanos = new Conversor();
        int valorEsperado = 5;

        assertEquals(valorEsperado, conversorRomanos.converter("V"));
    }

    @Test
    void deveEntenderOSimboloII(){
        Conversor conversorRomanos = new Conversor();
        int valorEsperado = 2;

        assertEquals(valorEsperado, conversorRomanos.converter("II"));
    }

    @Test
    void deveEntenderOSimboloIX(){
        Conversor conversorRomanos = new Conversor();
        int valorEsperado = 9;

        assertEquals(valorEsperado, conversorRomanos.converter("IX"));
    }

}
