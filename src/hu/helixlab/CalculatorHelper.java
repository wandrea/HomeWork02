package hu.helixlab;

import java.util.Scanner;


public class CalculatorHelper {

    /*A doCalculate met�dusban l�trehoztam h�rom v�ltoz�t, ezeknek a konzolr�l beolvasott adatokat adom �rt�k�l. A konzolr�l val� beolvas�st a Scanner oszt�ly egy obijektum�val v�gzem el,
    * majd l�trehozok egy CalculatorService obijektumot �s ennek az obijektumnak a calculate met�dus�nak az eredm�ny�t kiiratom a konzolra.*/
    public void doCalculate (){
        int x;
        int y;
        char operation;

        Scanner scanner= new Scanner(System.in);
        System.out.print ("Adja meg az x-t: ");
        x=scanner.nextInt();
        System.out.print ("Adja meg az y-t: ");
        y=scanner.nextInt();
        System.out.print ("Adja meg a m�veletet: ");
        operation=scanner.next().charAt(0);/*nincs next met�dus karakter beolvas�s�ra, ez�rt string-k�nt kellett, �s charAt-tel visszak�rem a 0. karakter�t a stringnek.*/

        CalculatorService calculatorService = new CalculatorService();
        System.out.println ("Eredm�ny: "+calculatorService.calculate(x,y,operation));
    }
}
