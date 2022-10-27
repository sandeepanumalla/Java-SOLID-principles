import java.util.List;

// Open Closed Principle - the class should be open for extension and closed for modification

/*
 * New requirements
 * Instead of just returning boolean, the team wants to start throwing errors when
 * if any sensor is not working. Assume this class is heavily used.
 * 
 * Now would you do this? Can you change the code directly?
 * 
 */


public class FormulaOne {
    List<Sensor> sensors;
    public boolean isEverythingWorking() throws NotWorkingException{
        boolean isOk = false;
        for(Sensor sensor: sensors){
            isOk = sensor.check();
            if(!isOk){
                throw new NotWorkingException();
            }
            
        }
        return isOk;
    }    
}

class NotWorkingException extends Exception{
    NotWorkingException(){
        super();
    }

}


/*
 * Requirement:
 * Engine is a class developed by another team. Since every car must have an engine, we want to
 * reference it here.
 * So the requirements needs you to have a private field engine with having isEngineWorking method.
 * How you implement this feature using OCP?
 */

 class Formula_V2{
    List<Sensor> sensors;
    public boolean isEverythingWorking(){
        boolean isOK = false;
        // for(Sensor sensor: sensors){
        //     isOk = sensors.;
        //     if(isOK){
        return isOK;
               
        //     }
        // }
    }

 }