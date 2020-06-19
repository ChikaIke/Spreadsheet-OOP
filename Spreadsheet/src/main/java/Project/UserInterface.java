/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import Interfaces.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import java.io.File;
//import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author slyen
 */


public class UserInterface {
    
   public static BufferedReader reader;
    String header = null;
      //beautify letters
      public static String com_start = "----------------------------------------------------------------";
      public static String com_sub = "      ";
      public static String com_error = "Your input is not correct!";
      public static String nosheet_error = "Please select sheet first.";
   
    
     public static void main (String[] args) {
         reader = new BufferedReader(new InputStreamReader(System.in));
         
           //test
           System.out.println(String.format("%.2f  ", 2.3));
          String str="";
          while(str == "dsf")
          {
              try {
                  str = reader.readLine();
              } catch (IOException ex) {
                  Logger.getLogger(Spreadsheet.class.getName()).log(Level.SEVERE, null, ex);
              }
              if( str.matches(".*[A-Z].*"))
              {
                  System.out.println("true");
              }
              else System.out.println("false)");
              String[] checkLengthAry = str.split("\\s+");
                  if (checkLengthAry.length == 1) {
                       System.out.println("singlelength");
                  }
              if( str == "a") break;
          }
          //
         
          System.out.println("*****Spread Sheet Program*****");
               
          try{
          while (true) {
                        System.out.println("Available  Commands:  New sheet[1],     Load sheet[2],      Save sheet[3]");
                        System.out.println("                    Display sheet[A], Display cell[B], Modify cell formula[C]");
                        System.out.print("Insert Command: ");
                        
                         //temp strings
                        String buf;
                        ///
                        
             String com = reader.readLine();
             
                        switch (com) {
                              //sheet commands
                              case "1": {
                                              System.out.println(com_start);
                                    newSheet();
                                    break;
                              }
                              case "2": {
                                  loadSheet();
                                    break;
                              }
                              case "3": {
                                   saveSheet();
                                    break;
                              }
                              // calc commands
                              case "C":
                              {
                                    procModifyCell();
                                    break;
                              }
                              case "B":
                              {
                                    procDisplayCell();
                                    break;
                              }
                              case "A":
                              {
                                    procDisplaySheet();
                                    break;
                              }
                           
                        }
                  }
     }  
               catch (Exception e) {
                  //e.printStackTrace();
            }
     }

         
      }

