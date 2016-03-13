package za.ac.cput.sanele;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by NXA-C.unltd on 2016/03/13.
 */
public class TestCar
{
    private CarService cServ;

    @Before
    public void setUp() throws Exception
    {

    }

    @Test
    public void test_Car() throws Exception
    {
        Assert.assertEquals(cServ.getCar());
    }
}
