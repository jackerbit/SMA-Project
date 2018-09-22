package sms.main;

import java.util.Scanner;

import sms.function.*;

public class SchoolManagementSystem {

	public static void showMenu() {
		System.out.println("=================================================");
		System.out.println("|  1. Show information of all school            |");
		System.out.println("|  2. Find school following year of student     |");
		System.out.println("|  3. Find school following number of student   |");
		System.out.println("|  4. Find school following name                |");
		System.out.println("|  5. Exit                                      |");
		System.out.println("=================================================");
	}
	
	public static int getOption(Scanner sc) {
		String choice="5";
		do {
			System.out.print("Enter your choice: ");
			choice = sc.nextLine();
		}while(!choice.matches("[1-5]"));
		System.out.println();
		return Integer.parseInt(choice);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fileName = "Database.txt";
		
		SchoolDAO dao = new SchoolDAO();
		ManagementSchool ms = new ManagementSchool(dao.loadData(fileName));
		
		
		int choice = 2;
		do {
			showMenu();
			choice = getOption(sc);
			switch(choice) {
				case 1: ms.display(); break;
				case 2:{
					String year;
					do {
						System.out.print("Enter year: ");
						year = sc.nextLine();
					}while(!year.matches("[0-9]{1,2}"));
					ms.findSchoolByYear(year);
					break;
					
				}
				case 3:{
					int numberOfStudent=0;
					do {
						System.out.print("Enter year: ");
						numberOfStudent = Integer.parseInt(sc.nextLine());
					}while(numberOfStudent<=0);
					ms.findSchoolByNumberOfStudent(numberOfStudent);
					break;
					
				}
				case 4:{
					String name;
					do {
						System.out.print("Enter name: ");
						name = sc.nextLine();
					}while(name.equals(""));
					ms.findSchoolByName(name);
					break;
					
				}
				case 5: System.out.println("Exit !"); break;
			}
		}while(choice!=5);
	}

}
