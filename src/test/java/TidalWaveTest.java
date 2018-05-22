import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TidalWaveTest {

    TidalWave tidalWave;

    @Before
    public void before(){
        tidalWave = new TidalWave(5, 12, 1);
    }

    @Test
    public void hasPrice() {
        assertEquals(10, tidalWave.getPrice());
    }

    @Test
    public void hasMinAge() {
        assertEquals(12, tidalWave.getMinAge());
    }

    @Test
    public void hasMinHeight() {
        assertEquals(1, tidalWave.getMinHeight());
    }
}
