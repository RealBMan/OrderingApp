/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Author: Bowale Adetunji
 * Date: 9 November 2021
 * Purpose: Culminating project - App that allows students to purchase food from the plaza using SQL database
 */

import java.util.ArrayList;

public class Basketprint extends Basketfunction {
    
    private ArrayList<String> print = new ArrayList<String>();
    
    private ArrayList<Integer> num = new ArrayList<Integer>();
    
    private static double total = 0; //Initializes the variable
    
    private static double wallet = 50; //Initizlizes the wallet value to 50
       
    public Basketprint(){ //INitilizes the extension of the previous constructor
    
        super();
        
    }
    
    public static ArrayList<String> print2(){ //Method that prints the items of the array list
        
       ArrayList<String> num = new ArrayList<String>(); //Creates a new array list
        
        for (int y = 0; y <= item.size() - 1; y++){ //Goes through each value of the array 
            
            num.add(item.get(y) + "....." + "$" + price.get(y)); //Adds the values of the items to the array list
           
        }
        
         return num; //Returns the array list
    }
    
    
 public static double addup(){ //Method that adds up the totals in the arrya list
 
        for (int y = 0; y <= price.size() - 1; y++){ //Goes through each value in the array list
           
            total = total + price.get(y); //Adds up the total amount 

        }
        
        return total; //Returns the total
    }
 
 public static double walletamt(){ //Method that sets the value of the wallet
     
      if (total < wallet){ //Ensures the total pruchase does not exceed the amount in the wallet
  
       wallet = wallet - total; //Substracts from the total if an item has been bought
       
      }
   
        return wallet; //Returns value
    
    }
 
     public void clear(){ //Clears the array list when an Item has been bought
        
        item.clear();
        
        price.clear();
        
        total = 0;
       
    }
}
