import java.util.Scanner;

public class datum {
	
	static Scanner scanner = new Scanner(System.in);
	static int year = 0;
	static String years;
	static int day;
	static String days;
	static String months;
	static int month;
	static int time;

	public static void main(String[] args) 
	{
		datume();
	}
	
	public static void datume()
	{
		while ( true)
		{
			days = scanner.next();
			if ( !days.equals(""))
			{
				break;
			}
		}
		day = Integer.parseInt(days);
		while ( true)
		{
			months = scanner.next();
			if ( !months.equals(""))
			{
				break;
			}
		}
		month = Integer.parseInt(days);
		while ( true)
		{
			years = scanner.next();
			if ( !years.equals(""))
			{
				break;
			}
		}
		year = Integer.parseInt(years)-1900;
		time = year * 365;
		
		
	}

}
