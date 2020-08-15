package javafeatures.exceptions;

import org.apache.log4j.Logger;

public class JavaExceptionSample1 {
	
	static Logger logger = Logger.getLogger(JavaExceptionSample1.class);

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		try {
			int z = x/y;
			logger.info("Result is : "+z);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
	}

}
