package javafeatures.exceptions;

import org.apache.log4j.Logger;

public class JavaExceptionSample1 {
	
	static Logger logger = Logger.getLogger(JavaExceptionSample1.class);

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		divide(x,y);
	}
	
	private static void divide(int x, int y) {
		try {
//			int z = (y != 0) ? (x/y) : -1;
			int z = x/y;
			logger.info("Result is : "+z);
		} catch (Exception e) {
			logger.error("Error message"+e.getMessage());
			logger.error("Erro toString()"+e.toString());
		}
	}

}
