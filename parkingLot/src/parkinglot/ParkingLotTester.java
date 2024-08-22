/**
 * Roberto Andino
 * Version 1
 * Program is done in Java programming language
 * 
 * This is the tester class with the main method to run the program, it creates 
 * car and parkingLot objects, a queue for a waiting list, and a stack for a 
 * parking lot, the stack that acts a street to park cars, is located in the 
 * parkingLot class.
 * 
 * I could not include a loop to check for incorrect user input because of the 
 * input the user is supposed to type in to retrieve or exit the program. 
 * 
 */

package parkinglot;

import java.util.*;

public class ParkingLotTester {

    public static void main(String[] args) {
       
        //last in first out - Parking Lot
        Stack<Integer> parkingLot = new Stack<>();
      
        //first in first out - Wait List
        Queue<Integer> waitList = new PriorityQueue<>();
       
        //for input
        Scanner input = new Scanner(System.in);
        
        //car object
        car cars = new car();
        
        //parking lot object
        parkingLot lot = new parkingLot();
        
        //for while loop and user input
        int tag = 1;
        
        //storing cars in parking lot stack
        for(int i = 0; i < 11; i++)
        {
            parkingLot.push(cars.getRandPlate());
     
        }
       
        System.out.println("-------Welcome to Premium Parking------\n\n");
        //to display cars in parking lot and waitlist
        lot.displayLot(parkingLot, waitList);
          
        while(tag != 0)
        {
            
            System.out.print("\n--- To park your vehicle type in 5 digit licence plate ---\n" +
                    "--- To retrieve your vehicle type in - followed by 5 digit license"
                    + " plate ---\n" + "--- To exit type in 0 ---\n--- Type: ");
            tag = input.nextInt();
            
            //parking new car in parking lot
            if(tag > 0)
            {
                //calling method parkCar to check if car can be parked in parking lot
                lot.parkCar(cars, waitList, parkingLot, tag);   
                
                //to display cars in parking lot and waitlist
                lot.displayLot(parkingLot, waitList);
            }
            else if(tag < 0) //retrieving car from parking lot and check if there
                            //is space to park car from waitList
            {
            
                //turning - number to + 
                int posTag = Math.abs(tag);
        
                //calling retrieve method from parkingLot class to retrieve car
                lot.retrieveCar(parkingLot, posTag);
               
                //calling waitList method from parkinglot class to check if car
                //on waitlist can be parked inside
                lot.waitList(waitList, parkingLot, tag);
                
                //to display cars in parking lot and waitlist
                lot.displayLot(parkingLot, waitList);
                 
            }
            
        }
           
        System.out.println("\n\n----GOODBYE----\n\n");
    }
 
    
}

//end of tester class
