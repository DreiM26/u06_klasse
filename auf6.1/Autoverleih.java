// u06_klasse
// auf6.1

public class Autoverleih
{
   public static void main(String[] args)
   {
      Auto auto1;
      Auto auto2;
      Auto auto3;

		auto1 = new Auto();
		auto2 = new Auto();
		auto3 = new Auto();

		auto1.autonummer = "HH-MA-26";
		auto2.autonummer = "HH-MA-16";
		auto3.autonummer = "HH-MA-21";

		auto1.tagespreis = 20;
		auto2.tagespreis = 25;
		auto3.tagespreis = 30;

		auto1.farbe = Farbe.schwarz;
		auto2.farbe = Farbe.rot;
		auto3.farbe = Farbe.blau;
      
      // Hier soll der Programmcode stehen, mit dem neue
      // Auto-Objekte erzeugt und den deklarierten Variablen
      // auto1, auto2 und auto3 zugewiesen werden.
      
      // Hier soll der Programmcode stehen, mit dem den
      // Auto-Objekten die vorgesehenen Attributwerte
      // zugewiesen werden.
      
      // Die folgende Zeile darf nicht veraendert werden:
      Darsteller.zeige(auto1, auto2, auto3);
   }
}