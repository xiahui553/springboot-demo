package DemoTest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SecTest {
    @Test
    public void test1(){
        Assert.assertEquals("11","11");
    }
    @DataProvider(name="test")
    public Object[][] getData(){
        return new Object[][]{
                {"zhangsan",18},
                {"lisi",24},
                {"wangwu",33}
        };
    }
    @Test(dataProvider = "test")
    public void test222(String name,Integer age){
        Assert.assertEquals(name,"zhangsan");
    }
}
