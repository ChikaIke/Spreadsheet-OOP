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

/**
 *
 * @author slyen
 */
public class Cellimpl implements Interfaces.Cell{

    
    public String col;
    public int row;

    public Cellimpl(int r, String c) {
        this.row=r;
        this.col=c;
    }
    
 public void setRow(int row) {
        this.row = row;
    }

    public int getRow() {
        return row;
    }
    
       public void setCol(String col) {
        this.col = col;
    }

    public String getCol() {
        return col;
    }

 

}
