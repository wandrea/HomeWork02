package hu.helixlab;

import java.util.Scanner;


public class CalculatorHelper {

    /*A doCalculate metódusban létrehoztam három változót, ezeknek a konzolról beolvasott adatokat adom értékül. A konzolról való beolvasást a Scanner osztály egy obijektumával végzem el,
    * majd létrehozok egy CalculatorService obijektumot és ennek az obijektumnak a calculate metódusának az eredményét kiiratom a konzolra.*/
    public void doCalculate (){
        int x;
        int y;
        char operation;

        Scanner scanner= new Scanner(System.in);
        System.out.print ("Adja meg az x-t: ");
        x=scanner.nextInt();
        System.out.print ("Adja meg az y-t: ");
        y=scanner.nextInt();
        System.out.print ("Adja meg a mûveletet: ");
        operation=scanner.next().charAt(0);/*nincs next metódus karakter beolvasására, ezért string-ként kellett, és charAt-tel visszakérem a 0. karakterét a stringnek.*/

        CalculatorService calculatorService = new CalculatorService();
        System.out.println ("Eredmény: "+calculatorService.calculate(x,y,operation));
    }
}
