/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author netzl_000
 */
public class RectangleAreaCalculation {
    private int recLength;
    private int recWidth;

    public RectangleAreaCalculation(int recLength, int recWidth) {
        this.recLength = recLength;
        this.recWidth = recWidth;
    }

    public int getRecLength() {
        return recLength;
    }

    public void setRecLength(int recLength) {
        this.recLength = recLength;
    }

    public int getRecWidth() {
        return recWidth;
    }

    public void setRecWidth(int recWidth) {
        this.recWidth = recWidth;
    }
    
    public int rectangleAreaCalculation(int recLength, int recWidth){
        return recLength * recWidth;
    }
}
