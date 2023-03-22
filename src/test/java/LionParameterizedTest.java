import com.example.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParameterizedTest {
    private final boolean expected;
    private final String sex;

    @Mock
    private Feline feline;

    public LionParameterizedTest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getSex() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
                {"самей", false}
        };
    }

    @Test
    public void hasManeTest() throws Exception{
       try{ Lion lion = new Lion(sex, feline);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual); }
       catch (Exception exception) {
           System.out.println("Используйте допустимые значения пола животного - самей или самка");
       }
    }
}