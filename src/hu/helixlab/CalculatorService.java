package hu.helixlab;

/* CalculatorService nevü osztály készítése, mely publikus,*/


public class CalculatorService {


    /*Publikus isItEven metódus készítése, melynek visszatérési értéke boolean típusú,
     egy int típusú változó a bemenõ paramétere, maradékos osztással eldönthetõ, hogy páros vagy páratlan a szám, ha páros akkor visszatér true-val,
     ha páratlan akkor false lesz a visszatérési érték.*/

    public boolean isItEven(int number) {
        return number % 2 == 0;
    }

    /*A calculate metódus két int típusú és egy char típusú bemenõ paramétert vár,
    a visszatérési értéke Float típusú, arra az esetre, ha nem ismerhetõ fel az operation paraméterben lévõ karakter.
    A switch szerkezetben megvizsgáljuk az operation paraméterben található karaktert és ha az alapmûveletek közül valamelyik, akkor elvégezzük a mûveletet.
    A mûveletek eredménye a visszatérési típusra lettek kasztolva.*/
    public Float calculate(int x, int y, char operation){
        switch (operation){
            case '+':
                return (float)x+y;
            case '-':
                return (float)x-y;
            case '*':
                return (float)x*y;
            case '/':
                return (float)x/y;
            default:
                return null;
        }
    }
}
