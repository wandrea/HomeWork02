package hu.helixlab;

/* CalculatorService nev� oszt�ly k�sz�t�se, mely publikus,*/


public class CalculatorService {


    /* isItEven met�dus k�sz�t�se, mely boolean t�pus� �s publikus,
     egy int t�pus� v�ltoz� a bemen� param�tere, marad�kos oszt�ssal eld�nthet�, hogy p�ros vagy p�ratlan a sz�m, ha p�ros akkor visszat�r true-val,
     ha p�ratlan akkor false lesz a visszat�r�si �rt�k.*/

    public boolean isItEven(int number) {
        return number % 2 == 0;
    }


}
