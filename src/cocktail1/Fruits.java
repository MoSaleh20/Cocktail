/*
 * To change  this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocktail1;

import java.io.Serializable;

/**
 *
 * @authors AhmadHoryzat & MohammadSaleh
 */
public abstract class Fruits extends Ingredients implements Serializable {
    protected double volume;
   
    public Fruits( String fruitName, double volume, int r, int g, int b) {
        super(fruitName, r, g, b);
        setVolume(volume);
        super.setCalories(getCalories());
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
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
