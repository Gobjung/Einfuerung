import java.util.ArrayList;
import java.util.List;

public class ArrayUebung 
{
	static List<String> ArrayUebung = new ArrayList<String>();
	static List<String> Monat = new ArrayList<String>();
	static List<String> Tage = new ArrayList<String>();
	static int y;
	static int x1;
	static int x2;
	static List<Character> abc = new ArrayList<Character>();
	static List<Integer> Anz = new ArrayList<Integer>();
	static List<Integer> A1 = new ArrayList<Integer>();
	static List<Integer> A2 = new ArrayList<Integer>();
	static String a1 = "as1d  f";
	static String a2 = "asf1d";
	static char aa1[];
	static char aa2[];
	static boolean anagram = true;
	
	public static void main(String[] args) 
	{
		//wzuweisen();
		//veraendern();
		//ausgeben();
		//mzuweisen();
		//tzuweisen();
		//mausgeben();
		//harshad();
		bzuweisen();
		anagram();
	}
	
	public static void wzuweisen()
	{
		ArrayUebung.add("Montag");
		ArrayUebung.add("Dinstag");
		ArrayUebung.add("Mittwoch");
		ArrayUebung.add("Donnerstag");
		ArrayUebung.add("Freitag");
		ArrayUebung.add("Samstag");
		ArrayUebung.add("Sonntag");
	}
	
	public static void veraendern()
	{
		ArrayUebung.set(4, "Nochnichtfreitag");
	}
	
	public static void ausgeben()
	{
		for(int i=0; i < ArrayUebung.size()
				; i++) 
				{
					System.out.println(ArrayUebung.get(i));
				}
	}
	public static void mzuweisen()
	{
		Monat.add("Januar");
		Monat.add("Februar");
		Monat.add("März");
		Monat.add("April");
		Monat.add("Mai");
		Monat.add("Juni");
		Monat.add("Juli");
		Monat.add("August");
		Monat.add("September");
		Monat.add("Oktober");
		Monat.add("November");
		Monat.add("Dezember");
	}
	public static void tzuweisen()
	{
		Tage.add("31");
		Tage.add("28");
		Tage.add("31");
		Tage.add("30");
		Tage.add("31");
		Tage.add("30");
		Tage.add("31");
		Tage.add("31");
		Tage.add("30");
		Tage.add("31");
		Tage.add("30");
		Tage.add("31");
	}
	public static void mausgeben()
	{
		for (int i = 0; i<12; i++)
		{
			System.out.println("Der Monat " + Monat.get(i) + " hat genau " + Tage.get(i) + " Tage!");
		}
	}
	public static void harshad()
	{
		for (int i = 1; i<=100; i++)
		{
			x1 = i%10;
			x2 = (i-x1)/10;
			y = x2%10;
			x2 = (x2-y)/10;
			y = x1+x2+y;
			if ((i%y)==0)
			{
				System.out.println(i);
			}
		}
	}
	
	public static void bzuweisen()
	{
		abc.add('a');
		abc.add('b');
		abc.add('c');
		abc.add('d');
		abc.add('e');
		abc.add('f');
		abc.add('g');
		abc.add('h');
		abc.add('i');
		abc.add('j');
		abc.add('k');
		abc.add('l');
		abc.add('m');
		abc.add('n');
		abc.add('o');
		abc.add('p');
		abc.add('q');
		abc.add('r');
		abc.add('s');
		abc.add('t');
		abc.add('u');
		abc.add('v');
		abc.add('w');
		abc.add('x');
		abc.add('y');
		abc.add('z');
		abc.add('0');
		abc.add('1');
		abc.add('2');
		abc.add('3');
		abc.add('4');
		abc.add('5');
		abc.add('6');
		abc.add('7');
		abc.add('8');
		abc.add('9');
		for(int i = 0; i < 36; i++)
		{
			A1.add(0);
			A2.add(0);
		}
	}
	public static void anagram()
	{
		a1 = a1.toLowerCase();
		a2 = a2.toLowerCase();
		aa1 = a1.toCharArray();
		aa2 = a2.toCharArray();
		for(int i = 0; i < aa1.length; i++)
		{
			for(int j = 0; j < 36; j++)
			{
				if(aa1[i] == abc.get(j))
				{
					A1.set(j, A1.get(j) + 1);
				}
			}
		}
		for(int i = 0; i < aa2.length; i++)
		{
			for(int j = 0; j < 36; j++)
			{
				if(aa2[i] == abc.get(j))
				{
					A2.set(j, A2.get(j) + 1);
				}
			}
		}
		for(int i = 0; i < 36; i++)
		{
			if(A1.get(i) == A2.get(i) && anagram)
			{
				anagram = true;
			}
			else
			{
				anagram = false;
			}
		}
		if(anagram)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Kein Anagram");
		}
	}

}
