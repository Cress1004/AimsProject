package hust.soict.hedspi.garbage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NoGarbage {
	public static long Readfile() {
		long start = System.currentTimeMillis();
		 BufferedReader br = null;
		 StringBuilder sb = new StringBuilder();
	     try {   
	        br = new BufferedReader(new FileReader("/home/cress/parser.txt"));       
	        String textInALine;
            while ((textInALine = br.readLine()) != null) {
            	//System.out.println(textInALine);
            	sb.append(textInALine);
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
	     System.out.println("No Garbarge (use string builder)");
	   return  System.currentTimeMillis() - start;
	}
}
