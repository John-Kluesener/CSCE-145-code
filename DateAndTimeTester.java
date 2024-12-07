
 //Written By John Kluesener
import java.util.Scanner;
public class DateAndTimeTester {
	Scanner input = new Scanner(System.in);
	
	private String date = "";
	private String mDiv = "/", dDiv = ":", sDiv = " ";
	private String month = "", day = "", hour = "", minute = "";
	private String answer = "";
	
	private int monthMax = 12, d0 = 30, d1 = 31, d2 = 28;
	private int hourMax = 12, minuteMax = 59, minuteMin = 0, hourMin = 1;
	private int jan = 1, feb = 2, mar = 3, apr = 4, may = 5, jun = 6, jul = 7, aug = 8, sep = 9, oct = 10, nov = 11, dec = 12;
	private int pos1 = 2, pos2 = 2, pos3 = 2;
	private int checkMonth = 0, checkDay = 0, checkHour = 0, checkMinute = 0;
	
	public void run() {
		System.out.println("Enter a date and time (MM/DD hh:mm) and the validity of that date will be determined.");
		date = input.nextLine();
		this.getMonth();
		this.getDay();
		this.getHour();
		this.getMinute();
		if(isValid()) {
			System.out.println("The entered date and time is valid.\n");
		}
		if(!isValid()) {
			System.out.println("The entered date and time is not valid.\n");
		}
		System.out.println("Would you like to use the Date and Time Tester again?\nType \"yes\" to continue or type anything else to exit.");
		answer = input.nextLine();
		if(answer.equalsIgnoreCase("yes")) {
			run();
		}
		else {
			System.exit(0);
		}
	}
	public boolean isValid() { 
		if(isValidDate() && isValidTime()) {
			return true;
		}
		if(!isValidDate() || !isValidTime()) {
			return false;
		}
		else {
			return false;
		}
	}
	public boolean isValidDate() {
		if(checkMonth <= monthMax) { 
			if(checkDay < 0) {
				return false;
			}
			if(checkDay > d0) {
				if(checkMonth == apr) {
					return false;
				}
				if(checkMonth == jun) {
					return false;
				}
				if(checkMonth == sep) {
					return false;
				}
				if(checkMonth == nov) {
					return false;
				}
			}
			if(checkDay > d1) {
				if(checkMonth == jan) {
					return false;
				}
				if(checkMonth == mar) {
					return false;
				}
				if(checkMonth == may) {
					return false;
				}
				if(checkMonth == jul) {
					return false;
				}
				if(checkMonth == aug) {
					return false;
				}
				if(checkMonth == oct) {
					return false;
				}
				if(checkMonth == dec) {
					return false;
				}
			}
			if(checkDay > d2) {
				if(checkMonth == feb) {
					return false;
				}
			}
			else {
				return true;
			}
		}
		if(checkMonth > monthMax) {
			return false;
		}
		if(checkMonth <= 0 ) {
			return false;
		}
		else {
			return true;
		}
	}
	public boolean isValidTime() {
		if(checkHour > hourMax) {
			return false;
		}
		if(checkHour < hourMin) {
			return false;
		}
		if(checkMinute > minuteMax) {
			return false;
		}
		if(checkMinute < minuteMin) {
			return false;
		}
		else {
			return true;
		}
	}
	public int getMonth() {
		pos1 = date.indexOf(mDiv);
		pos2 = date.indexOf(dDiv); 
		pos3 = date.indexOf(sDiv); 
		month = date.substring(0,pos1);
		checkMonth = Integer.valueOf(month);
		return checkMonth;
	}
	public int getDay() {
		day = date.substring(pos1+1,pos3);
		checkDay = Integer.valueOf(day);
		return checkDay;
	}
	public int getHour() {
		hour = date.substring(pos3+1,pos2);
		checkHour = Integer.valueOf(hour);
		return checkHour;
	}
	public int getMinute() {
		minute = date.substring(pos2+1);
		checkMinute = Integer.valueOf(minute);
		return checkMinute;
	}
}