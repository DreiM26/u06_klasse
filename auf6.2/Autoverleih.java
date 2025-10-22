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

		auto1            = new Auto();
		auto2            = new Auto();
		auto3            = new Auto();

		kunde1           = new Kunde();

		kunde1.name      = "Schindler";

		auto1.autonummer = "HH-MA-26";
		auto2.autonummer = "HH-MA-16";
		auto3.autonummer = "HH-MA-21";

		auto1.tagespreis = 20;
		auto2.tagespreis = 25;
		auto3.tagespreis = 30;

		auto1.farbe = Farbe.schwarz;
		auto2.farbe = Farbe.rot;
		auto3.farbe = Farbe.blau;
      
      Darsteller.zeige(auto1, auto2, auto3, kunde1);
   }
}