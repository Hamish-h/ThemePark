import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ColossusTest {

    Colossus colossus;

    @Before
    public void before(){
        colossus = new Colossus(5, 12, 1);
    }

    @Test
    public void hasPrice() {
        assertEquals(10, colossus.getPrice());
    }

    @Test
    public void hasMinAge() {
        assertEquals(12, colossus.getMinAge());
    }

    @Test
    public void hasMinHeight() {
        assertEquals(1, colossus.getMinHeight());
    }
}

