package hu.helixlab;

/* CalculatorService nev� oszt�ly k�sz�t�se, mely publikus,*/


import java.util.Random;

public class CalculatorService {


    /*Publikus isItEven met�dus k�sz�t�se, melynek visszat�r�si �rt�ke boolean t�pus�,
     egy int t�pus� v�ltoz� a bemen� param�tere, marad�kos oszt�ssal eld�nthet�, hogy p�ros vagy p�ratlan a sz�m, ha p�ros akkor visszat�r true-val,
     ha p�ratlan akkor false lesz a visszat�r�si �rt�k.*/

    public boolean isItEven(int number) {
        return number % 2 == 0;
    }

    /*A calculate met�dus k�t int t�pus� �s egy char t�pus� bemen� param�tert v�r,
    a visszat�r�si �rt�ke Float t�pus�, arra az esetre, ha nem ismerhet� fel az operation param�terben l�v� karakter.
    A switch szerkezetben megvizsg�ljuk az operation param�terben tal�lhat� karaktert �s ha az alapm�veletek k�z�l valamelyik, akkor elv�gezz�k a m�veletet.
    A m�veletek eredm�nye a visszat�r�si t�pusra lettek kasztolva.*/
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

    /*L�trehoztam egy Random objektumot, ezzel gener�ltam egy float t�pus� sz�mot, majd ezt 25-tel szorozva �s 25-t hozz�adva megkaptam a 25-50 k�z�tti random sz�mot.
    Az if felt�telben megn�ztem, hogy a sz�m egyezik e az int t�pusra kasztolt �rt�kkel, mert ha igen, akkor eg�sz sz�m, egy�b esetben nem eg�sz sz�m. */
    public void generateRandomNumber() {
        Random random = new Random();
        float randomNumber = random.nextFloat() * 25 + 25;
        if (randomNumber == (int) randomNumber) {
            System.out.print("eg�sz sz�m: " + randomNumber);
        } else {
            System.out.print("nem eg�sz sz�m: " + randomNumber);
        }

    }

}
