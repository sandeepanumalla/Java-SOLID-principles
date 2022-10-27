package decorator;

public class TomatoSauce  extends ToppingDecorator{
        Pizza ttempPizza = tempPizza;
        TomatoSauce(Pizza newPizza) {
            super(newPizza);
            System.out.println("Adding TomatoSauce");
        }
    
        @Override
        public int getCost() {
            return tempPizza.getCost() + 5;
        }
    
        @Override
        public String getDescription() {
            return tempPizza.getDescription()+ ",  TomatoSauce";
        }
    
    
    
}
