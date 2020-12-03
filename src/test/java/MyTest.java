import com.microsoft.demo.Demo;
import org.junit.Test;
import org.junit.Assert;

public class MyTest {
    @Test
    public void test_method_1() {
        Demo d = new Demo();
        d.doSomething(true);
    }

    @Test
    public void test_method_2() {
    }
    
    @Test
    public void test_method_3() {
        Demo d = new Demo();
        Assert.assertTrue(d.doSomethingElse(true));
    }

    @Test
    public void test_method_4() {
        Demo d = new Demo();
        Assert.assertFalse(d.doSomethingElse(false));
    }
}