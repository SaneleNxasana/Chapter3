package za.ac.cput.sanele;

import java.io.Serializable;

/**
 * Created by NXA-C.unltd on 2016/03/13.
 */
public class CarData implements Serializable
{
    private int power;
    private int topSpeed;
    private String fuelType;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null || getClass() != obj.getClass())
            return false;

        CarData cData = (CarData) obj;
        return power == cData.power;
    }

    @Override
    public int hashCode() {
        return power;
    }}
