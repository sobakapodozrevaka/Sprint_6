import com.example.*;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals("Некорректный результат теста", expected, actual);
    }

    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        int expected = 1;
        int actual = feline.getKittens();
        assertEquals("Некорректный результат теста", expected, actual);
    }

    @Test
    public void getFoodTest() throws Exception {
        Feline feline = new Feline();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        assertEquals("Некорректный результат теста", expected, actual);
    }
}
