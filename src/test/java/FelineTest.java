import example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.Assert;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Test
    public void eatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> felineEats = feline.eatMeat();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), felineEats);
    }


    @Test
    public void getFamily() {
        Feline feline = new Feline();
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittens() {
        Feline feline = new Feline();
        Assert.assertEquals(10, feline.getKittens(10));
    }

}