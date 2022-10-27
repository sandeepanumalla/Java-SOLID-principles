package decorator;

public abstract class ToppingDecorator implements Pizza{
    Pizza tempPizza;
    ToppingDecorator(Pizza newPizza){
        tempPizza = newPizza;
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription();
    }

    @Override
    public int getCost() {
        return tempPizza.getCost();
    }
    
}
