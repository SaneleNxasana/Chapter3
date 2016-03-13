package za.ac.cput.sanele;

/**
 * Created by NXA-C.unltd on 2016/03/13.
 */
public class CarElectricityImpl implements CarService
{
    public CarData getCar()
    {
        CarData carData = new CarData();
        carData.setPower(150);
        carData.setTopSpeed(200);
        carData.setFuelType("Electricity");
        return carData;
    }
}
