package LogFiles;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Log4j {
	
	static Logger log=Logger.getLogger(Log4j.class);
	
	public static void main(String[] args) {
		BasicConfigurator.configure();
		
		log.info("Information");
		log.debug("Debugging");
		log.fatal("Fatal Error");
		log.error("Error");
		log.warn("Warning message");
	}

}
