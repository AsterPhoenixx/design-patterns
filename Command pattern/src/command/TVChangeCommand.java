package command;

import java.util.Random;

public class TVChangeCommand implements Command {

	private TVController tVController;
	
	public TVChangeCommand(TVController tVController) {
		this.tVController = tVController;
	}

	@Override
	public void execute() {
		 Random rand = new Random(); 
	      int channel = rand.nextInt(10);
	      int volume = rand.nextInt(100);
		this.tVController.switchChannels(channel);
		this.tVController.setVolume(volume);
	}

}
