package LogFiles;

import org.apache.log4j.Logger;

public class Addition {
	
	int num3;
	static Logger log=Logger.getLogger(Addition.class);
	
	public void addition(int num1,int num2) {
		
		num3=num1+num2;
		
		log.info(num3);
	}

}
