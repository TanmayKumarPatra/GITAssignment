import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
public class CalculationTest {
    @BeforeClass
    public static void setUpClass() {
    }
    @AfterClass
    public static void tearDownClass() {
    }
    @Before
    public void setUp() {
    }
    @After
    public void tearDown() {
    }
    @Test
    public void testAdd() {
        System.out.println("add");
        Integer a = 15;
        Integer b = 15;
        Integer expResult = 30;
        Integer result = Calculation.add(a, b);
        assertEquals(expResult, result);
        assertEquals(null, Calculation.add(15, null));
        assertEquals(null, Calculation.add(null, 15));
        assertEquals(null, Calculation.add(null, null));
    }
     @Test
    public void testSub() {
        System.out.println("Difference");
        Integer a = 15;
        Integer b = 25;
        Integer expResult = 10;
        Integer result = Calculation.sub(a, b);
        assertEquals(expResult, result);
        assertEquals(null, Calculation.sub(15, null));
        assertEquals(null, Calculation.sub(null, 25));
        assertEquals(null, Calculation.sub(null, null));
    }
}
