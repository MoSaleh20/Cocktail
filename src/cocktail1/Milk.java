/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocktail1;

import java.io.Serializable;

/**
 *
 * @authors AhmadHoryzat & MohammadSaleh
 */
public class Milk extends Ingredients implements Serializable{
    private double volume;
    public Milk(double volume) {
        super("milk", 255, 249, 251);
        setVolume(volume);
        super.setCalories(getCalories());
    }
    
    @Override
    public double getCalories(){
        return volume * 0.2;
    }

    @Override
    public double getVolume() {
        return volume;
    }
    
    @Override
    public Color getColor() {
        return color;
    }

    public void setVolume(double volume) {
        if(volume > 0)
            this.volume = volume;
        else
            this.volume = 0;
    }
    
    @Override
    public String getInfo() {
        return super.getInfo() + ", volume=" + volume;
    }
}
