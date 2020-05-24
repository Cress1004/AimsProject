package hust.soict.hedspi.garbage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GarbageCreator {
	public static long Readfile() {
		long start = System.currentTimeMillis();
		 BufferedReader br = null;
		 String str = null;
	     try {   
	        br = new BufferedReader(new FileReader("/home/cress/parser.txt"));       
	        String textInALine;
            while ((textInALine = br.readLine()) != null) {
            	//System.out.println(textInALine);
            	str = str + "\n" + textInALine;
	            textInALine = br.readLine();
	        }
	      } catch (IOException e) {
	            e.printStackTrace();
	      } finally {
	      try {
	            br.close();
	      } catch (IOException e) {
	            e.printStackTrace();
	      }
	  }
	     System.out.println("Garbarge Creator(use String concat): ");
	   return  System.currentTimeMillis() - start;
	}
}
