import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void before(){
        customer = new Customer(10, 1, 500);
    }

    @Test
    public void hasAge() {
        assertEquals(10, customer.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(1, customer.getHeight());
    }

    @Test
    public void hasMoney() {
        assertEquals(500, customer.getMoney());
    }
}
