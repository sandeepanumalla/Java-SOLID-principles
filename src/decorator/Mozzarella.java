package decorator;

public class Mozzarella extends ToppingDecorator  {

    Mozzarella(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding Dough");
        System.out.println("Adding Mozzarella");
    }

    @Override
    public int getCost() {
        return tempPizza.getCost() + 5;
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription()+ ",  Mozzarella";
    }

}
