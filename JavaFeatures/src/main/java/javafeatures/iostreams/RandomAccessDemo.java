package javafeatures.iostreams;

import java.io.*;

public class RandomAccessDemo {
	public static void main(String args[]) throws Exception {
		try (RandomAccessFile randomFile = new RandomAccessFile("C:\\Users\\Gourisha Hegde\\Desktop\\Log4j.txt", "rw");) {
			randomFile.writeUTF("Writing");
			System.out.println("Current position:" + randomFile.getFilePointer());
			randomFile.seek(0);
			System.out.println(randomFile.readUTF());
			System.out.println("Current position:" + randomFile.getFilePointer());
		} catch (FileNotFoundException e) {
			System.err.println("File mentioned not found in the specified location.\r\nCause : "+ e.getMessage());
			e.printStackTrace();
		}

	}
}
