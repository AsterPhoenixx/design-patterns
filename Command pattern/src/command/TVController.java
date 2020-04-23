package command;

public class TVController {
	
	private int channelNumber = 0;
	private int volume = 0;
	
	public void switchChannels (int chanel) {
		switch(chanel) 
        { 
            case 1: 
                System.out.println("БНТ"); 
                break; 
            case 2: 
                System.out.println("БНТ2"); 
                break; 
            case 3: 
                System.out.println("БТВ"); 
                break; 
            case 4: 
                System.out.println("НОВА ТВ"); 
                break;
            case 5: 
                System.out.println("Boomerang"); 
                break;
            case 6: 
                System.out.println("Planeta"); 
                break;
            case 7: 
                System.out.println("CN"); 
                break;
            case 8: 
                System.out.println("Planeta 2");
                break;
            case 9: 
                System.out.println("Diema Extra"); 
                break;
            case 10: 
                System.out.println("BTV Lady"); 
                break;
            default: 
                System.out.println("Няма такъв канал!"); 
        }  
		this.channelNumber = chanel;
	}
	public void setVolume(int volume) {
		  this.volume =volume;
		  if(channelNumber !=0) {
			 System.out.println("Volume is :" + volume); 
		     System.out.println("");  
		  }
		     else {
		    	 System.out.println("You can't volume"); 
			     System.out.println("");  
		     }
		  }
		 
	}
	
