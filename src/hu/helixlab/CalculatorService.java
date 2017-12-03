package hu.helixlab;

/* CalculatorService nevü osztály készítése, mely publikus,*/


public class CalculatorService {


    /* isItEven metódus készítése, mely boolean típusú és publikus,
     egy int típusú változó a bemenõ paramétere, maradékos osztással eldönthetõ, hogy páros vagy páratlan a szám, ha páros akkor visszatér true-val,
     ha páratlan akkor false lesz a visszatérési érték.*/

    public boolean isItEven(int number) {
        return number % 2 == 0;
    }


}
