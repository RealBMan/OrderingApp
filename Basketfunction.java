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

public class Basketfunction {
    
  /*Varibales and arraylists used in the methods*/

   static ArrayList<String> item = new ArrayList<String>();
   
   static ArrayList<Double> price= new ArrayList<Double>();
    
    public Basketfunction(){
    
    }
    
    public void add(String a, double b){ //Add items to the arraylist function
        
        item.add(a);
        
        price.add(b);
       
    }
    
}
