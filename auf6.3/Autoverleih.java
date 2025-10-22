// u06_klasse
// auf6.1

public class Autoverleih
{
   public static void main(String[] args)
   {
      Auto auto1;
      Auto auto2;
      Auto auto3;

		Kunde kunde1;
		Kunde kunde2;
		Kunde kunde3;
		Kunde kunde4;
		Kunde kunde5;
		Kunde kunde6;

		auto1            = new Auto();
		auto2            = new Auto();
		auto3            = new Auto();

		kunde1           = new Kunde();
		kunde2			  = new Kunde();
		kunde3           = new Kunde();
		kunde4			  = new Kunde();
		kunde5           = new Kunde();
		kunde6			  = new Kunde();

		kunde1.name      = "Schindler";
		kunde2.name		  = "Arenas";		
		kunde3.name      = "Perez";
		kunde4.name		  = "Rudess";		
		kunde5.name      = "Petrucci";
		kunde6.name		  = "Portnoy";

		auto1.autonummer = "HH-MA-26";
		auto2.autonummer = "HH-MA-16";
		auto3.autonummer = "HH-MA-21";

		auto1.tagespreis = 20;
		auto2.tagespreis = 25;
		auto3.tagespreis = 30;

		auto1.farbe = Farbe.schwarz;
		auto2.farbe = Farbe.rot;
		auto3.farbe = Farbe.blau;

		kunde1.stammkunde = true;
		kunde2.stammkunde = true;

      
      Darsteller.zeige(auto1, auto2, auto3, kunde1, kunde2, kunde3);
   }
}