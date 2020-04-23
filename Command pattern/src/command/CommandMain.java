package command;

import java.util.Random;

public class CommandMain {

	public static void main(String[] args) {

		RemoteController remoteController = new RemoteController();
		TVController tvchannel = new TVController();
		Command tvconmands = new TVChangeCommand(tvchannel);
		
	    Random randTV = new Random(); 
	    int clickedChannels = randTV.nextInt(10);
		
		for (int i = 0; i < clickedChannels; i++) 
		{
			
			remoteController.setCommand(tvconmands);
			remoteController.pressButton();	
	    }

	}

}
