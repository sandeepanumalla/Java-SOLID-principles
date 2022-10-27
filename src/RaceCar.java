import java.util.List;

public class RaceCar {
  
        List<Sensor> sensors;
        public boolean isSensorWorking(){
            boolean isWorking = false;
            for(Sensor sensor: sensors){
                isWorking = sensor.check();
            }
            return isWorking;
        }
}

 class RaceTruck{
    List<Sensor> sensors;
    public boolean isSensorsWorking(){
        boolean isWorking = false;
        for(Sensor sensor: sensors){
            isWorking = sensor.check();
        }
        return isWorking;
    }
    
}

interface Sensor{
    public boolean check();
} 

class GyroSensor implements Sensor{

    @Override
    public boolean check() {
        // TODO Auto-generated method stub
        return true;
    }
    
}

class FuelSensor implements Sensor{

    @Override
    public boolean check() {
        // TODO Auto-generated method stub
        return true;
    }

}