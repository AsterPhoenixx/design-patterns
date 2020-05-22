package Burger;

public class CheeseAndEggSupplement extends BurgerDecorator {

	public CheeseAndEggSupplement(Burger eggAndCheese) {
		super(eggAndCheese);
	}
	public void add() {
		eggAndCheese.add();
		eggAndCheese(eggAndCheese);
	}
	
	private void eggAndCheese(Burger eggAndCheese) {
		//...
		System.out.println("You Ordered With Cheese And Eggs");
	}

}
