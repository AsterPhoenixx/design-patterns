package Burger;

public abstract class BurgerDecorator implements Burger {
  protected Burger eggAndCheese;
  
 
    public BurgerDecorator(Burger eggAndCheese) {
    	this.eggAndCheese=eggAndCheese;
    }
    @Override
    public void add() {
		this.eggAndCheese.add();
	}
}
