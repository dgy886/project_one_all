package DemoTest;

import JavaNum2.junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    /*
        初始化方法
        用于资源的申请，所有测试方法执行之前都会先执行该方法
     */
    @Before
    public void init(){
        System.out.println("init.......");
    }


    /*
    释放资源的方法
    在所有测试方法执行完后，都会自动执行该方法
     */
    @After
    public void close(){
        System.out.println("After......");
    }
    /*
    测试add（）方法
     */
    @Test
    public void testAdd(){
        //System.out.println("www");
        //1.创建计算器对象
        Calculator c=new Calculator();
        //2.调用add方法
        int result=c.add(1,2);
        System.out.println(result);

        //断言语句
        Assert.assertEquals(3,result);
    }

    @Test
    public void testsub(){
        Calculator c1=new Calculator();
        int result1=c1.sub(1,2);
        System.out.println("test");
        Assert.assertEquals(-1,result1);
    }
}
