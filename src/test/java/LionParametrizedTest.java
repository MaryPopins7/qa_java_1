import example.Feline;
import example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParametrizedTest{
    private final String sex;
    private final boolean expected;

    public LionParametrizedTest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index} : doesHaveMane() = {1}")
    public static Object[][] lionIsCreateData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void lionIsCreate() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Lion lion = new Lion(sex, feline);
        boolean actual = lion.doesHaveMane();

        assertEquals(expected, actual);
    }
}
