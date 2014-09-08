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
public class CircleAreaCalculation {
    
    private double cirRadius;
    private final double pie = 3.14;

    public CircleAreaCalculation(double cirRadius) {
        this.cirRadius = cirRadius;
    }


    public double getCirRadius() {
        return cirRadius;
    }

    public void setCirRadius(double cirRadius) {
        this.cirRadius = cirRadius;
    }
    
    public double circleAreaCalculation(double cirRadius){
        return (cirRadius * (pie * pie));
    }
}
