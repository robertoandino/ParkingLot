/**
 * Roberto Andino
 * Version 1
 * Program is done in Java programming language
 * 
 * This is the car class to simulate a car with a random decal and random plate,
 * it had a method to create a random decal, a method to create a random plate,
 * and two methods to set and return a plate set by the user.
 * 
 */


package parkinglot;

import java.util.Random;

public class car {

    private int plate = 0;
    private int decal = 0;
    
    //constructor
    public car()
    {
    }
    
    //getter methods
    
    //returns random plate number
    public int getRandPlate()
    {
        Random rand = new Random();
       
        //generate random plate number beween 10000-20000
        int ranPlate = rand.nextInt(20000) + 10000 ;
        
        return ranPlate;
    }
        
    //returns random decal number
    public int getDecal()
    {
        //to create random number
        Random rand = new Random();
        
        //generate random number between 1-20
        decal = rand.nextInt(20) + 1;
        
        return decal;
    }
    
    //return plate set by user
    public int getPlate()
    {
        return plate;
    }
    
    //settet methods
    
    //setting plate set by user
    public void setPlate(int newPlate)
    {
        plate = newPlate;
    }
    
}

//end of car class
