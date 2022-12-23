import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

class FunctionTest {
Function function;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        function = new Function(10);
    }

    @org.junit.jupiter.api.Test
    void func() {
        assertEquals(97.48636634052538, Function.func(),0.5);
    }

    @org.junit.jupiter.api.Test
    void nCheck(){
        boolean check = Function.getX() > 0;
        assertEquals(true, check);
    }

    @org.junit.jupiter.api.Test
    public void XCheck(){
        boolean check = Function.getX() < 0;
        assertEquals(false, check);
    }
    @org.junit.jupiter.api.Test
    public void xLess(){
        boolean check = Function.getX() < 2147483647;
        assertEquals(true, check);
    }
}