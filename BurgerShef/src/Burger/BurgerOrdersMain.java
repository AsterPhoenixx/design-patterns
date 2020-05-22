package Burger;

import java.util.Scanner;

public class BurgerOrdersMain {

	public static void main(String[] args) {
		BurgerFacade burger =  new BurgerFacade();
		Burger burgger = new Burger() {

			@Override
			public void add() {
			}
		};
		Burger withCheeseAndEggs = new CheeseAndEggSupplement(burgger);
		Scanner scanner = new Scanner(System.in);
	    int intro;
	   
	    System.out.println(".....................................................................");
	    System.out.println("...............WELCOME TO OUR GALACTICAL SUPER SHOP..................");
	    System.out.println(".............<most delicious burgers of the universe>................");
	    System.out.println(".....................................................................");
	    System.out.println(".                                                                   .");
	    System.out.println(".                                                                   .");
	    System.out.println(".             1. Classic Galactiacal Burger!                        .");
	    System.out.println(".                                                                   .");
	    System.out.println(".                                                                   .");
	    System.out.println(".             2. Galactic Burger with Cheese!                       .");
	    System.out.println(".                                                                   .");
	    System.out.println(".                                                                   .");
	    System.out.println(".             3. Galactic Burger with Eggs!                         .");
	    System.out.println(".                                                                   .");
	    System.out.println(".                                                                   .");
	    System.out.println(".             4.Super Mega Galactic Burger With Cheese and Eggs     .");
	    
	    System.out.println("....................................................................>"); 
	    System.out.println("			Enter Number for Order :"); 
	    intro = scanner.nextInt();
		switch (intro) {
        case 1:  burger.classic();
                 break;
        case 2:  burger.addCheese();
                 break;
        case 3:  burger.addEgg();
                 break;
        case 4:  withCheeseAndEggs.add();
                 break;
        default:  System.out.println("There is no such Burger!");
                 break;
      }
	    
	}
}
