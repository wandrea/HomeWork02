package hu.helixlab;

/* CalculatorService nevü osztály készítése, mely publikus,*/


import java.util.Random;

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
    public Float calculate(int x, int y, char operation) {
        switch (operation) {
            case '+':
                return (float) x + y;
            case '-':
                return (float) x - y;
            case '*':
                return (float) x * y;
            case '/':
                return (float) x / y;
            default:
                return null;
        }
    }

    /*Létrehoztam egy Random objektumot, ezzel generáltam egy float típusú számot, majd ezt 25-tel szorozva és 25-t hozzáadva megkaptam a 25-50 közötti random számot.
    Az if feltételben megnéztem, hogy a szám egyezik e az int típusra kasztolt értékkel, mert ha igen, akkor egész szám, egyéb esetben nem egész szám. */
    public void generateRandomNumber() {
        Random random = new Random();
        float randomNumber = random.nextFloat() * 25 + 25;
        if (randomNumber == (int) randomNumber) {
            System.out.print("egész szám: " + randomNumber);
        } else {
            System.out.print("nem egész szám: " + randomNumber);
        }

    }

    /*Létrehoztam egy Random objektumot, ezzel generáltam két random számot 100 és 150 között. If-vel megvizsgáltam a megadott feltételeket.*/
    public void generateAndCompareRandomNumbers() {
        Random random = new Random();
        int randomNumber1 = random.nextInt(50) + 100;
        int randomNumber2 = random.nextInt(50) + 100;
        if (randomNumber1 > randomNumber2 && randomNumber1 % 2 == 0 || randomNumber1 < randomNumber2 && randomNumber1 % 2 != 0) {
            System.out.print(randomNumber1);
        } else if (randomNumber1 < randomNumber2 && randomNumber2 % 2 != 0) {
            System.out.print(randomNumber2);
        } else {
            System.out.print(Math.pow(randomNumber1, randomNumber2));
        }
    }
}
