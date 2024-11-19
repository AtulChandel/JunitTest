//package learn.unit.testing;
//
//import org.junit.*;
//import org.junit.rules.TestName;
//
//import java.util.Date;
//
//import static org.junit.Assert.assertEquals;
//
//public class CalculatorTest {
//
//    @Rule
//    public TestName testName = new TestName();
//
//    @BeforeClass
//    public static void init(){
//        System.out.println("Before all test execution started...");
//        System.out.println("Run started at " + new Date());
//    }
//
//    @Before
//    public void beforeEach(){
//        System.out.println("New test " + testName.getMethodName() + " started...");
//    }
//
//    @After
//    public void afterEach(){
//        System.out.println("Test execution of " + testName.getMethodName() + " completed...");
//    }
//
//    @Test
//    public void SumTwoNumberTest(){
//        System.out.println("Running SumTwoNumberTest....");
//        int result = Calculator.SumTwoNumber(5,10);
//        assertEquals(15, result);
//    }
//
//    @Test
//    public void DifferenceTwoNumberTest(){
//        System.out.println("Running DifferenceTwoNumberTest...");
//        int result = Calculator.DifferenceTwoNumber(10,5);
//        assertEquals(5, result);
//    }
//
//    @Test
//    public void MultipleTwoNumberTest(){
//        System.out.println("Running MultipleTwoNumberTest...");
//        int result = Calculator.MultipleTwoNumber(4, 3);
//        assertEquals(12, result);
//    }
//
//    @Test
//    public void DivisionTwoNumberTest(){
//        System.out.println("Running DivisionTwoNumberTest...");
//        int result = Calculator.DivisionTwoNumber(15, 3);
//        assertEquals(5, result);
//    }
//
//    @Test(timeout = 2000)
//    public void SumAnyNumberTest(){
//        System.out.println("Running SumAnyNumberTest...");
//        int result = Calculator.sumAnyNumber(2,3,4,5);
//        assertEquals(14, result);
//    }
//
//    @AfterClass
//    public static void cleanup(){
//        System.out.println("Tests completed at " + new Date());
//    }
//}
