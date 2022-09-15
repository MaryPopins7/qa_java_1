import example.Feline;
import example.Lion;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    private static final String sex = "Самец";

    @Mock
    private Feline feline;


    @Test
    public void felineGetKittensDefaultNumberTest() throws Exception {
        Lion lion = new Lion(sex, feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void lionGetFood() throws Exception {
        Lion lionAnimal = new Lion(sex, feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expectedFood, lionAnimal.getFood());
    }

    @Test
    public void doesHaveMane() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean actual = lion.doesHaveMane();

        Assert.assertTrue(actual);
    }

    @Test
    public void checkExceptionByCreateLion() throws Exception {
        Lion lionAnimal = new Lion("Самка", feline);
        boolean actual = lionAnimal.doesHaveMane();

        Assert.assertFalse(actual);
    }
}
