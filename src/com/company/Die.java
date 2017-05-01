package com.company;

/**
 * Created by PonyExpress on 5/1/2017.
 */
public class Die {
        int sides;
        String color;
    }

class InitDie {
    public static void main(String args[]){
        Die d6Blue = new Die();
        Die d6Red = new Die();

        d6Blue.color = "Blue";
        d6Blue.sides = 6;
        d6Red.color = "Red";
        d6Red.sides = 6;

    }
}