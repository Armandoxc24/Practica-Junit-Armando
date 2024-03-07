import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestCalcularTest {
    static Calculadora calc=new Calculadora();
    @BeforeEach
    public void before() {
         calc = new Calculadora();
    }
    @AfterEach
    public void after() {
        calc.restablecer();
    }
    @Test
    public void suma() {
        Assertions.assertEquals(15, calc.suma(10,5));

    }
    @Test
    public void resta() {
        Assertions.assertEquals(2, calc.resta(4,2));
    }
    @Test
    public void div() {
        Assertions.assertEquals(1, calc.divideix(2, 2));
    }
    @Test
    public void multi() {
        Assertions.assertEquals(6, calc.multiplica(3, 2));
    }
    @Test
    public void mayorque() {
        Assertions.assertEquals(false,calc.majorQue(0,13));
    }

}