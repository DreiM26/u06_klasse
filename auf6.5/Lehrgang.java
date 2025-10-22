// u06_klasse

public class Lehrgang
{
	public static void main(String [] args)
	{
		Teilnehmer teilnehmer1;
		Teilnehmer teilnehmer2;
		Teilnehmer teilnehmer3;
		Teilnehmer teilnehmer4;
		Teilnehmer teilnehmer5;

		teilnehmer1 = new Teilnehmer();
		teilnehmer2 = new Teilnehmer();
		teilnehmer3 = new Teilnehmer();
		teilnehmer4 = new Teilnehmer();
		teilnehmer5 = new Teilnehmer();

		teilnehmer1.name = "John";
		teilnehmer2.name = "John";
		teilnehmer3.name = "Jordan";
		teilnehmer4.name = "James";
		teilnehmer5.name = "Mike";

		teilnehmer1.vorname = "Petrucci";
		teilnehmer2.vorname = "Myung";
		teilnehmer3.vorname = "Rudess";
		teilnehmer4.vorname = "LaBrie";
		teilnehmer5.vorname = "Portnoy";

		teilnehmer1.alter = 53;
		teilnehmer2.alter = 52;
		teilnehmer3.alter = 55;
		teilnehmer4.alter = 62;
		teilnehmer5.alter = 60;

		teilnehmer1.fachrichtung = "Anwendungsentiwicklung";
		teilnehmer2.fachrichtung = "Anwendungsentiwicklung";
		teilnehmer3.fachrichtung = "Systemintegration";
		teilnehmer4.fachrichtung = "Anwendungsentiwicklung";
	   teilnehmer5.fachrichtung = "Industrieingenieur";

		System.out.printf(" Name %-7s Vorname %-9s Alter %s Fachrichtung %s\n", teilnehmer1.name, teilnehmer1.vorname, teilnehmer1.alter, teilnehmer1.fachrichtung);
		System.out.printf(" Name %-7s Vorname %-9s Alter %s Fachrichtung %s\n", teilnehmer2.name, teilnehmer2.vorname, teilnehmer2.alter, teilnehmer2.fachrichtung);
		System.out.printf(" Name %-7s Vorname %-9s Alter %s Fachrichtung %s\n", teilnehmer3.name, teilnehmer3.vorname, teilnehmer3.alter, teilnehmer3.fachrichtung);
		System.out.printf(" Name %-7s Vorname %-9s Alter %s Fachrichtung %s\n", teilnehmer4.name, teilnehmer4.vorname, teilnehmer4.alter, teilnehmer4.fachrichtung);
		System.out.printf(" Name %-7s Vorname %-9s Alter %s Fachrichtung %s\n", teilnehmer5.name, teilnehmer5.vorname, teilnehmer5.alter, teilnehmer5.fachrichtung);

	}
}
