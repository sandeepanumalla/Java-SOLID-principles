/*
 * Requirment
 * 
 */


interface BasicCar{
    void steer(double angle);
    void brake();
    void accelerate(double force);
} 

interface NitroBoostCar extends BasicCar{
    void activateNitro();
}

interface CarWithSensor extends BasicCar{
    boolean isSensorWorking(String[] sensorArray);
}
public class NitroBoostedCar implements NitroBoostCar {

    @Override
    public void steer(double angle) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void brake() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void accelerate(double force) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void activateNitro() {
        // TODO Auto-generated method stub
        
    }
    
}
