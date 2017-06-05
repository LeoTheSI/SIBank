/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sibank;

import General.Commands;
import java.io.File;
import java.util.ArrayList;
/**
 *
 * @author LEONA
 */


//View your balance
//deposit money
//withdraw money

//add a new account
//deleting an account
//tranfering $ between accounts


public class SIBank {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        //2, checkings and savings
        //# name -amount-
        
        //print out opions
        //ask input on option
        
        account Checkings = new account(1110200020, "checkings");
        account Saving = new account(111020021, "savings");
        account Food = new account(111020022, "groceries");
        
        //checkings 0
        Food.deposit(200);
        Saving.deposit(300);
        
        Commands.viewUsers(new File("../src/test.txt"));
        
        ArrayList<account> acc = new ArrayList<>();
        acc.add(Saving);
        acc.add(Checkings);
        acc.add(Food);
        
        for (account temp:acc){
            
            temp.deposit(100);//
            temp.withdraw(50);//
            System.out.println(temp.view());//350, 50, 250
        }
        
        /*
        String[] str = {"Leo", "World"};
        int[] in = {1, 2, 43};
        
        for (String i:str){
            
            System.out.println(i);
        }*/
       
        
        
        
    }
    
    
}

//seperate by accounts
//1
