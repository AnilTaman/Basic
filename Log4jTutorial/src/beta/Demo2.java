package beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo2 {
	
	
	private static Logger Log= LogManager.getLogger(Demo2.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Log.debug("I have click on button");				
		Log.info("Button is displayed");
		Log.error("Button is not displayed");			
		Log.fatal("Button is missing");		
	}

}
