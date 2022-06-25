/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fruit;

import cocktail1.Color;
import cocktail1.Fruits;
import java.io.Serializable;

/**
 *
 * @author MohammadSaleh & AhmadHoryzat
 */
public class Banana extends Fruits implements Serializable {
            
    public Banana(double volume) {
        super("Banana", volume, 254,248,10);
    }

    @Override
    //One Liter of Banana approximately equals 0.42 kcal.
    public double getCalories() {
        return volume*0.56;
    }
    
    @Override
      public double getVolume(){
          return volume;
    }
    @Override
      public Color getColor(){
        return color;
    }
}
