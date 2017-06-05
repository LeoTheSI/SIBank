/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package General;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LEONA
 */
public class Commands {
    
    
    public static void viewUsers(File file){
        
        //try catch
        //keywords: 
        //url
        //Scanner
        
        
                  
            Scanner scan;
        
            scan = new Scanner(file);
        
            
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());// '/n'
            }
            
        
        
        
        
    }
}
