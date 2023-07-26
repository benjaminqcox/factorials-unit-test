package com.bootcamp;

public class Factorials 
{
    public static int findRootFactorial(int i)
    {
        int currentFact = 1;
        int counter = 0;

        do {
            currentFact *= ++counter;
        } while (currentFact < i);

        return currentFact == i ? counter : -1;
    }
}
