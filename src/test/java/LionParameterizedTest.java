import com.example.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)


public class LionTest {

    public CorrectAnswersTest(int index, String expected) {
        this.index = index;
        this.expected = expected;
    }

    @Parameterized.Parameters
