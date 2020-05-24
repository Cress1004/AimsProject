package hust.soict.hedspi.test.media;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Track;

public class TestMediaCompareTo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection collection = new ArrayList();
		int choice = 1;
		String title, category, director;
		float cost;
		Scanner sc = new Scanner(System.in);
		do {
			showMenu();
			choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1: // Add item to the order
//						System.out.print("Create new Dvd\nInput title: ");
//						title = sc.nextLine();
//						System.out.print("Input category: ");
//						category = sc.nextLine();
//						System.out.print("Input director: ");
//						director = sc.nextLine();
//						System.out.print("Input length: ");
//						length = sc.nextInt();
//						sc.nextLine();
//						System.out.print("Input cost: ");
//						cost = sc.nextFloat();
//						sc.nextLine();
//						CompactDisc cd = new CompactDisc(title, category, cost, length, director);
//						//orders.get(optionId).addMedia(dvd);
//						collection.add(cd);
////						System.out.print("Do you want to play this dvd? enter 0 to back");
////						option = sc.nextInt();
////						sc.nextLine();
////						if(option != 0) {
////							dvd.play();
////						}
////						System.out.println("-------------------------");
				int option =1;
				String artist;
				System.out.println("Create new Compact Disc");
				System.out.print("Input title: ");
				title = sc.nextLine();
				System.out.print("Input category: ");
				category = sc.nextLine();
				System.out.print("Input cost: ");
				cost = sc.nextFloat();
				sc.nextLine();
				System.out.print("Input director: ");
				director = sc.nextLine();
				System.out.print("Input artist: ");
				artist = sc.nextLine();
				String track_title;
				CompactDisc cd = new CompactDisc(title, category, cost);
				cd.setDirector(director);
				cd.setArtist(artist);
				int track_length = 0;
				while (option != 0) {
					System.out.print("Input track title: ");
					track_title = sc.nextLine();
					System.out.print("Input track length: ");
					track_length = sc.nextInt();
					sc.nextLine();
					Track track = new Track(track_title, track_length);
					cd.addTrack(track);
					System.out.print("Do you want add track?(enter 0 to stop)");
					option = sc.nextInt();
					sc.nextLine();
				}
				cd.setLength(cd.getLength());
				collection.add(cd);
				System.out.println("The CD is added");
			break;
			case 2: // Display the items lisit of order
				Iterator iterator = collection.iterator();
				System.out.println("------------------");
				System.out.println("The order currently in the order are: ");
				
				while(iterator.hasNext()) {
					System.out.println("DVD: " + ((Media)iterator.next()).getTitle());
				}
				java.util.Collections.sort((java.util.List)collection);
				iterator = collection.iterator();
				System.out.println("---------------------");
				System.out.println("The DVD is sorted order are: ");
				while(iterator.hasNext()) {
					System.out.println("DVD: " + ((Media)iterator.next()).getTitle());
				}
				System.out.println("---------------------");
				break;
			case 0: // exit
				System.out.println("Ban da chon thoat khoi chuong trinh!");
				break;
			default:
				System.out.println("Moi ban lai nhap lai lua chon!");
				System.out.println("-------------------------");
				break;
			}
		} while (choice != 0);
		sc.close();
}

	public static void showMenu() {
		System.out.println("Order Management Application: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add items");
		System.out.println("2. Display the items list of order");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
	}
	public static void selectTypeMenu() {
		System.out.println("Select type of media");
		System.out.println("1.Digital Video Disc");
		System.out.println("2.Book");
		System.out.println("3.Compact Disc");
		System.out.println("0. Exit");
		System.out.println("Please choose a number of Type Media!");
	}

}
