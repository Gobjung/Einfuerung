import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Passwort 
{
	static List<Character> Pass = new ArrayList<Character>();
	static char chars[];
	static String pass = "";
	static boolean l;
	static boolean g;
	static boolean k;
	static boolean s;
	static boolean z;
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) 
	{
		scan();
		pru();
	}
	public static void scan()
	{
		while ( true)
		{
			pass = scanner.next();
			if ( !pass.equals(""))
			{
				break;
			}
		}
		
		
	}
	public static void pru()
	{
		chars = pass.toCharArray();
		for (int i = 0; i < chars.length;i++)
		{
			if (Character.isLetter(chars[i]))
			{
				if (Character.isUpperCase(chars[i]))
				{
					g = true;
				}
				else
				{
					k = true;
				}
			}
			else if (Character.isDigit(chars[i])) 
			{
				z = true;
			}
			else
			{
				s = true;
			}
		}
		if (12 <= chars.length)
		{
			l = true;
		}
		if (l == true && g== true && k== true && s== true && z== true)
		{
			System.out.print("Passdwort ist sicher");
		}
		else
		{
			System.out.println("Passwort ist nicht sicher:");
			if (l == false)
			{
				System.out.println("-zu kurz");
			}
			if (g == false)
			{
				System.out.println("-kein Großbuchstaben enthalten");
			}
			if (k == false)
			{
				System.out.println("-kein Kleinbuchstabe enthalten");
			}
			if (z == false)
			{
				System.out.println("-keine Zahl enthalten");
			}
			if (s == false)
			{
				System.out.println("-kein Sonderzeichen enthalten");
			}
		}
	}
	
}
