package Burger;

public class BurgerFacade {
    private Burger classic;
    private Burger eggBurger;
    private Burger cheeseBurger;
    
    
    public BurgerFacade() {
    	this.classic= new ClassicBurger();
    	this.eggBurger= new EggSupplement();
    	this.cheeseBurger = new CheeseSupplement();
    
    }
    public void classic() {
		this.classic.add();
	}
	
	public void addEgg() {
		this.eggBurger.add();
	}
	
	public void addCheese() {
		this.cheeseBurger.add();
	}
}
