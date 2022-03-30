
package offtop.app_junit;

import static org.hamcrest.core.Is.is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class Calculator1Test {
    
//    public Calculator1Test() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of div method, of class Calculator1.
//     */
//    @Test
//    public void testDiv() {
//        System.out.println("div");
//        int first = 15;
//        int second = 5;
//        Calculator1 instance = new Calculator1();
//        int expResult = 3;
//        int result = instance.div(first, second);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////final int result = calculator.div(15, 3);
////        assertThat(result, is(3));
//    }
    @Test
    public void whenDivFirstOnSecondThenResultIs3() {
        final Calculator1 calculator = new Calculator1();
        final int result = calculator.div(15, 3);
        assertThat(result, is(5));
    }
    
}
