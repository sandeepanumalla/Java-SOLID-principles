package decorator;

public class PlainPizza implements Pizza{

    @Override
    public String getDescription() {

        return "adding thin dough";
    }

    @Override
    public int getCost() {

        return 4;
    }
    
}
