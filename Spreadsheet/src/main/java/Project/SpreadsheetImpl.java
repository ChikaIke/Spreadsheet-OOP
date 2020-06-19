/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import Interfaces.*;
import static Project.UserInterface.com_error;
import static Project.UserInterface.com_sub;
import static Project.UserInterface.reader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedHashMap;
/**
 *
 * @author slyen
 */
public class SpreadsheetImpl implements Spreadsheet {
    // Collection for Storing the Cell data
      LinkedHashMap<String, Float> vMap = new LinkedHashMap<>(); //value map
      LinkedHashMap<String, String> fMap = new LinkedHashMap<>(); //formula map
      // Record the list to avoid re-calculation
      ArrayList<String> completedList = new ArrayList<>();
      
    /**
     *
     */
   
      public int nRow, nCol;
      public  String[] alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
      
       public SpreadsheetImpl() {
      
    }
      
         public static Boolean newSheet() throws Exception {
            System.out.println("Create a new sheet.");
            //temp strings
            String buf;
            ///
            while (true) {
                  System.out.print( "Input row and col number:");
                  buf = reader.readLine();
                  String[] bufArray = buf.split(" ");
                  if (bufArray.length != 2) {
                        System.out.println(com_sub + com_error);
                  } else {
                        try {
                              nRow = Integer.parseInt(bufArray[0]);
                              nCol = Integer.parseInt(bufArray[1]);
                        } catch (Exception e) {
                              System.out.println(com_sub + com_error);
                              continue;
                        }
                        if (nRow < 1 || nCol < 1) {
                              System.out.println(com_sub + com_error);
                        } else {
                              break; //right 
                        }
                  }
            }
            //assign initial vlaue zero
            for (int i = 1; i <= nRow; i++) {
                  for (int j = 0; j < nCol; j++) {
                      Float put = SpreadsheetImpl.vMap.put(alphabets[j] + i, new Float(0));
                      String put = SpreadsheetImpl.fMap.put(alphabets[j] + i, "0");
                  }
            }
            return true;
      }

   
      
}
