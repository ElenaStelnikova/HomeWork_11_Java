import org.redrover.MainHW1;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainHW1Test {

    @Test
    public void testDivision() {
        Assert.assertEquals(MainHW1.division(24, 6), 4);
    }

}
