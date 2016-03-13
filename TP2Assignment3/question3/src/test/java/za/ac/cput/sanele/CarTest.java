package za.ac.cput.sanele;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by NXA-C.unltd on 2016/03/13.
 */
public class CarTest
{
    private CarService carServ;

    @Test
    public void test_Power() throws Exception
    {
        CarData cdata = carServ.getCar();
        System.out.println("The fuel used is: "+carServ.getCar().getClass());
        Assert.assertEquals(cdata.getPower(), 150);
    }

    @Test
    public void test_TopSpeed() throws Exception
    {
        CarData cdata = carServ.getCar();
        Assert.assertEquals(cdata.getTopSpeed(), 200);
    }
}
