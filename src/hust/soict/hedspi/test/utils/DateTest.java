package hust.soict.hedspi.test.utils;

import hust.soict.hedspi.aims.utils.DateUtils;
import hust.soict.hedspi.aims.utils.MyDate;

public class DateTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateUtils dateUtils = new DateUtils();
		MyDate []arrayDate = new MyDate[4];
		
		arrayDate[0]= new MyDate("second", "September", "twenty nineteen");
		arrayDate[1]= new MyDate(31,1,1999);
		arrayDate[2]= new MyDate(29,2,1999);
		arrayDate[3]= new MyDate(12,3,1998);

		dateUtils.sortDate(arrayDate);
		System.out.println("Sort date: ");
		dateUtils.printArrDate(arrayDate);
		
		//printf format
		//arrayDate[0].printFormat();
	}
}
