import hW.HW_13;
import net.bytebuddy.build.ToStringPlugin;
import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HW_13Test {
    @Test
    public void Testst() {
        HW_13 hw13 = new HW_13();
        String st = "Привет всем кто живет на луне!";
        int maxLength = 10;


        String result = StringUtils.abbreviate(st, maxLength);

        Assert.assertEquals(result,"Привет ...");

    }


    @Test

    public void Testst1(){
       String st = "Привет всем кто живет на луне!";
       int  maxLength = 20;

       String result = StringUtils.abbreviate(st, maxLength);
       Assert.assertEquals(result,"Привет всем кто ж...");


    }
}
