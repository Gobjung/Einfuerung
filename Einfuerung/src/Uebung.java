
public class Uebung
{
	
	String beliebigerString = "Hallo";
	static int eineZahl = 13;
	static int nochEineZahl = 13;
	static int ergebnis = 0;
	static float eineZahlMitKomma = (float) 170;
	static int ende = 120;
	static int v1 = 0;
	static int v2 = 1;
	static int v3 = 0;
	
	
	public static void main(String[] args) 
	{
		//rechenspiele(eineZahl,nochEineZahl);
		//ungrade(ende);
		//fibonacci();
		System.out.print(12%10);
	}
	
	public static void rechenspiele(int eineZahl,int nochEineZahl)
	{
		ergebnis = eineZahl * nochEineZahl;
		if(eineZahlMitKomma<ergebnis)
		{
			System.out.print(ergebnis-eineZahlMitKomma);
		}
		else
		{
			System.out.println("Das Ergebnis ist zu klein");
		}
	}
	public static void ungrade(int ende)
	{
		ende = ende / 2;
		for(int i = 0; i <= ende; i++ )
		{
			System.out.println(2*i-1);
		}
	}
	public static void fibonacci()
	{
		for( int i = 1; i < 500;)
		{
			v3 = v1 + v2;
			v1 = v2;
			v2 = v3;
			System.out.println(v3);
			i = v2 - v1;
		}
	}

}
