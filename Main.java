import java.util.HashMap;
import java.util.Scanner;


public class Main {

 public static void main() {
     Scanner scanner = new Scanner(System.in);

     javaHashMap(scanner); // Anropar scannern
 }
  /*
        Integer[] myNumbers = {2, 4, 6, 8, 10, 12, 14};
        double summa = 0;
         for(int i=0; i < myNumbers.length; i++){
             System.out.println("Mata in tal " + (i + 1) + ":" + myNumbers[i]); // (i +1) eftersom array börjar på 0
                                                                                // så gör denna kodrad att det börjar
                                                                                // från 1 istället för 0
             summa += myNumbers[i];
             }
        System.out.println("Summan av talen = " + summa);
        double medeltal = summa / myNumbers.length;
        System.out.printf("Medeltalet blir: %.2f%n", medeltal); // printf skriver ut med 2 decimaler (.2 = 2 decimaler)
        }                                                       // f = float
    }                                                           // %n ny rad (likt println)
                                                                // % är en platshållare, den skriver ut medeltalet

*/

/*    public static void main(){

        ArrayList<Double> flyttal = new ArrayList<Double>();

        flyttal.add(1.3);
        flyttal.add(20.0);
        flyttal.add(35.4);
        flyttal.add(4.7);
        flyttal.add(59.5);
        flyttal.add(68.0);
        flyttal.add(71.0);

        for(Double tal : flyttal){
            System.out.println(tal);


        }

        System.out.println("Det minsta talet i listan var " + (flyttal.get(6)) + ". Det raderas");
        flyttal.remove(6);
        System.out.println("Det största talet i listan var " + (flyttal.get(0)) + ". Det raderas");
        flyttal.remove(0);


        double summa = 0;
        for(double tal : flyttal){
            summa = summa + tal;
        }
        double medeltal = summa / flyttal.size(); // .size gör att den anpassar till nya storleken av ArrayList
                                                  // precis som .length från Array
                                                  // ( .length och .size är samma beroende på vilken samlingstyp )
        System.out.printf("Medeltalet blir: %.2f%n", medeltal);*/


    private static void javaHashMap(Scanner scanner) {

        HashMap<String, Double> valutor = new HashMap<String, Double>();
        // Den första är nyckeln till valutans namn (i detta fall String)
        // och värdet är kursen från SEK (Double)



        valutor.put("JPY", 16.11);
        valutor.put("USD", 0.10);
        valutor.put("BIF", 306.68);

        double kontoSaldo = 5000.0;


        System.out.print("Du kan visa ditt saldo i följande valutor: ");
        for(String valutaNamn : valutor.keySet()){ // keySet() är nyckeln dvs ( JPY, USD, SEK, BIF)
            System.out.print(valutaNamn + " ");}
            System.out.println();
            for(int tries = 0; tries < 5; tries++) { // max 5 försök, stoppas efter 5 fel
                System.out.print("Ange Valuta: ");
                String valdValuta = scanner.next().toUpperCase(); // ändrar valdValuta till stora bokstäver dvs usd -> USD

                    if(valutor.containsKey(valdValuta)) {
                        double kurs = valutor.get(valdValuta); // hämtar valuta kursen från vald valuta
                        double nyttSaldo = kontoSaldo * kurs;
                        System.out.printf("Ditt saldo i %s blir %.2f%n", valdValuta, nyttSaldo); // %s platshållare för String (en lucka för att fylla i valuta)
                        break;

                    } else {
                        System.out.println("Ogiltig valuta.");
                        }

            }
            }
        }

