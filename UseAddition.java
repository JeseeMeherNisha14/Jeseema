package LogFiles;

import org.apache.log4j.BasicConfigurator;

public class UseAddition {
	
	public static void main(String[] args) {
		BasicConfigurator.configure();
		
		Addition add=new Addition();
		add.addition(20, 60);
		
	}

}
