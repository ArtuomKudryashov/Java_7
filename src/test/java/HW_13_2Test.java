import hW.HW_13_2;
import hW.HW_13_2.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import static hW.HW_13_2.add;

public class HW_13_2Test {
    HW_13_2 hw_13_2 = new HW_13_2();

    @Test
    public void testAdd(){

         int  result = add(5,10);
        Assert.assertEquals(result, 15);

    }
    @Test
    public void testMult(){
        int  result = hw_13_2.mult(5,10);
        Assert.assertEquals(result, 50);

    }
    @Test
    public void testSub(){
        int  result = hw_13_2.sub(5,10);
        Assert.assertEquals(result, -5);

    }
    @Test
    public void testDiv(){
        double result = hw_13_2.div(5,1);
        Assert.assertEquals(result, 5);

    }
}
