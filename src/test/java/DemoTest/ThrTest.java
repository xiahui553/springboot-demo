package DemoTest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ThrTest {
    @Test
    public void test1(){
        Assert.assertEquals("11","11");
    }
    @DataProvider(name="test")
    public Object[][] getData(){
        return new Object[][]{
                {18},
                {24},
                {33}
        };
    }
    @Test(dataProvider = "test")
    public void test222(Integer age){
        Assert.assertEquals("111","222");
    }
}
