package at.feiertag;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareControllerTest {

    @Test
    public void test_calculateSquare(){
        SquareController controller = new SquareController();

        String actualValue = controller.calculateSquare(10);

        Assertions.assertEquals("100,00", actualValue);
    }

}
