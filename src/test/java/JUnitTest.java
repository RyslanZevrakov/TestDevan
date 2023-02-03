import org.example.TestDemo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JUnitTest {
    @Test
    void tryFireTest(){
        TestDemo testDemo = new TestDemo();
        Assertions.assertEquals(4, testDemo.contSum(2,2),"Test passsed");
        Assertions.assertEquals(1, testDemo.contSum(0,1),"Test passsed");
        Assertions.assertEquals(2, testDemo.contSum(2,0),"Test passsed");
        Assertions.assertEquals(3, testDemo.contSum(2,1),"Test passsed");
        Assertions.assertEquals(0, testDemo.contSum(0,0),"Test passsed");
        Assertions.assertEquals(7, testDemo.contSum(5,2),"Test passsed");
    }
    @Test
    void tryFireTesting(){
        TestDemo testDemo = new TestDemo();
        Assertions.assertEquals(0, testDemo.contDiff(2,2),"Test passsed");
        Assertions.assertEquals(5, testDemo.contDiff(10,5),"Test passsed");
        Assertions.assertEquals(10, testDemo.contDiff(12,2),"Test passsed");
        Assertions.assertEquals(1, testDemo.contDiff(2,1),"Test passsed");
        Assertions.assertEquals(13, testDemo.contDiff(15,2),"Test passsed");
        Assertions.assertEquals(4, testDemo.contDiff(6,2),"Test passsed");
    }
    @Test
    void tryFireTref(){
        TestDemo testDemo = new TestDemo();
        Assertions.assertEquals(0,testDemo.contFair(0,100,0),"jj");
    }
}
