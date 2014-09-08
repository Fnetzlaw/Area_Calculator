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
public class TriangleSideCalculation {
    
    private double sideA;
    private double sideB;
    private double sideC;

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
    
    public double sideCCalculation(double sideB, double sideA){
        return Math.sqrt((sideB * sideB) + (sideA * sideA));
    }
    
    public double sideBCalculation(double sideC, double sideA){
        return Math.sqrt((sideA * sideA) - (sideC * sideC));
    }
    
    public double sideACalculation(double sideB, double sideC){
        return Math.sqrt((sideB * sideB) - (sideC * sideC));
    }
}
