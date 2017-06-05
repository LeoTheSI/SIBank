/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sibank;

import java.util.ArrayList;

/**
 *
 * @author LEONA
 */
public class account implements interfaceTest{
    
    private int cash = 0;
    private String name;
    private int ACC_NUM;
    //store cash
    //account number
    
    
    //constructor
    //privacy name[same as class](parameterList){}
    public account(int accNum, String nam){
        
        ACC_NUM = accNum;
        name = nam;
    }
    
    //privacy returnType nameOfMethod(parameterList){}
    public String view(){
        
        return ACC_NUM + " " + name + " " + cash;
    }

    @Override
    public int deposit(int dAmount) {
        
        cash += dAmount;
        return 0;
    }

    @Override
    public int withdraw(int wAmount) {

        cash -= wAmount;
        return 0;
    }

    
    
    
    
}
