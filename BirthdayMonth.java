/*
 * WAP for printing a birthday month along with "Happy Birthday"
 */


package Day2;

import java.util.Scanner;

public class BirthdayMonth {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your birthday month"); // Capture input from user
		int month = scan.nextInt();
		
		switch(month) {
		case 1:
		{
			System.out.println("January Happy Birthday");
			break;
		}
		case 2:
		{
			System.out.println("February Happy Birthday");
			break;
		}
		case 3:
		{
			System.out.println("March Happy Birthday");
			break;
		}
		case 4:
		{
			System.out.println("April Happy Birthday");
			break;
		}
		case 5:
		{
			System.out.println("May Happy Birthday");
			break;
		}
		case 6:
		{
			System.out.println("June Happy Birthday");
			break;
		}
		case 7:
		{
			System.out.println("July Happy Birthday");
			break;
		}
		case 8:
		{
			System.out.println("August Happy Birthday");
			break;
		}
		case 9:
		{
			System.out.println("September Happy Birthday");
			break;
		}
		case 10:
		{
			System.out.println("October Happy Birthday");
			break;
		}
		case 11:
		{
			System.out.println("November Happy Birthday");
			break;
		}
		case 12:
		{
			System.out.println("December Happy Birthday");
			break;
		}
		default:
		{
			System.out.println("Enter a valid month");
			break;
		}
		}

	}

}
