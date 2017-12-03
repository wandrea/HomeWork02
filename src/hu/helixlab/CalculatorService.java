package hu.helixlab;

/* CalculatorService nev� oszt�ly k�sz�t�se, mely publikus,*/


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
